package com.damageinc.notification.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String message;

    private LocalDateTime createdAt;

    public NotificationHistory() {
    }

    public NotificationHistory(String type, String message) {
        this.type = type;
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() { return id; }

    public String getType() { return type; }

    public String getMessage() { return message; }

    public LocalDateTime getCreatedAt() { return createdAt; }
}