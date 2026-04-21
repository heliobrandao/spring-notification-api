package com.damageinc.notification.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.damageinc.notification.service.impl.EmailNotificationService;
import com.damageinc.notification.service.impl.SmsNotificationService;
import com.damageinc.notification.service.impl.WhatsAppNotificationService;

class NotificationFactoryTest {

    private NotificationFactory factory;

    @BeforeEach
    void setup() {
        factory = new NotificationFactory(
                new EmailNotificationService(),
                new SmsNotificationService(),
                new WhatsAppNotificationService()
        );
    }

    @Test
    void shouldReturnEmailService() {
        assertTrue(
            factory.getNotificationService("email")
                instanceof EmailNotificationService
        );
    }

    @Test
    void shouldThrowExceptionForInvalidType() {
        assertThrows(
            IllegalArgumentException.class,
            () -> factory.getNotificationService("fax")
        );
    }
}
