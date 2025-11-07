package task.weak1;

import java.util.*;//Interface Task 2

public class MovieTicketQueue {

    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.add("Alice");
        ticketQueue.add("Bob");
        ticketQueue.add("Charlie");
        ticketQueue.add("David");
        System.out.println("First person in the queue: " + ticketQueue.peek());
        System.out.println("\nIssuing Tickets:");
        while (!ticketQueue.isEmpty()) {
            String currentCustomer = ticketQueue.poll();  
            System.out.println("Issuing ticket to: " + currentCustomer);
        }
        System.out.println("\nAll customers have been served. Queue is empty.");
    }
}
