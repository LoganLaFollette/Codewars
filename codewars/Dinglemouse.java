package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Dinglemouse {

  public static String[] whoEatsWho(final String zoo) {
    // Your code here
    List<String> zooList = new LinkedList<String>(Arrays.asList(zoo.split("\\s*,\\s*")));
    Map<String,List<String>> multimap = new HashMap<>();
    List<String> output = new ArrayList<String>();
    output.add(zoo);
    
    multimap.put("antelope", Arrays.asList("grass"));
    multimap.put("big-fish", Arrays.asList("little-fish"));
    multimap.put("bug", Arrays.asList("leaves"));
    multimap.put("bear",Arrays.asList("big-fish", "bug", "chicken", "cow", "leaves", "sheep"));
    multimap.put("chicken",Arrays.asList("bug"));
    multimap.put("cow", Arrays.asList("grass"));
    multimap.put("fox", Arrays.asList("chicken", "sheep"));
    multimap.put("giraffe",Arrays.asList("leaves"));
    multimap.put("lion", Arrays.asList("antelope", "cow"));
    multimap.put("panda",Arrays.asList("leaves"));
    multimap.put("sheep", Arrays.asList("grass"));
    
    int iter = zooList.size();
    
	for (int i=0;i<iter;i++) {
		boolean inBoundsLeft = (i-1 >= 0) && (i-1 < zooList.size());
		if (inBoundsLeft && checkLeft(multimap, zooList.get(i), zooList.get(i-1))) {
			output.add(eats(zooList.get(i), zooList.get(i-1)));
			
			zooList.remove(i-1);
			iter = zooList.size();
			i=-1;
			continue;
		}
		boolean inBoundsRight = (i+1 >= 0) && (i+1 < zooList.size());
		if (inBoundsRight && checkRight(multimap, zooList.get(i), zooList.get(i+1))) {
			output.add(eats(zooList.get(i), zooList.get(i+1)));
			zooList.remove(i+1);
			iter = zooList.size();
			i=-1;
			continue;
		}
	}
	output.add(String.join(",", zooList));
    System.out.println(String.join(",", output));
    String[] outputAry = output.toArray(new String[output.size()]);
    return  outputAry;
  }
  
  public static String eats(String animal1, String animal2) {
	  return animal1 + " eats " + animal2;
  }
  
  public static boolean checkRight(Map<String,List<String>> eatsMap, String currZoo, String nextZoo) {
	if (nextZoo == null || eatsMap.get(currZoo) == null) {
		return false;
	} else {
		return eatsMap.get(currZoo).contains(nextZoo);
	}
	  
  }
  
  public static boolean checkLeft(Map<String,List<String>> eatsMap, String currZoo, String prevZoo) {
	  if (prevZoo == null || eatsMap.get(currZoo) == null) {
			return false;
		} else {
			return eatsMap.get(currZoo).contains(prevZoo);
		}
  }

}