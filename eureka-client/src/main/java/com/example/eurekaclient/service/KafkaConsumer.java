package com.example.eurekaclient.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

//    @KafkaListener(topics = "rawdata", groupId = "rawdata")
    @KafkaListener(groupId = "receiver-api", topicPartitions = { @TopicPartition(topic = "rawdata",
        partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))})
    public void consume(String message) throws IOException {
        System.out.println(String.format("Consumed message : %s", message));
    }

}

