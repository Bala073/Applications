package com.evergent.corejava.QueueApplication;

import java.util.ArrayDeque;

public class SupportTicketSystem {
	 // The queue to hold support tickets
    private ArrayDeque<String> ticketQueue = new ArrayDeque<>();
    
    private void addTicket(String ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }
    private void processNextTicket() {
        String ticket = ticketQueue.poll(); // Retrieves and removes the head of the queue
        if (ticket == null) {
            System.out.println("No tickets to process.");
        } else {
            System.out.println("Processing ticket: " + ticket);
        }
    }
    private String peekNextTicket() {
        String ticket = ticketQueue.peek(); // Retrieves but does not remove the head of the queue
        if (ticket == null) {
            return "No tickets in the queue.";
        }
        return ticket;
    }
    private void displayQueue() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
        } else {
            System.out.println("Current tickets in the queue: " + ticketQueue);
        }
    }

	public static void main(String[] args) {
		 SupportTicketSystem system = new SupportTicketSystem();
	        system.simulateTicketingSystem();
	    }

	    // Method to simulate the ticketing system operations
	    private void simulateTicketingSystem() {
	        // Adding tickets to the queue
	        addTicket("Issue with login");
	        addTicket("Unable to reset password");
	        addTicket("Error in payment processing");

	        // Display the queue
	        displayQueue();

	        // Peek at the next ticket
	        System.out.println("Next ticket to process: " + peekNextTicket());

	        // Process tickets
	        processNextTicket();
	        processNextTicket();
	        processNextTicket();

	        // Try processing when the queue is empty
	        processNextTicket();

	}

}
