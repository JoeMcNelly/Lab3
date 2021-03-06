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
	@Test
	public void test3(){
		assertEquals(list(3),PrimeFactorFinder.generateList(3));
	}
	@Test
	public void test4(){
		assertEquals(list(2,2),PrimeFactorFinder.generateList(4));
	}
	@Test
	public void test6(){
		assertEquals(list(2,3),PrimeFactorFinder.generateList(6));
	}
	@Test
	public void test8(){
		assertEquals(list(2,2,2),PrimeFactorFinder.generateList(8));
	}
	@Test
	public void test9(){
		assertEquals(list(3,3),PrimeFactorFinder.generateList(9));
	}
	@Test
	public void test325115(){
		assertEquals(list(5,7,7,1327),PrimeFactorFinder.generateList(325115));
	}

}
