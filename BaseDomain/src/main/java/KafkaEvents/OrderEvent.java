package KafkaEvents;

import Models.Order;

import java.util.UUID;

public class OrderEvent {
    private String messageId;
    private Order order;

    public OrderEvent() {

    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderEvent(String messageId, Order order) {
        this.messageId = messageId;
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "messageId='" + messageId + '\'' +
                ", order=" + order +
                '}';
    }
}
