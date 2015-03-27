package TestPackage;

import java.util.Arrays;
import java.util.Collection;
 
import java.util.List;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestPrimeGenerator {
   private Integer inputNumber;
   private List<Integer> expectedResult;
   private PrimeNumberGenerator primeNumberGenerator;

   @Before
   public void initialize() {
	   primeNumberGenerator = new PrimeNumberGenerator();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public TestPrimeGenerator(Integer inputNumber, 
      List<Integer> expectedResult) {
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   @Parameterized.Parameters
   public static Collection<Object[]> primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, list() },
         { 3, list(2)},
         {4, list(2,3)},
         {6, list(2,3,5)},
         {8, list(2,3,5,7)},
         {12, list (2,3,5,7,11)},
         {102, list(2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101)}
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
      assertEquals(expectedResult, 
    		  primeNumberGenerator.generateList(inputNumber));
   }
   
   private static List<Integer> list(Integer...integers){
		return Arrays.asList(integers);
		
	}
}