package com.example.delivery.bean.locator.model;

public class Logs {

    private String message;

    public static Logs logs(String message) {
        var logs = new Logs();

        logs.setMessage(message);

        return logs;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
