package com.priyanshee.Collections.question13;

public class BookingRequest {
  private String passengerName;

  public BookingRequest(String passengerName) {
    this.passengerName = passengerName;
  }

  public String getPassengerName() {
    return passengerName;
  }

  @Override
  public String toString() {
    return "passengerName: " + passengerName;
  }
}
