package com.priyanshee.Collections.question13;

import java.util.Objects;

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

  //need to override it to check if the passenger with same has done the booking alreday or not.
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    BookingRequest request = (BookingRequest) o;
    return Objects.equals(passengerName, request.passengerName);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(passengerName);
  }
}
