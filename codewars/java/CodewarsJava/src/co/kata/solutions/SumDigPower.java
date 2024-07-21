package co.kata.solutions;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> solutions = new ArrayList<>();

        for (long i = a; i <= b; i++) {

            long sum = 0;
            long x = i;
            int exp = String.valueOf(x).length();

            while (x > 0L) {
                long digit = x % 10;
                sum += (long) Math.pow(digit, exp);
                x /= 10;
                exp--;

                if (sum == i && exp == 0) solutions.add(i);
            }
        }
        return solutions;
    }
}