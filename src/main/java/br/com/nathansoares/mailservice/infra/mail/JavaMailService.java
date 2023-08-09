package br.com.nathansoares.mailservice.infra.mail;

import br.com.nathansoares.mailservice.domain.Mail;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JavaMailService implements MailService {

    private final JavaMailSender mailSender;

    public void send(Mail mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mail.getFrom());
        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getBody());
        mailSender.send(message);
    }
}