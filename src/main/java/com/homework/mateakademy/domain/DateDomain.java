package com.homework.mateakademy.domain;


import com.homework.mateakademy.listener.DateListenerUser;
import com.homework.mateakademy.listener.UserDataListener;
import com.homework.mateakademy.listener.DateListenerDate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = false)
@EntityListeners(value = DateListenerUser.class)
public class DateDomain extends Entity {
    private LocalDate date;
}
