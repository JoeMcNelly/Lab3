package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public List<Integer> generateList(int i) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (i>2)
			primes.add(2);
		if (i>3)
			primes.add(3);
		if (i>5)
			primes.add(5);
		if (i>7)
			primes.add(7);
		return primes;
	}

}
