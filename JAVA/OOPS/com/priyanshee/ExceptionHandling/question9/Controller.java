package com.priyanshee.ExceptionHandling.question9;

public class Controller {
    private Service service = new Service();

    public void handleRequest() {
        try {
            service.processData();
        } catch (ServiceLayerException e) {
            System.err.println("Exception caught in controller: " + e.getMessage());
            System.err.println("Root cause: " + e.getCause());
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.handleRequest();
    }
}
