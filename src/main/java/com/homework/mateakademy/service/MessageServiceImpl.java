package com.homework.mateakademy.service;

import com.homework.mateakademy.domain.Message;
import com.homework.mateakademy.repositories.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MessageServiceImpl implements MessageService {
    private MessageRepository messageRepository;

    @Override
    public Iterable<Message> loadByTag(String tag) {
        return messageRepository.findAll();
    }
}
