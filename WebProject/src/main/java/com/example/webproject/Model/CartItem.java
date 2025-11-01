package com.example.webproject.Model;

public class CartItem {
    private long id;
    private long cartId;
    private long productSkuId;
    private int quantity;
    private double priceAtTime;

    public CartItem(long id, long cartId, long productSkuId, int quantity, double priceAtTime) {
        this.id = id;
        this.cartId = cartId;
        this.productSkuId = productSkuId;
        this.quantity = quantity;
        this.priceAtTime = priceAtTime;
    }

    public CartItem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceAtTime() {
        return priceAtTime;
    }

    public void setPriceAtTime(double priceAtTime) {
        this.priceAtTime = priceAtTime;
    }


    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", cartId=" + cartId +
                ", productSkuId=" + productSkuId +
                ", quantity=" + quantity +
                ", priceAtTime=" + priceAtTime +
                '}';
    }
}
