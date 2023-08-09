package br.com.nathansoares.mailservice.useCases;

import br.com.nathansoares.mailservice.domain.Mail;
import br.com.nathansoares.mailservice.infra.messaging.publisher.Publisher;
import br.com.nathansoares.mailservice.infra.repository.MailRepository;
import br.com.nathansoares.mailservice.infra.repository.entity.DBMailBuilder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MailUseCase {

    private final Publisher<Mail> publisher;
    private final MailRepository mailRepository;

    public void send(Mail mail) {
        var dbmail = DBMailBuilder.of()
                                .withFrom(mail.getFrom())
                                .withTo(mail.getTo())
                                .withSubject(mail.getSubject())
                                .build();
        mailRepository.save(dbmail);
        publisher.publish(mail);
    }
}
