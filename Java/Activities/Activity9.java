package activities;


import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Activity9 {
 public static void main(String[] args) {
	 //create an ArrayList
	 List<String> myList = new ArrayList<>();
	 
	 //add 5 names to the list
	 myList.add("Apple");
	 myList.add("Mango");
	 myList.add("Oragne");
	 myList.add(1,"Papaya");
	 myList.add(3,"Melon");
	 
	 //print all elements using a loop
	 for(String name:myList) {
		 System.out.println(name);
	 }
	 
	 /*
	 Iterator<String> iter = myList.iterator();
	while(iter.hasNext()) {
		iter.next();
		System.out.println(iter.next());
		*/
	 
	 //print  the 3rd element
	 System.out.println("The third element is: "  +myList.get(2));
	 
	 //search for a specific name
	 System.out.println("Is the Ricky in the list?: "  +myList.contains("Ricky"));
	 //print the size of the list
	 System.out.println("No. of elements in the list befor remove: "  +myList.size());
	 //remove a element
	 myList.remove(1);
	 myList.remove("Melon");
	 //print the size of the list after remove()
	 System.out.println("No. of elements in the list after remove: "  +myList.size());
	}
	 		
 }
