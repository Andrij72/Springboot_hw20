package com.homework.mateakademy.service;

import com.homework.mateakademy.domain.Message;

public interface MessageService {
    Iterable<Message> loadByTag();
}
