package task.weak1;//Interface

import java.util.*;

interface DirectoryItem {
	 String getName();
	 String getAddress();
	 String getDescription();
}

class City implements DirectoryItem {
	 private String name;
	 private String address;
	 private String description;
	
	 City(String name, String address, String description) {
	     this.name = name;
	     this.address = address;
	     this.description = description;
	 }
	
	 @Override
	 public String getName() {
	     return name;
	 }
	
	 @Override
	 public String getAddress() {
	     return address;
	 }
	
	 @Override
	 public String getDescription() {
	     return description;
	 }
}

class Building implements DirectoryItem {
	 private String name;
	 private String address;
	 private String description;
	
	 Building(String name, String address, String description) {
	     this.name = name;
	     this.address = address;
	     this.description = description;
	 }
	
	 @Override
	 public String getName() {
	     return name;
	 }
	
	 @Override
	 public String getAddress() {
	     return address;
	 }
	
	 @Override
	 public String getDescription() {
	     return description;
	 }
}
class ResidentialArea implements DirectoryItem {
	 private String name;
	 private String address;
	 private String description;
	
	 ResidentialArea(String name, String address, String description) {
	     this.name = name;
	     this.address = address;
	     this.description = description;
	 }
	
	 @Override
	 public String getName() {
	     return name;
	 }
	
	 @Override
	 public String getAddress() {
	     return address;
	 }
	
	 @Override
	 public String getDescription() {
	     return description;
	 }
}

class CityDirectory {
	 private List<DirectoryItem> items;
	
	 CityDirectory() {
	     items = new ArrayList<>();
	 }
	
	 public void addItem(DirectoryItem item) {
	     items.add(item);
	 }
	
	 public void displayAllItems() {
	     for (DirectoryItem item : items) {
	         System.out.println("Name: " + item.getName());
	         System.out.println("Address: " + item.getAddress());
	         System.out.println("Description: " + item.getDescription());
	         System.out.println("------------------------");
	     }
	 }
	 public DirectoryItem searchByName(String name) {
	     for (DirectoryItem item : items) {
	         if (item.getName().equalsIgnoreCase(name)) {
	             return item;
	         }
	     }
	     return null;
	 }
}


public class CityDirectoryTest {
	 public static void main(String[] args) {
	 
	     CityDirectory directory = new CityDirectory();
	
	     directory.addItem(new City("New York", "NYC, USA", "A major city in the USA."));
	     directory.addItem(new Building("Empire State Building", "350 5th Ave, New York, NY", "An iconic skyscraper."));
	     directory.addItem(new ResidentialArea("Brooklyn Heights", "Brooklyn, NY", "A charming residential neighborhood."));
	
	     System.out.println("Displaying All Directory Items:");
	     directory.displayAllItems();
	
	     String searchName = "Empire State Building";
	     DirectoryItem foundItem = directory.searchByName(searchName);
	     if (foundItem != null) {
	         System.out.println("\nSearch Result for '" + searchName + "':");
	         System.out.println("Name: " + foundItem.getName());
	         System.out.println("Address: " + foundItem.getAddress());
	         System.out.println("Description: " + foundItem.getDescription());
	     } else {
	         System.out.println("\nItem not found in the directory.");
	     }
	 }
}
