package com.example.sbkafkaproducer.service;

import com.example.sbkafkaproducer.dto.PagamentoDTO;
import com.example.sbkafkaproducer.producer.PagamentoRequestProducer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRequestProducer pagamentoRequestProducer;

    public String integrarPagamento(PagamentoDTO pagamentoDTO) {
        try {
            return pagamentoRequestProducer.sendMessage(pagamentoDTO);
        } catch (JsonProcessingException e) {
            return "Houve um erro ao solicitar o pagamento "+e.getMessage();
        }
    }
}
