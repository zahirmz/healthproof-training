package task.weak1;   //Interface TASK1


interface DeliveryService {

	void deliver(String location);
}
abstract class FoodOrder implements DeliveryService {
 
	 int orderId;
	 String customerName;
	
	
	 public FoodOrder(int orderId, String customerName) {
	     this.orderId = orderId;
	     this.customerName = customerName;
	 }
	
	 
	 public void orderDetails() {
	     System.out.println("Order ID: " + orderId);
	     System.out.println("Customer Name: " + customerName);
	 }
	
	 public abstract void calculateBill();
}


class ZomatoOrder extends FoodOrder {

	 double foodCost;
	
	 
	 public ZomatoOrder(int orderId, String customerName, double foodCost) {
	     super(orderId, customerName); 
	     this.foodCost = foodCost;
	 }
	
	
	 @Override
	 public void calculateBill() {
	     double bill = foodCost + 30;  
	     System.out.println("Total Bill for Zomato Order: ₹" + bill);
	 }
	
	
	 @Override
	 public void deliver(String location) {
	     System.out.println("Zomato order being delivered to: " + location);
	 }
}

class SwiggyOrder extends FoodOrder {
 
	 double foodCost;
	
	 
	 public SwiggyOrder(int orderId, String customerName, double foodCost) {
	     super(orderId, customerName);  
	     this.foodCost = foodCost;
	 }
	
	
	 @Override
	 public void calculateBill() {
	     double bill = foodCost + 40;  
	     System.out.println("Total Bill for Swiggy Order: ₹" + bill);
	 }
	
	 
	 @Override
	 public void deliver(String location) {
	     System.out.println("Swiggy order being delivered to: " + location);
	 }
}

public class OnlineFoodDeliverySystem {
 public static void main(String[] args) {

     FoodOrder zomatoOrder = new ZomatoOrder(101, "Alice", 250);
     zomatoOrder.orderDetails();  
     zomatoOrder.calculateBill();
     zomatoOrder.deliver("123 Main St, City");  

     System.out.println();
     FoodOrder swiggyOrder = new SwiggyOrder(102, "Bob", 300);
     swiggyOrder.orderDetails(); 
     swiggyOrder.calculateBill(); 
     swiggyOrder.deliver("456 Oak Rd, Town");  
 }
}
