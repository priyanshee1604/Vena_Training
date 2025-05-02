package com.priyanshee.Collections.question13;

public class Main {
  public static void main(String[] args) {
    BookingRequest req1 = new BookingRequest("Priyanshee");
    BookingRequest req2 = new BookingRequest("Lakshya");
    BookingRequest req3 = new BookingRequest("Pillu");
    BookingRequest req4 = new BookingRequest("Raj");
    BookingRequest req5 = new BookingRequest("Narendra");
    BookingRequest req6 = new BookingRequest("Sumitra");
    BookingRequest req7 = new BookingRequest("Priyansh");

    FlightBooking bookings = new FlightBooking();
    bookings.addBooking(req1);
    bookings.addBooking(req2);
    bookings.addBooking(req3);
    bookings.addBooking(req4);
    bookings.addBooking(req5);
    bookings.addBooking(req6);
    bookings.addBooking(req7);

    System.out.println("Waiting Bookings \n");
    bookings.printWaitingBookings();
    System.out.println("\n");
    System.out.println("Processing the bookings:");
    bookings.confirmBooking();
    System.out.println("Confirmed Bookings \n");
    bookings.printConfirmedBookings();

  }
}
