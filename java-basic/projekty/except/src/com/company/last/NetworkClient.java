package com.company.last;

public class NetworkClient {
    NetworkClient() { }
    private boolean isConnected;
    void connect(String url) {
        System.out.println("Connecting to " + url);
        if(url.equals("http://there-is-no-host.example")) {
            isConnected = false;
        } else {
            isConnected = true;
        }
    }
    void send(String text) throws NotConnectedException {
        if(!isConnected) {
            throw new NotConnectedException();
        }
        System.out.println("Sending: " + text);
    }
    void disconnect() {
        System.out.println("Disconnecting");
        if(isConnected) {
            isConnected = false;
        }
    }
}
