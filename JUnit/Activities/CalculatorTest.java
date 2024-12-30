package examples;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
      Calculator calc = new Calculator();
      
      @Test
      public void addTest() {
    	  //perform the add function to get the actual result
    	  //hard assertion below
    	  //int result =  calc.add(10,20);
    	  int result1 =  calc.add(10,20);
    	  int result2 =  calc.add(15,15);
    	  int result3 =  calc.add(5,25);
    	 
    	  //add a assertion statement to verify against expected result
    	 // Assertions.assertEquals(30, result);
    	  
    	  //soft assertions (grouping assertion)
    	  assertAll(
    			 () -> Assertions.assertEquals(30, result1),
    			 () ->  Assertions.assertEquals(30, result2),
    			 () -> Assertions.assertEquals(30, result3)
    	   );
    	 
    	   
    	 
      }
      @Test
      public void multiplyTest() {
    	  //perform the add function to get the actual result
    	  int result =  calc.multiply(10,5);
    	  //add a assertion statement to verify against expected result
    	  Assertions.assertEquals(50, result);
    	 
      }
      
     @ParameterizedTest
     @ValueSource(ints= {10,20,25,100})
     public void paramSqrTest(int num1) {
    	 //Perform the add 
    	 int result =calc.square(num1);
    	 Assertions.assertEquals(num1*num1, result);
    	 
     }
     @ParameterizedTest
     @CsvSource({
    	 "10,90","50,50","80,20"
     })
     public void paramAddTest(int num1,int num2) {
    	 int result1 =calc.add(num1, num2);
    	 Assertions.assertEquals(100, result1);
     }
     @ParameterizedTest
     @CsvFileSource(files = "src/test/resources/input.txt",nullValues= {"N/A","NA","-"})
     public void AggregateTest(ArgumentsAccessor args) {
    	 System.out.println(args.getString(0) + "has only" + (args.getInteger(3)+3) + "sick days remaining");
     }

}
