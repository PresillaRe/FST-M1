package activities;

import java.util.HashMap;

public class Activity11 {
	public static void main(String[] args) {
	
		 HashMap<Integer,String> hashMap = new HashMap<>();
		 
		 //adding elements to hashSet
		 hashMap.put(1,"Red");
		 hashMap.put(2,"Green");
		 hashMap.put(3,"Blue");
		 hashMap.put(4,"White");
		 hashMap.put(5,"Black");
		 
		 
		 
		 //print  the Map
		 System.out.println("Original map: "  + hashMap);
		 
		
		 
		 //remove one element
		 hashMap.remove(3);
		 //map after removing a color
		 System.out.println("After Removing Blue: "  + hashMap);
		 //check if green is present
		 if( hashMap.containsValue("Green")) {
			 System.out.println("Green exists in the Map " );
		 }else {
			 System.out.println("Green does not exist in the Map");
		 }
		 //Print size of the map
		 System.out.println("No. of pairs in the Map is: "  + hashMap.size());
		 //loop through map
		 for (int key:hashMap.keySet()) {
		 System.out.println(hashMap.get(key));
		}
}
	
}
