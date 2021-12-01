package com.example.delivery.bean.locator.model;

public class Log {

    private String message;

    public static Log log(String message) {
        var logs = new Log();

        logs.setMessage(message);

        return logs;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Log{" +
                "message='" + message + '\'' +
                '}';
    }
}
