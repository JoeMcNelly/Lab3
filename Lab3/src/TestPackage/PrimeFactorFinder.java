package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorFinder {

	public static List<Integer> generateList(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (i == 2){
			primes.add(2);
		}else if(i==3){
			primes.add(3);
		}
		return primes;
	}

}
