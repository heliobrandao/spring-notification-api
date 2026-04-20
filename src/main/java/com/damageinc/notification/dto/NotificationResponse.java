package com.damageinc.notification.dto;

public class NotificationResponse {

    private String status;
    private String message;

    public NotificationResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}