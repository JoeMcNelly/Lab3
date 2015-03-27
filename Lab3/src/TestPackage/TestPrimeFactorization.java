package TestPackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestPrimeFactorization {
	
	private List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
		
	}

	@Test
	public void test1() {
		assertEquals(list(), PrimeFactorFinder.generateList(1));
	}
	@Test
	public void test2(){
		assertEquals(list(2),PrimeFactorFinder.generateList(2));
	}

}
