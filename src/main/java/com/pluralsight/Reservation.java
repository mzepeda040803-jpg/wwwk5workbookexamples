package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice(){
        return switch (roomType.toLowerCase()) {
            case "king" -> 139;
            case "double" -> 124;
            default -> throw new IllegalArgumentException("Invalid room type: " + roomType);
        };

    }

    public double getReservationTotal(){
        double total = getPrice() * numberOfNights;
        if (isWeekend) {
            total = total * 1.10;
        }
        return total;
    }
}
