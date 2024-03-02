package com.tsvetanv.kafka.app.controller;

import com.tsvetanv.kafka.app.kafka.Message;
import com.tsvetanv.kafka.app.service.KafkaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/kafka-app")
@AllArgsConstructor
@Slf4j
public class KafkaController {

  private KafkaService kafkaService;

  @PostMapping("/message")
  public ResponseEntity<Void> sendMessage(@RequestBody Message message) {
    log.info("Send message to Strategy Adapter via Message Brocker: {}", message);
    kafkaService.sendMessageToKafka(message);
    return ResponseEntity.ok().build();
  }

}
