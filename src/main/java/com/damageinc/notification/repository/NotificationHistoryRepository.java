package com.damageinc.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.damageinc.notification.entity.NotificationHistory;

public interface NotificationHistoryRepository
        extends JpaRepository<NotificationHistory, Long> {
}