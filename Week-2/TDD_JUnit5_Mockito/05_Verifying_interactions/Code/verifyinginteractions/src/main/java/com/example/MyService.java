package com.example;

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void sendProcessedData(String data) {
        String processed = data.toUpperCase();
        externalApi.sendData(processed);
    }
}
