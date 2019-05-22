package com.homework.mateakademy.domain;

import com.homework.mateakademy.listener.DateListenerDate;
import com.mateacademy.springmvcexample.listeners.DateEntityListener;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = false)
@EntityListeners(value = DateListenerDate.class)
public class DateEntity extends Entity {
    private Long date;
}
