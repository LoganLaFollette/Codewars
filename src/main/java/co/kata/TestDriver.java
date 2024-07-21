package co.kata;
import java.util.List;

public class TestDriver {

	static final boolean DEBUG = false;

	public static void main(String[] args) {
		
		System.out.println("Welcome to the sandbox!\n");

		// ASum
		System.out.println("Testing ASum");
		long m = 1977761523443519025L;
		System.out.println(ASum.findNb(m, DEBUG));

		// SumDigPower
		System.out.println("\nTesting SumDigPower");
		System.out.println(SumDigPower.sumDigPow(1, 100));
		List<Long> list = SumDigPower.sumDigPow(1, 100);
		for (long i : list) {
			System.out.print(i + ", ");
		}

		// MySortOdd
		System.out.println("\n\nTesting MySortOdd");
		int[] sorted = MySortOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 });
		for (int i : sorted) {
			System.out.print(i + ", ");
		}

		// HungerGames
		System.out.println("\n\nTesting HungerGames");
		String zoo = "leaves,bug,grass,busker,bug,antelope,cow,grass,lion,leaves,panda,bicycle,little-fish,lion";
		String zoo2 = "fox,bug,chicken,grass,sheep";
		HungerGames.whoEatsWho(zoo);
		System.out.println();

		System.out.println("!!DONE!!");
	}
}
