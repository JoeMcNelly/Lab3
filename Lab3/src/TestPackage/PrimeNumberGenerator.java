package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public List<Integer> generateList(int i) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for(int primeCandidate=2;primeCandidate<i;primeCandidate++){
			if(primeCandidate>2 && primeCandidate%2==0)
				continue;
			boolean isPrime = true;
			for(int j=2;j<(primeCandidate/2);j++){
				if (primeCandidate%j==0){
					isPrime = false;
					break;
				}
				
			}
			
			if(isPrime)
				primes.add(primeCandidate);
			
		}
		return primes;
	}
	

}
