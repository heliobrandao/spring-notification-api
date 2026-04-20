package com.damageinc.notification.service.impl;

import org.springframework.stereotype.Service;

import com.damageinc.notification.service.NotificationService;

@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }

}
