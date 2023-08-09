package br.com.nathansoares.mailservice.infra.messaging.consumer;

import br.com.nathansoares.mailservice.domain.Mail;
import br.com.nathansoares.mailservice.infra.mail.MailService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitConsumer implements Consumer<Mail> {

    private final MailService emailService;
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitConsumer.class);

    @Override
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consume(Mail mail) {
        LOGGER.info("Message received, starting to send email");
        emailService.send(mail);
        LOGGER.info("Email sent to " + mail.getTo() + " successfully");
    }
}
