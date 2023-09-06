package com.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "mytest")
    void consumer(ConsumerRecord<String, String> record) {
        log.info("group2 Consumed msg: " + record.value() + " with key: "+ record.key() + ", from partition: " + record.partition() + ", thread id" + Thread.currentThread().getId());
    }
}
