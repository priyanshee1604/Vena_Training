package com.priyanshee.Collections.question13;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FlightBooking {
  private static int nextSeatNumber = 1;
  Queue<BookingRequest> bookingQueue = new LinkedList<>();
  Map<String, Integer> confirmedBookings = new HashMap<>();

  public void addBooking(BookingRequest request) {
    if (bookingQueue.contains(request) || confirmedBookings.containsKey(request.getPassengerName())) {
      System.out.println("Booking already done for the passenger " + request);
      return;
    }
    bookingQueue.offer(request);
  }

  public void confirmBooking() {
    while(!bookingQueue.isEmpty()) {
      BookingRequest request = bookingQueue.poll();
      confirmedBookings.put(request.getPassengerName(), nextSeatNumber++);
    }
  }

  public void printWaitingBookings() {
    bookingQueue.forEach(System.out::println);
  }

  public void printConfirmedBookings() {
    confirmedBookings.entrySet().forEach(System.out::println);
  }

}
