package com.priyanshee.Collections.question14;

public class Main {
  public static void main(String[] args) {
    Order order1 = new Order(1, "online", "Priyanshee", "Dal-Chawal");
    Order order2 = new Order(2, "online", "Lakshya", "Dal-Roti");
    Order order3 = new Order(3, "offline", "Pri", "Rajma-Chawal");
    Order order4 = new Order(4, "online", "Shee", "Dal Tadka-Chawal");
    Order order5 = new Order(5, "offline", "Sumitra", "Honey chilli potato");
    Order order6 = new Order(6, "online", "Narendra", "Fried Chawal");
    Order order7 = new Order(7, "online", "Shriya", "Idli Sambhar");
    Order order8 = new Order(8, "offline", "Parnika", "Masla Dosa");
    Order order9 = new Order(9, "online", "Riya", "Uttapam");
    Order order10 = new Order(10, "offline", "Giya", "Coffee");
    Order order11 = new Order(11, "offline", "Hiya", "High Tea");

    Orders currentOrders = new Orders();
    currentOrders.placeOrder(order1);
    currentOrders.placeOrder(order2);
    currentOrders.placeOrder(order3);
    currentOrders.placeOrder(order4);
    currentOrders.placeOrder(order5);
    currentOrders.placeOrder(order6);
    currentOrders.placeOrder(order7);
    currentOrders.placeOrder(order8);
    currentOrders.placeOrder(order9);
    currentOrders.placeOrder(order10);
    currentOrders.placeOrder(order11);

    currentOrders.printCurrentOrders();
    currentOrders.fulfillOrderFront();
    currentOrders.fulfillOrderLast();

    System.out.println("\n\nOrder History");
    currentOrders.printOrderHistory();
  }
}
