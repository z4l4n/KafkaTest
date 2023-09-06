package com.example.producer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ScheduledProducer {

    private KafkaTemplate<String, String> kafkaTemplate;



    public void asd() throws InterruptedException {

        for (int i =0; i < 40; i++) {
            String topic = "mytest";
            String msg = "asdasd " + i;

            kafkaTemplate.send(topic,  msg);
            //Thread.sleep(3000);
            log.info(String.format("produced msg: %s to topic: %s", msg, topic));
        }

    }



}
