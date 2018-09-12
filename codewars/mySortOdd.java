package codewars;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class mySortOdd {

  static int currIndex = 0;
  
  public static int[] sortArray(int[] array) {
	  
  
  int arraySize = array.length; 
  ArrayList<Integer> odds = new ArrayList<Integer>();
  
    for (int i = 0; i < arraySize; i++) {
      if (array[i] % 2 == 1) odds.add(array[i]);
    }
    
    Collections.sort(odds);
    Iterator<Integer> iter = odds.iterator();

    for (int j = 0; j < arraySize; j++) { 	
    	if (array[j] % 2 == 1) array[j] = iter.next();
    }
   
    
    return array;
  }
    
}
