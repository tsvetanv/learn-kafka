package com.tsvetanv.kafka.app.service;

import com.tsvetanv.kafka.app.kafka.KafkaProducer;
import com.tsvetanv.kafka.app.kafka.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * This service works as both Kafka Producer and Consumer.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaService {

  private final KafkaProducer kafkaProducer;

  public void sendMessageToKafka(Message message) {
    this.kafkaProducer.writeMessage(message);
  }

  @KafkaListener(topics="my_topic_2", groupId="my_group_id")
  public void getMessageFromKafka(String messagePayload){
    log.info("Consume message from Strategy Adapter: {}", messagePayload);
  }
}
