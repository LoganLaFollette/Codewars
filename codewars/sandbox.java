package codewars;
import java.util.List;

public class sandbox {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the sandbox!");
		
		long m = 1977761523443519025L;
		boolean debug = true;
		//System.out.println(ASum.findNb(m, debug));
		
		System.out.println(SumDigPower.sumDigPow(1, 100));
		List<Long> list = SumDigPower.sumDigPow(1, 100);
		for (long i : list) {
			System.out.println(i + ", ");
		}
		
		int[] sorted = mySortOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 });
		
		for (int i : sorted) {
			System.out.print(i + " ");
		}
//		String zoo = "bug,grass,busker,bug,cow,grass,lion,leaves,panda,bicycle,little-fish,lion";
//		Dinglemouse.whoEatsWho(zoo);
	}

}
