package com;

public class Deal {
    public int id,transactionId;
    public double price,tax;

    public Deal(int id, int transactionId, double price, double tax) {
        this.id = id;
        this.transactionId = transactionId;
        this.price=price;
        this.tax=tax;
    }
}
