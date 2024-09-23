package com.evergent.corejava.Controller;

import com.evergent.corejava.Service.*;

import java.util.Scanner;


public class HotelController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelService hotelService = new HotelService();
        int choice;
        do {
            System.out.println("Hotel Management System");
            System.out.println("1. Add Room");
            System.out.println("2. Book Room");
            System.out.println("3. Check-in");
            System.out.println("4. Check-out");
            System.out.println("5. View Room Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Room ID: ");
                    int roomId = scanner.nextInt();
                    System.out.println("Enter Room Type: ");
                    String roomType = scanner.next();
                    System.out.println("Enter Price: ");
                    double price = scanner.nextDouble();
                    int count = hotelService.addRoom(roomId, roomType, price, false);
                    System.out.println(count + " Room Added Successfully");
                    break;
                case 2:
                    System.out.println("Enter Room ID to book: ");
                    int bookRoomId = scanner.nextInt();
                    hotelService.bookRoom(bookRoomId);
                    break;
                case 3:
                    System.out.println("Enter Room ID for check-in: ");
                    int checkInRoomId = scanner.nextInt();
                    hotelService.checkInRoom(checkInRoomId);
                    break;
                case 4:
                    System.out.println("Enter Room ID for check-out: ");
                    int checkOutRoomId = scanner.nextInt();
                    hotelService.checkOutRoom(checkOutRoomId);
                    break;
                case 5:
                    System.out.println("Enter Room ID to view: ");
                    int viewRoomId = scanner.nextInt();
                    String roomDetails = hotelService.viewRoomDetails(viewRoomId);
                    System.out.println(roomDetails);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
        scanner.close();
    }
}
