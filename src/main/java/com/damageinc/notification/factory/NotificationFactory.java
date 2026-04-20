package com.damageinc.notification.factory;

import org.springframework.stereotype.Component;
import com.damageinc.notification.service.NotificationService;
import com.damageinc.notification.service.impl.EmailNotificationService;
import com.damageinc.notification.service.impl.SmsNotificationService;
import com.damageinc.notification.service.impl.WhatsAppNotificationService;

@Component
public class NotificationFactory {

    private final EmailNotificationService emailNotificationService;
    private final SmsNotificationService smsNotificationService;
    private final WhatsAppNotificationService whatsAppNotificationService;

    public NotificationFactory(EmailNotificationService emailNotificationService,
                               SmsNotificationService smsNotificationService,
                               WhatsAppNotificationService whatsAppNotificationService) {
        this.emailNotificationService = emailNotificationService;
        this.smsNotificationService = smsNotificationService;
        this.whatsAppNotificationService = whatsAppNotificationService;
    }

    public NotificationService getNotificationService(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return emailNotificationService;
            case "sms":
                return smsNotificationService;
            case "whatsapp":
                return whatsAppNotificationService;
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }



}
