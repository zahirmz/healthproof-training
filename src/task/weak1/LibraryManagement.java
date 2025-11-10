package task.weak1;
//Interface

interface LibraryItem {
	 String getItemInfo();
	 void borrowItem();
	 void returnItem();
}


abstract class LibraryMaterial implements LibraryItem {
		 protected String itemId;
		 protected boolean isAvailable;
	 
	 public LibraryMaterial(String itemId) {
	     this.itemId = itemId;
	     this.isAvailable = true;
	 }
	
	 public String getItemInfo() {
	     return "Item ID: " + itemId + ", Available: " + (isAvailable ? "Yes" : "No");
	 }
	 
	 public void borrowItem() {
	     if (isAvailable) {
	         isAvailable = false;
	         System.out.println("Item " + itemId + " has been borrowed.");
	     } else {
	         System.out.println("Item " + itemId + " is currently not available.");
	     }
	 }
	 
	 public void returnItem() {
	     if (!isAvailable) {
	         isAvailable = true;
	         System.out.println("Item " + itemId + " has been returned.");
	     } else {
	         System.out.println("Item " + itemId + " was not borrowed.");
	     }
	 }
}

class Book extends LibraryMaterial {
	 private String title;
	 private String author;
	 
	 public Book(String itemId, String title, String author) {
	     super(itemId);
	     this.title = title;
	     this.author = author;
	 }
	 
	 @Override
	 public String getItemInfo() {
	     return "Book: " + title + " by " + author + ", " + super.getItemInfo();
	 }
}

class Magazine extends LibraryMaterial {
 private String title;
 private String issueDate;
 
 public Magazine(String itemId, String title, String issueDate) {
     super(itemId);
     this.title = title;
     this.issueDate = issueDate;
 }
 
 @Override
 public String getItemInfo() {
     return "Magazine: " + title + " - " + issueDate + ", " + super.getItemInfo();
 }
}

public class LibraryManagement {
 public static void main(String[] args) {
     LibraryMaterial book = new Book("B001", "Java Programming", "John Doe");
     LibraryMaterial magazine = new Magazine("M001", "Tech Monthly", "September 2025");

     System.out.println(book.getItemInfo());
     System.out.println(magazine.getItemInfo());

    
     book.borrowItem();
     magazine.borrowItem();

     
     book.returnItem();
     magazine.returnItem();
 }
}
