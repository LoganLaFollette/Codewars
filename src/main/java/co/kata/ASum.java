package co.kata;

public class ASum {
    public static long findNb(long m, boolean debug) {
        int cubePile = 0;
        long sum = 0L;

        while (sum < m) {
            cubePile++;
            sum += (long) Math.pow(cubePile, 3);
            if (debug) {
                System.out.println("Current # of cubes: " + cubePile);
                System.out.println("Current cube volume: " + sum);
                System.out.println("Target volume: " + m + "\n");
            }
        }
        if (sum != m) return -1;
        return cubePile;
    }
}
	
	
	
	

