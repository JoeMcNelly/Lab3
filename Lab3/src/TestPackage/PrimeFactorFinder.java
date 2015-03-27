package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorFinder {

	public static List<Integer> generateList(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primes = new ArrayList<Integer>();
		while (i % 2 == 0){
			primes.add(2);
			i/=2;
		}
		if (i > 1)
			primes.add(i);
		return primes;
	}

}
