package com.evergent.corejava.balakishan.application4;

abstract public class PaymentModule {
	 protected int roomCost;
	    protected int additionalCost;
	    protected int numberOfDays;
	    protected int numberOfGuests;
	    protected int totalAmount;
	   

	    public PaymentModule(int roomCost, int additionalCost, int numberOfDays, int numberOfGuests) {
	        this.roomCost = roomCost;
	        this.additionalCost = additionalCost;
	        this.numberOfDays = numberOfDays;
	        this.numberOfGuests = numberOfGuests;
	    }

	    abstract void totalAmount();

	    public void makePayment() {
	        System.out.println("Payment of " + totalAmount + " is made successfully.");
	    }

	    public void returnToMainMenu() {
	        System.out.println("Returning to Main Menu...");
	    }
	}


