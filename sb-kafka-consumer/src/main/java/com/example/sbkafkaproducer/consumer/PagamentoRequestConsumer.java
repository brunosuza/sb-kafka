package com.example.sbkafkaproducer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PagamentoRequestConsumer {

    @KafkaListener(
            topics = "${topic.new-topic}",
            groupId = "pagamento-request-consumer-1"
    )
    public void consume(String message) {
        System.out.println(" ====== Mensagem recebida =====" + message);
    }
}
