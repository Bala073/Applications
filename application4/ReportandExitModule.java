package com.evergent.corejava.balakishan.application4;

 class ReportAndExitModule {

    public void displayInvoice(int roomCost, int additionalCost) {
        System.out.println("Invoice Display");
        System.out.println("==================");
        System.out.println("Booking ID: " + (Math.ceil(Math.random() * 10000))); // Example booking ID
        System.out.println("Room Cost: " + roomCost);
        System.out.println("Additional Costs: " + additionalCost);
        System.out.println("Total Amount to be Paid: " + (roomCost + additionalCost));
    }

    public void displaySummary(int roomCost, int additionalCost) {
        System.out.println("Summary of Booking");
        System.out.println("======================");
        System.out.println("Room Cost: " + roomCost);
        System.out.println("Additional Costs: " + additionalCost);
        System.out.println("Total Amount to be Paid: " + (roomCost + additionalCost));
    }

    public void quit() {
        System.out.println("Exiting the System. Thank you for using the Hotel Management System.");
        System.exit(0);
    }
}