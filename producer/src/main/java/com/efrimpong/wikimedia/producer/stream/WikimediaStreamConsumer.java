package com.efrimpong.wikimedia.consumer.stream;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaStreamConsumer {

    private final WebClient webClient;

    private final WikimediaProducer producer;

    public WikimediaStreamConsumer(WebClient.b webClient, WikimediaProducer producer) {
        this.webClient = webClient;
        this.producer = producer;
    }
}
