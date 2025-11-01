package com.example.webproject.Model;

public class ProductsSkus {
    private long id;
    private long productId;
    private String size;
    private String color;
    private double price;
    private int quantity;

    public ProductsSkus() {
    }

    public ProductsSkus(long id, long productId, String size, String color, double price, int quantity) {
        this.id = id;
        this.productId = productId;
        this.size = size;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductsSkus{" +
                "id=" + id +
                ", productId=" + productId +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
