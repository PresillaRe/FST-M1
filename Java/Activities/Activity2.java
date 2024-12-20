package activities;

public class Activity2 {
	public static void main (String[] args){
		 //create the object for the class
		Activity2 actObj = new Activity2();
		 //create the integer array
	int[] nums = { 10,77,10,54 ,-11,10};
//set the number  to search for
	int searchNum =10;
	int fixedSum = 30;
	//call the result function and print the result
	System.out.println("Result:" + actObj.result(nums,searchNum,fixedSum));
}
	 public boolean result(int[]nums, int searchNum, int fixedSum) {
		 //temp variable to hold the calculated sum
		 int tempSum=0;
		 
		 //loop through the array to calculate sum
		 for(int number: nums) {
			 //check if the value is the searchNum
			 if(number == searchNum) {
				 //add the avlue
				 tempSum += searchNum;
			 }
			 //check if tempSum is greater than fixedSum
			 if(tempSum > fixedSum) {
				 //Condition fails,break loop
				 break;
			 }
		 }
		  return fixedSum == tempSum;
	 }
}
