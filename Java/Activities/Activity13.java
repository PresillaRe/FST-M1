package activities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	 public static void main(String[] args) {
		 //create the object
		 Scanner sc = new  Scanner(System.in);
		 List<Integer> numArr = new ArrayList<>();
		 Random indexGen = new Random();
		 
		//statement to show users to indicate when they can type
		 System.out.println("Enter the no.for the list");
		 System.out.println("Enter a EOL or any non-integer character to stop:");
	 //loop to take only integers from console
	 while(sc.hasNext()) {
		 numArr.add(sc.nextInt());
	 }
	 //Generate random index
	 System.out.println(numArr.size());
	 int generatedIndex = indexGen.nextInt(numArr.size());
	 //print the random index and the value at that index
	 System.out.println("Random index generated:" + generatedIndex);
	 System.out.println("The number at generated index is:" +numArr.get(generatedIndex));
	 } 
	 
	 
}
