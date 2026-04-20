package com.damageinc.notification.dto;
import jakarta.validation.constraints.NotBlank;

public class NotificationRequest {

    @NotBlank(message = "Type is required")
    private String type;

    @NotBlank(message = "Message is required")
    private String message;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}