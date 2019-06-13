package com;
@InDB(tableName = "vdeals")
public class Deal {
    public int did,transactionId;
    public double price,tax;
    //public double totalTransactionCost;

    public Deal()
    {

    }

    public Deal(int id, int transactionId, double price, double tax) {
        this.did = id;
        this.transactionId = transactionId;
        this.price=price;
        this.tax=tax;
    }

    @Override
    public String toString() {
        return String.format("%d - %d - %f - %f", did, transactionId, price, tax);
    }
}
