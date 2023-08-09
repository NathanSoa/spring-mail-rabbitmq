package br.com.nathansoares.mailservice.infra.mail;

import br.com.nathansoares.mailservice.domain.Mail;

public interface MailService {

    void send(Mail mail);
}
