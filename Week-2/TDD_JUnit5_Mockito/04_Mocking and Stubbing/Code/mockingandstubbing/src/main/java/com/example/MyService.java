package com.example;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void processAndSendData() {
        String data = api.getData();
        String processed = data.toUpperCase();
        api.sendData(processed);
    }
}
