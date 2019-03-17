package com.company.last;

public class NotConnectedException extends Exception {
    NotConnectedException() {
        super("Client is not connected");
    }
}
