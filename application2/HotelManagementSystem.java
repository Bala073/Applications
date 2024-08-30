package com.evergent.corejava.balakishan.application2;

import java.io.IOException;
import java.util.Scanner;

public class HotelManagementSystem {
	enum module1 {B, P, R, E}; // B - Booking Module, P - Payment Module, R - Report Module, E - Quit
    enum submodule1 {R, S, M}; // R - Room Booking, S - Additional Services, M - Return to Main Menu
    enum submodule2 {T, P, M}; // T - Total Amount, P - Make Payment, M - Return to Main Menu
    enum submodule3 {I, S, M}; // I - Invoice, S - Summary, M - Return to Main Menu
    enum roomcode {A, B}; // Room codes
    static int roomCost;
    static int additionalCost;
    static int numberOfDays;
    static int numberOfGuests;
    static int totalAmount;
    static int discountedAmount;
    static int noOfPeople;


	public static void main(String[] args)throws IOException {
		 String module = null;
	        Scanner br = new Scanner(System.in);
	        System.out.println("\t\t\t==============================================");
	        System.out.println("\t\t \t\t Welcome To HOTEL BOOKING SYSTEM");
	        System.out.println("\t\t\t==============================================");

	        while (true) {

	            System.out.println("======================");
	            System.out.println(" Hotel Booking Main Menu");
	            System.out.println("======================");
	            System.out.println("Enter B for Booking Module");
	            System.out.println("Enter P for Payment Module");
	            System.out.println("Enter R for Report Module");
	            System.out.println("Enter E for Quit Module");
	            System.out.println("======================");
	            System.out.println("Enter your Module code (B, P, R, E) : ");

	            module = br.nextLine();
	            System.out.println("You entered module is  : ");

	            switch (module1.valueOf(module)) {

	                case B:
	                    System.out.println("Booking Module");
	                    System.out.println("======================");
	                    System.out.println("Enter R for Room Booking");
	                    System.out.println("Enter S for Additional Services");
	                    System.out.println("Enter M for Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Submodule code (R, S, M) : ");

	                    module = br.nextLine();
	                    switch (submodule1.valueOf(module)) {

	                        case R:
	                            System.out.println("Room Options \t Description \t Charge per Day");
	                            System.out.println("===============================================");
	                            System.out.println("A \t NON-AC Room \t\t 1499.00");
	                            System.out.println("B \t AC Room \t\t 2499.00");
	                            System.out.println("===============================================");
	                            System.out.println("Enter your Room code (A, B) : ");

	                            module = br.nextLine();

	                            switch (roomcode.valueOf(module)) {

	                                case A:
	                                    roomCost = 1499;
	                                    break;
	                                case B:
	                                    roomCost = 2499;
	                                    break;
	                            }

	                            System.out.println("Enter the number of days:");
	                            numberOfDays = Integer.parseInt(br.nextLine());
	                            System.out.println("Enter the number of guests:");
	                            numberOfGuests = Integer.parseInt(br.nextLine());
	                            totalAmount = roomCost * numberOfDays;
	                            System.out.println("Amount for room booking before discount is " + totalAmount);

	                            // Applying discount
	                            if (numberOfGuests >= 1 && numberOfGuests <= 2) 
	                            {
	                                discountedAmount = (int) (totalAmount - (totalAmount * 0));
	                            }
	                            else if (numberOfGuests >= 3 && numberOfGuests <= 5) 
	                            {
	                                discountedAmount = (int) (totalAmount - (totalAmount * 0.05));
	                            }
	                            else  
	                            {
	                                discountedAmount = (int) (totalAmount - (totalAmount * 0.10));
	                            }

	                            System.out.println("Amount for room booking after discount is " + discountedAmount);
	                            break;

	                        case S:
	                            System.out.println("Additional Services \t Description \t Charge per Unit");
	                            System.out.println("========================================================================");
	                            System.out.println("1 \t Spa \t\t 199.00 per session");
	                            System.out.println("2 \t Breakfast \t 49.00 per person");
	                            System.out.println("3 \t Pickup \t 99.00 per person");
	                            System.out.println("========================================================================");
	                            System.out.println("Enter your Service code (1, 2, 3) : ");

	                            module = br.nextLine();
	                            int serviceCode = Integer.parseInt(module);
	                            System.out.println("Enter no of guests");
	                            noOfPeople = Integer.parseInt(br.nextLine());
	                            
	                            
	                            switch (serviceCode) {

	                                case 1:
	                                    additionalCost = 199*noOfPeople;
	                                    break;
	                                case 2:
	                                    additionalCost = 49*noOfPeople;
	                                    break;
	                                case 3:
	                                    additionalCost = 99*noOfPeople;
	                                    break;
	                            }

	                            System.out.println("Your Additional Cost :  " + additionalCost);
	                            break;
	                    }
	                    break;

	                case P:
	                    System.out.println("Payment Module");
	                    System.out.println("======================");
	                    System.out.println("Enter T to know Total Amount");
	                    System.out.println("Enter P to Make Payment");
	                    System.out.println("Enter M to Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (T, P, M) : ");

	                    module = br.nextLine();
	                    switch (submodule2.valueOf(module)) {

	                        case T:
	                            System.out.println("Total Amount to be Paid : " + (discountedAmount + additionalCost));
	                            break;

	                        case P:
	                            System.out.println("To Make Payment : " + (discountedAmount + additionalCost));
	                            break;
	                    }
	                    break;

	                case R:
	                    System.out.println("Report Module");
	                    System.out.println("======================");
	                    System.out.println("Enter I to Display Invoice");
	                    System.out.println("Enter S to Display Summary");
	                    System.out.println("Enter M to Return to Main Menu");
	                    System.out.println("======================");
	                    System.out.println("Enter your Module code (I, S, M) : ");

	                    module = br.nextLine();
	                    switch (submodule3.valueOf(module)) {

	                        case I:
	                            System.out.println("Invoice Display");
	                            System.out.println("==================");
	                            System.out.println("Booking Id : " + (Math.ceil(Math.random())));
	                            System.out.println("Number of Days: " + numberOfDays);
	                            System.out.println("Number of Guests: " + numberOfGuests);
	                            System.out.println("Total Room Cost: " + totalAmount);
	                            System.out.println("Amount after Discount: " + discountedAmount);
	                            System.out.println("Additional Costs: " + additionalCost);
	                            System.out.println("Total Amount to be Paid: " + (discountedAmount + additionalCost));
	                            break;

	                        case S:
	                            System.out.println("Summary Of Booking");
	                            System.out.println("======================");
	                            System.out.println("Room Cost: " + totalAmount);
	                            System.out.println("Number of Days: " + numberOfDays);
	                            System.out.println("Number of Guests: " + numberOfGuests);
	                            System.out.println("Amount after Discount: " + discountedAmount);
	                            System.out.println("Additional Costs: " + additionalCost);
	                            System.out.println("Total Amount to be Paid: " + (discountedAmount + additionalCost));
	                            break;
	                    }
	                    break;

	                case E:
	                    System.out.println("Quit Module");
	                    System.out.println("Thank you for visiting!");
	                    System.out.println("Visit Again!");
	                    System.exit(0);
	                    break;
	            }
	        }
	}

}
