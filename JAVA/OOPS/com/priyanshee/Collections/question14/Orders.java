package com.priyanshee.Collections.question14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Orders {
  private Deque<Order> orderList = new ArrayDeque<>();
  private List<Order> orderHistory = new ArrayList<>();

  public void placeOrder(Order order) {
    if(order.getOrderType().equalsIgnoreCase("online")) {
      orderList.offerLast(order);
    } else {
      orderList.offerFirst(order);
    }
  }

  public void fulfillOrderFront() {
    Order order = orderList.pollFirst();
    if(order != null) {
      orderHistory.add(order);
    }
  }

  public void fulfillOrderLast() {
    Order order = orderList.pollLast();
    if(order != null) {
      orderHistory.add(order);
    }
  }

  public void printOrderHistory() {
    for (Order order : orderHistory) {
      System.out.println(order);
    }
  }

  public void printCurrentOrders() {
    for (Order order : orderList) {
      System.out.println(order);
    }
  }


}
