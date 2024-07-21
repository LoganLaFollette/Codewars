package co.kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MySortOdd {

    public static int[] sortArray(int[] array) {

        int arraySize = array.length;
        ArrayList<Integer> odds = new ArrayList<Integer>();

        for (int k : array) {
            if (k % 2 == 1) odds.add(k);
        }

        Collections.sort(odds);
        Iterator<Integer> iter = odds.iterator();

        for (int j = 0; j < arraySize; j++) {
            if (array[j] % 2 == 1) array[j] = iter.next();
        }

        return array;
    }

}
