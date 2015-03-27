package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

	public List<Integer> generateList(int i) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();

		for(int k=2;k<i;k++){
			if(k>2 && k%2==0)
				continue;
			boolean isPrime = true;
			for(int j=2;j<(k/2);j++){
				if (k%j==0){
					isPrime = false;
					break;
				}
				
			}
			
			if(isPrime)
				primes.add(k);
			
		}
		return primes;
	}
	

}
