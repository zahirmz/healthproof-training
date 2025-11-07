package task.weak1;

import java.util.*;// Interface Task3

public class CityDirectory {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        cityList.add("New York");
        cityList.add("Los Angeles");
        cityList.add("Chicago");
        cityList.add("Houston");
        System.out.println("City Directory: " + cityList);
        
        
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add City");
            System.out.println("2. Search City");
            System.out.println("3. Remove City");
            System.out.println("4. Display Cities");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the city name to add: ");
                    String cityToAdd = scanner.nextLine();
                    cityList.add(cityToAdd);
                    System.out.println("City added: " + cityToAdd);
                    break;

                case 2:
                    System.out.print("Enter the city name to search: ");
                    String cityToSearch = scanner.nextLine();
                    if (cityList.contains(cityToSearch)) {
                        System.out.println("City found: " + cityToSearch);
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the city name to remove: ");
                    String cityToRemove = scanner.nextLine();
                    if (cityList.remove(cityToRemove)) {
                        System.out.println("City removed: " + cityToRemove);
                    } else {
                        System.out.println("City not found to remove.");
                    }
                    break;

                case 4:
                    System.out.println("Updated City Directory: " + cityList);
                    break;

                case 5:
                    System.out.println("Exiting the City Directory.");
                    scanner.close();
                    return; 

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
