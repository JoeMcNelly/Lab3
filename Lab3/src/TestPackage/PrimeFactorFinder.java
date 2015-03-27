package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorFinder {

	public static List<Integer> generateList(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int candidate = 2;
		while (i > 1) {
			for (; i % candidate == 0; i /= candidate) {
				primes.add(candidate);
			}
			candidate++;
		}
		if (i > 1)
			primes.add(i);
		return primes;
	}

}
