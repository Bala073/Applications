package com.evergent.corejava.balakishan.application4;
import java.util.Scanner;

public class HotelManagementSystem extends PaymentModule implements BookingModule {
	static{
		System.out.println("\n\t\t\t\t Welcome To Hotel Booking System");
	}

    private static final int ROOM_COST_NON_AC = 1500;
    private static final int ROOM_COST_AC = 2500;
    private static final double DISCOUNT_3_5_GUESTS = 0.05;
    private static final double DISCOUNT_ABOVE_5_GUESTS = 0.10;
    private static final int ADDITIONAL_COST_SPA = 200;
    private static final int ADDITIONAL_COST_BREAKFAST = 50;
    private static final int ADDITIONAL_COST_PICKUP = 100;

    private final ReportAndExitModule reportAndExitModule;
    private int additionalCost = 0;

    public HotelManagementSystem(int roomCost, int additionalCost, int numberOfDays, int numberOfGuests) {
        super(roomCost, additionalCost, numberOfDays, numberOfGuests);
        reportAndExitModule = new ReportAndExitModule(); // HAS-A relationship
        calculateTotalAmount();
    }

    
    public void roomBooking() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Room Options \t Description \t Charge per Day");
        System.out.println("===============================================");
        System.out.println("A \t NON-AC Room \t\t 1500.00");
        System.out.println("B \t AC Room \t\t 2500.00");
        System.out.println("===============================================");
        System.out.println("Enter your Room code (A, B) : ");
        String roomType = scanner.nextLine();

        int roomCost = 0;
        if (roomType.equalsIgnoreCase("A")) {
            roomCost = ROOM_COST_NON_AC;
        } else if (roomType.equalsIgnoreCase("B")) {
            roomCost = ROOM_COST_AC;
        }

        System.out.println("Enter the number of days:");
        numberOfDays = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of guests:");
        numberOfGuests = Integer.parseInt(scanner.nextLine());

        totalAmount = roomCost * numberOfDays;
        System.out.println("Amount for room booking before discount is " + totalAmount);

        applyDiscount();
    }


    public void additionalServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Additional Services \t Description \t Charge per Unit");
        System.out.println("========================================================================");
        System.out.println("1 \t Spa \t 200.00 per session");
        System.out.println("2 \t Breakfast \t 50.00 per person");
        System.out.println("3 \t Pickup \t 100.00 per person");
        System.out.println("4 \t Return to Main Menu");
        System.out.println("========================================================================");
        System.out.println("Enter your Service code (1, 2, 3, 4) : ");
        int serviceCode = Integer.parseInt(scanner.nextLine());

        if (serviceCode == 4) {
            returnToMainMenu();
            return; // Exit the method and return to the main menu
        }

        System.out.println("Enter number of guests:");
        int guests = Integer.parseInt(scanner.nextLine());

        switch (serviceCode) {
            case 1:
                additionalCost += ADDITIONAL_COST_SPA * guests;
                break;
            case 2:
                additionalCost += ADDITIONAL_COST_BREAKFAST * guests;
                break;
            case 3:
                additionalCost += ADDITIONAL_COST_PICKUP * guests;
                break;
        }

        System.out.println("Your Additional Cost: " + additionalCost);
         
    }

    
    public void returnToMainMenu() {
        System.out.println("Returning to Main Menu...");
    }

    
    void totalAmount() {
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }

    
    public void makePayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to proceed with the payment? (Yes/No)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Yes")) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Please make the payment early.");
        }
    }

    private void applyDiscount() {
        if (numberOfGuests >= 3 && numberOfGuests <= 5) {
            totalAmount -= totalAmount * DISCOUNT_3_5_GUESTS;
        } else if (numberOfGuests > 5) {
            totalAmount -= totalAmount * DISCOUNT_ABOVE_5_GUESTS;
        }
        System.out.println("Amount for room booking after discount is " + totalAmount);
    }

    private void calculateTotalAmount() {
        totalAmount = (totalAmount + additionalCost);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("\n\t\t\t It is our pleasure to welcome you as our VIP guest");
        System.out.println();

        HotelManagementSystem obj = new HotelManagementSystem(0,0,0,0);

        while (true) {
            System.out.println("======================");
            System.out.println(" Hotel Booking Main Menu");
            System.out.println("======================");
            System.out.println("1. Booking Module");
            System.out.println("2. Additional Services");
            System.out.println("3. Payment Module");
            System.out.println("4. Report Module");
            System.out.println("5. Quit Module");
            System.out.println("======================");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    obj.roomBooking();
                    break;
                case 2:
                    obj.additionalServices();
                    break;
                case 3:
                    obj.totalAmount();
                    obj.makePayment();
                    break;
                case 4:
                    obj.reportAndExitModule.displayInvoice(obj.totalAmount, obj.additionalCost);
                    obj.reportAndExitModule.displaySummary(obj.totalAmount, obj.additionalCost);
                    break;
                case 5:
                    obj.reportAndExitModule.quit();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}