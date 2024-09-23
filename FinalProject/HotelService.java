package com.evergent.corejava.Service;

import com.evergent.corejava.HotelBean.RoomBean;
import com.evergent.corejava.dao.HotelDAO;

public class HotelService {
    HotelDAO hotelDAO = new HotelDAO();

    public int addRoom(int roomId, String roomType, double price, boolean isBooked) {
        RoomBean roomBean = new RoomBean();
        roomBean.setRoomId(roomId);
        roomBean.setRoomType(roomType);
        roomBean.setPrice(price);
        roomBean.setBooked(isBooked);
        return hotelDAO.addRoom(roomBean);
    }

    public void bookRoom(int roomId) {
        int result = hotelDAO.bookRoom(roomId);
        if (result == 1) {
            System.out.println("Room booked successfully.");
        } else {
            System.out.println("Room booking failed.");
        }
    }

    public void checkInRoom(int roomId) {
        int result = hotelDAO.checkInRoom(roomId);
        if (result == 1) {
            System.out.println("Checked into the room successfully.");
        } else {
            System.out.println("Check-in failed.");
        }
    }

    public void checkOutRoom(int roomId) {
        int result = hotelDAO.checkOutRoom(roomId);
        if (result == 1) {
            System.out.println("Checked out from the room successfully.");
        } else {
            System.out.println("Check-out failed.");
        }
    }

    public String viewRoomDetails(int roomId) {
        return hotelDAO.viewRoomDetails(roomId);
    }
}
