package com.homework.mateakademy.listener;


import com.homework.mateakademy.domain.DateDomain;
import javax.persistence.PrePersist;
import java.util.Date;

public class DateListenerUser {
    @PrePersist
    public void prePersist(DateDomain entity) {
        entity.setGetDate(new Date().getTime());
    }
}
