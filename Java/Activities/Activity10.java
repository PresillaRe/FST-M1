package activities;

import java.util.HashSet;

public class Activity10 {
	public static void main(String[] args) {
		 //create an ArrayList
		 HashSet<String> hs = new HashSet<>();
		 
		 //adding elements to hashSet
		hs.add("A");
		hs.add("M");
		hs.add("O");
		hs.add("P");
		hs.add("M");
		 
		 
		 
		 //print  HashSet
		 System.out.println("Original HashSet: "  + hs);
		 
		 //print size of HashSet
		 System.out.println("Size of HashSet: "  + hs.size());
		 
		 //remove a element
		 System.out.println("Removing A from HashSet: "  + hs.remove("A"));
		 //remove element that is not present
		 if( hs.remove("Z")) {
			 System.out.println("Z removed form the Set " );
		 }else {
			 System.out.println("Z is not present in the Set");
		 }
		 //Search for element
		 System.out.println("Checking if M is present: "  + hs.contains("M"));
		 //print updated HashSet
		 
		 System.out.println("Updated HashSet: "  +hs);
		}
}
