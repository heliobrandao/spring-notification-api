package com.damageinc.notification.controller;

import org.springframework.web.bind.annotation.*;

import com.damageinc.notification.dto.NotificationRequest;
import com.damageinc.notification.factory.NotificationFactory;
import com.damageinc.notification.service.NotificationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private final NotificationFactory factory;

    public NotificationController(NotificationFactory factory) {
        this.factory = factory;
    }

    @PostMapping
    public String sendNotification(
        @Valid @RequestBody NotificationRequest request) {

        NotificationService service =
                factory.getNotificationService(request.getType());

        service.send(request.getMessage());

        return "Notification sent successfully";
    }
}