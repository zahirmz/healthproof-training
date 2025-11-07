package task.weak1;   //Encapsulation TASK1
class Product {
	 private String name;
	 private double price;
	 private int stock;
	 public Product(String name, double price, int stock) {
	     this.name = name;
	     setPrice(price);  
	     setStock(stock);  
	 }
	
	 public String getName() {
	     return name;
	 }
	
	 public void setName(String name) {
	     this.name = name;
	 }
	 public double getPrice() {
	     return price;
	 }
	
	 public void setPrice(double price) {
	     if (price < 0) {
	         System.out.println("Price cannot be negative. Setting price to 0.");
	         this.price = 0;  
	     } else {
	         this.price = price;
	     }
	 }

	 public int getStock() {
	     return stock;
	 }
	
	 public void setStock(int stock) {
	     if (stock < 0) {
	         System.out.println("Stock cannot be negative. Setting stock to 0.");
	         this.stock = 0; 
	     } else {
	         this.stock = stock;
	     }
	 }
	
	 public void applyDiscount(double percent) {
	     if (percent < 0) {
	         System.out.println("Discount percentage cannot be negative.");
	     } else {
	         price -= price * percent / 100; 
	     }
	 }
	
	 public void displayDetails() {
	     System.out.println("Product Name: " + name);
	     System.out.println("Price: ₹" + price);
	     System.out.println("Stock: " + stock);
	 }
}

public class OnlineShopping {
	 public static void main(String[] args) {
	    
	     Product product = new Product("Laptop", 50000, 10);
	     System.out.println("Initial Product Details:");
	     product.displayDetails();
	     product.applyDiscount(10);
	     System.out.println("\nProduct Details After Discount:");
	     product.displayDetails();
 }
}
