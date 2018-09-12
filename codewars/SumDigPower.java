package codewars;
	import java.util.ArrayList;
	import java.util.List;

	class SumDigPower {
	    
	    public static List<Long> sumDigPow(long a, long b) {
	        List<Long> solutions = new ArrayList<Long>();
	        
	        for (long i = a; i <= b; i++) {
	        
	        long sum = 0;
	        long x = i;
	        int length = String.valueOf(x).length();
	        int exp = length;
	        
	        while (x > 0L)
	          {
	            long digit = x%10;
	            sum += Math.pow(digit, exp);
	            x /= 10;
	            exp--;
	            
	            if (sum == i && exp == 0) solutions.add(i);
	          }
	        
	            
	        
	    }
	     return solutions;
	  }
	}