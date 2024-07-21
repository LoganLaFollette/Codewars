package co.kata;

import java.util.*;

public class HungerGames {

    static Map<String, List<String>> eatsMap = new HashMap<>() {{
        put("antelope", List.of("grass"));
        put("big-fish", List.of("little-fish"));
        put("bug", List.of("leaves"));
        put("bear", Arrays.asList("big-fish", "bug", "chicken", "cow", "leaves", "sheep"));
        put("chicken", List.of("bug"));
        put("cow", List.of("grass"));
        put("fox", Arrays.asList("chicken", "sheep"));
        put("giraffe", List.of("leaves"));
        put("lion", Arrays.asList("antelope", "cow"));
        put("panda", List.of("leaves"));
        put("sheep", List.of("grass"));
    }};

    public static HungerGamesResult whoEatsWho(final String zoo) {
        List<String> zooList = new LinkedList<>(Arrays.asList(zoo.split(",")));
        List<String> output = new ArrayList<String>();
        int i = 0;

        while (i < zooList.size()) {
            boolean inBoundsLeft = (i - 1 >= 0);
            if (inBoundsLeft && checkLeft(zooList.get(i), zooList.get(i - 1))) {
                output.add(eats(zooList.get(i), zooList.get(i - 1)));

                zooList.remove(i - 1);
                i = i - 1;
                continue;
            }
            boolean inBoundsRight = (i + 1 < zooList.size());
            if (inBoundsRight && checkRight(zooList.get(i), zooList.get(i + 1))) {
                output.add(eats(zooList.get(i), zooList.get(i + 1)));

                zooList.remove(i + 1);
                continue;
            }
            i++;
        }
        HungerGamesResult results = new HungerGamesResult();
        results.setInputZoo(zoo);
        results.setEventLog(String.join(",", output));
        results.setRemainingZoo(String.join(",", zooList));
        System.out.println(results);
        return results;
    }

    public static String eats(String animal1, String animal2) {
        return animal1 + " eats " + animal2;
    }

    public static boolean checkRight(String currZoo, String nextZoo) {
        if (nextZoo == null || eatsMap.get(currZoo) == null) {
            return false;
        } else {
            return eatsMap.get(currZoo).contains(nextZoo);
        }
    }

    public static boolean checkLeft(String currZoo, String prevZoo) {
        if (prevZoo == null || eatsMap.get(currZoo) == null) {
            return false;
        } else {
            return eatsMap.get(currZoo).contains(prevZoo);
        }
    }

}

class HungerGamesResult {
    private String inputZoo;
    private String eventLog;
    private String remainingZoo;

    public String getInputZoo() {
        return inputZoo;
    }

    public void setInputZoo(String inputZoo) {
        this.inputZoo = inputZoo;
    }

    public String getEventLog() {
        return eventLog;
    }

    public void setEventLog(String eventLog) {
        this.eventLog = eventLog;
    }

    public String getRemainingZoo() {
        return remainingZoo;
    }

    public void setRemainingZoo(String remainingZoo) {
        this.remainingZoo = remainingZoo;
    }

    public String toString() {
        return "Hunger Games Results!\n" +
                "Input Zoo: " + this.inputZoo + "\n" +
                "Output Zoo: " + this.remainingZoo + "\n" +
                "Events: " + this.eventLog + "\n";

    }
}