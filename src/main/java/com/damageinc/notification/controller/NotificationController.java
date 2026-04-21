package com.damageinc.notification.controller;

import org.springframework.web.bind.annotation.*;

import com.damageinc.notification.dto.NotificationRequest;
import com.damageinc.notification.dto.NotificationResponse;
import com.damageinc.notification.factory.NotificationFactory;
import com.damageinc.notification.repository.NotificationHistoryRepository;
import com.damageinc.notification.service.NotificationService;
import com.damageinc.notification.repository.NotificationHistoryRepository;
import com.damageinc.notification.entity.NotificationHistory;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notify")
public class NotificationController {

    private final NotificationFactory factory;
    private final NotificationHistoryRepository repository;

    public NotificationController(
            NotificationFactory factory,
            NotificationHistoryRepository repository) {

        this.factory = factory;
        this.repository = repository;
    }

    @PostMapping
    public NotificationResponse sendNotification(
        @Valid @RequestBody NotificationRequest request) {

        NotificationService service =
                factory.getNotificationService(request.getType());

        service.send(request.getMessage());

        NotificationHistory history =
        new NotificationHistory(
                request.getType(),
                request.getMessage()
        );

        repository.save(history);

        return new NotificationResponse(
        "success",
        "Notification sent successfully"
        );
    }
}