package task.weak1;

import java.util.ArrayList;
import java.util.HashMap;

public class Cars {
    String name;
    String countryOfOrigin;
    public Cars(String name, String countryOfOrigin) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
    }
    
    @Override
    public String toString() {
        return name + " (" + countryOfOrigin + ")";
    }
    
    public static void main(String[] args) {
        ArrayList<Cars> cars = new ArrayList<>();
        cars.add(new Cars("Toyota Corolla", "Japan"));
        cars.add(new Cars("BMW 3 Series", "Germany"));
        cars.add(new Cars("Ford Mustang", "USA"));
        cars.add(new Cars("Honda Civic", "Japan"));
        cars.add(new Cars("Audi A4", "Germany"));
        cars.add(new Cars("Chevrolet Camaro", "USA"));
        cars.add(new Cars("Nissan Altima", "Japan"));
        HashMap<String, ArrayList<String>> carClassification = new HashMap<>();
        for (Cars car : cars) {
            carClassification
                .computeIfAbsent(car.countryOfOrigin, k -> new ArrayList<>())
                .add(car.name);
        }
        System.out.println("Car Classification by Country of Origin:\n");
        for (String country : carClassification.keySet()) {
            System.out.println(country + " Cars:");
            for (String car : carClassification.get(country)) {
                System.out.println("  - " + car);
            }
            System.out.println();  
        }
    }
}
