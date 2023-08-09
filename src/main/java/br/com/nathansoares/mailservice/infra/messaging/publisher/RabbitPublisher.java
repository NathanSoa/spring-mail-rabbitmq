package br.com.nathansoares.mailservice.infra.messaging.publisher;

import br.com.nathansoares.mailservice.domain.Mail;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitPublisher implements Publisher<Mail> {

    @Value("${rabbitmq.exchange.name}")
    private String EXCHANGE;

    @Value("${rabbitmq.routing.key}")
    private String ROUTING_JSON_KEY;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitPublisher.class);


    private final RabbitTemplate rabbitTemplate;

    @Override
    public void publish(Mail mail) {
        LOGGER.info("Sending message to RabbitMQ");
        rabbitTemplate.convertAndSend(EXCHANGE, ROUTING_JSON_KEY, mail);
    }
}
