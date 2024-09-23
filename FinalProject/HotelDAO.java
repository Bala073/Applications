package com.evergent.corejava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.evergent.corejava.HotelBean.*;


public class HotelDAO {
    public int addRoom(RoomBean roomBean) {
        try {
            Connection con = HotelDBConnection.getConnection();
            String query = "INSERT INTO hotel_rooms VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, roomBean.getRoomId());
            pstmt.setString(2, roomBean.getRoomType());
            pstmt.setDouble(3, roomBean.getPrice());
            pstmt.setBoolean(4, roomBean.isBooked());
            int count = pstmt.executeUpdate();
            con.close();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int bookRoom(int roomId) {
        try {
            Connection con = HotelDBConnection.getConnection();
            String query = "UPDATE hotel_rooms SET is_booked=true WHERE room_id =?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, roomId);
            int count = pstmt.executeUpdate();
            con.close();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int checkInRoom(int roomId) {
        return bookRoom(roomId); // Same logic as booking a room
    }

    public int checkOutRoom(int roomId) {
        try {
            Connection con = HotelDBConnection.getConnection();
            String query = "UPDATE hotel_rooms SET is_booked=false WHERE room_id =?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, roomId);
            int count = pstmt.executeUpdate();
            con.close();
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String viewRoomDetails(int roomId) {
        try {
            Connection con = HotelDBConnection.getConnection();
            String query = "SELECT * FROM hotel_rooms WHERE room_id =?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, roomId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return "Room ID: " + rs.getInt(1) + ", Type: " + rs.getString(2) + ", Price: " + rs.getDouble(3)
                        + ", Booked: " + rs.getBoolean(4);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Room not found";
    }
}
