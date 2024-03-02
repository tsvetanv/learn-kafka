package com.tsvetanv.kafka.app.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics="my_topic", groupId="my_group_id")
    public void getMessage(String message){
        log.info("Consume msg: {}", message);
    }


}
