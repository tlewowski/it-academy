package com.company.last;

public class UniqueMain {
    public static void main(String[] args) {
        NetworkClient c = new NetworkClient();
        try {
            c.connect("http://there-is-no-host.example");
            c.send("ABECE");
        } catch (NotConnectedException e) {
            System.out.println(e.getMessage());
        } finally {
            c.disconnect();
        }
    }
}