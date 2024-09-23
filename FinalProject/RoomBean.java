package com.evergent.corejava.HotelBean;

	public class RoomBean {
	    private int roomId;
	    private String roomType;
	    private double price;
	    private boolean isBooked;

	    public int getRoomId() {
	        return roomId;
	    }
	    public void setRoomId(int roomId) {
	        this.roomId = roomId;
	    }
	    public String getRoomType() {
	        return roomType;
	    }
	    public void setRoomType(String roomType) {
	        this.roomType = roomType;
	    }
	    public double getPrice() {
	        return price;
	    }
	    public void setPrice(double price) {
	        this.price = price;
	    }
	    public boolean isBooked() {
	        return isBooked;
	    }
	    public void setBooked(boolean isBooked) {
	        this.isBooked = isBooked;
	    }
	}
