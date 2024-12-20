package activities;

 abstract class Book {
	 //variable to hold the book's title
	 String title;
	 //abstract method to set the title
	 abstract void setTitle(String title);
	 //concrete method to return the title of book
	public String getTitle() {
		return this.title;
	}
	
 }
 //creating 2nd class
 
 class MyBook extends Book{
	 //implement the setTitle function
	 public void setTitle(String title) {
		 this.title = title;
	 }
	 
 }
public class Activity5 {
    public static void main(String[] args) {
    	MyBook bookObj = new MyBook();
    	bookObj.setTitle("The Originals");
    	System.out.println(bookObj.getTitle());
    }
}
