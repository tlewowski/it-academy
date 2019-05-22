public class Deal {
    int id,transactionId;
    double price,tax;

    public Deal(int id, int transactionId, double price, double tax) {
        this.id = id;
        this.transactionId = transactionId;
        this.price=price;
        this.tax=tax;
    }
}
