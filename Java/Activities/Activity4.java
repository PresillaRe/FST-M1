package activities;

import java.util.Arrays;

public class Activity4 {
  public static void main(String[] args) {
	  Activity4 actObj = new Activity4();
	  //create the unsorted array
	  int[] nums = {10,9,47,210,24,5,26};
	  //call the function to sort the array
	  actObj.insertionSort(nums);
	  System.out.println("Sorted array:" +Arrays.toString(nums));
  }
  public void insertionSort(int[] nums) {
	  //set the size of the array
	  int size = nums.length;
	  //loop through the array,
	  //starting from the second value
	  for(int i=1; i<size;i++) {
		  //set the key value and the first compare value
		  int key = nums[i];
		  int j = i-1;
		  //check if key is lesser 
		  //if it is,swap it with the left value
		  while (j>=0 && key < nums[j]) {
			  nums[j+1]= nums[j];
			  --j;
		  }
		  //make the next value the key
		  nums[j+1] =key;
	  }
  }
}
