package Models;

public class Order {
    private int orderId;
    private String productName;
    private int qty;
    private int amount;

    public Order(int orderId, String productName, int qty, int amount) {
        this.orderId = orderId;
        this.productName = productName;
        this.qty = qty;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", qty=" + qty +
                ", amount=" + amount +
                '}';
    }
}
