package com.priyanshee.Collections.question14;

public class Order {
  private int orderNumber;
  private String orderType; //online ordre can be pushed in last
  private String customerName;
  private String foodOrdered;

  public Order(int orderNumber, String orderType, String customerName, String foodOrdered) {
    this.orderNumber = orderNumber;
    this.orderType = orderType;
    this.customerName = customerName;
    this.foodOrdered = foodOrdered;
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public String getOrderType() {
    return orderType;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getFoodOrdered() {
    return foodOrdered;
  }

  @Override
  public String toString() {
    return orderNumber + " " + orderType + " " + customerName + " " + foodOrdered;
  }
}
