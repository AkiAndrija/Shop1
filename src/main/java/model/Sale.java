package model;

public class Sale {
    private int id;
    private int productId;
    private int buyerId;
    private double price;

    public Sale() {
    }

    public Sale(int productId, int buyerId, double price) {
        this.productId = productId;
        this.buyerId = buyerId;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sale [id=" + id + ", productId=" + productId + ", buyerId=" + buyerId + ", price=" + price + "]";
    }
}
