package com.tsvetanv.kafka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KafkaApp {

  public static void main(String[] args) {
    SpringApplication.run(KafkaApp.class, args);
  }

}
