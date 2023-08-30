package coffee.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private static final Logger logger = LoggerFactory.getLogger(CoffeeOrderBoard.class);
    private Queue<Order> orderQueue = new LinkedList<>();
    private int orderNumber = 1;

    public void add(Order order) {
        order.setOrderNumber(orderNumber++);
        orderQueue.offer(order);
        logger.info("Order added: {}", order);
    }

    public void deliver() {
        if (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            logger.info("Order delivered: {}", order);
        } else {
            logger.info("No orders to deliver.");
        }
    }
    public void deliver(int orderNumber) {
        for (Order order : orderQueue) {
            if (order.getOrderNumber() == orderNumber) {
                logger.info("Order delivered: {}", order);
                orderQueue.remove(order);
                return;
            }
        }
        logger.info("Order with order number {} not found.", orderNumber);
    }
    public void draw() {
        logger.info("Current order queue:");
        logger.info("============= Num | Name");

        for (Order order : orderQueue) {
            logger.info("{} | {}", order.getOrderNumber(), order.getCustomerName());
        }
    }

}
