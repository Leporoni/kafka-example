package com.leporonitech.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "leporonitech",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " ...FORZA ITALIA - SEE YOU ON QATAR 2022...");
    }
}
