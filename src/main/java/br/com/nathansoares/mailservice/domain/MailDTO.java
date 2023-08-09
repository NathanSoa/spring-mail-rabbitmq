package br.com.nathansoares.mailservice.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MailDTO {

    @NotBlank
    @Email
    private String to;

    @NotBlank
    @Email
    private String from;

    @NotBlank
    private String subject;

    @NotBlank
    private String body;

    public Mail ToDomain() {
        Mail mail = new Mail();
        mail.setFrom(this.from);
        mail.setTo(this.to);
        mail.setSubject(this.subject);
        mail.setBody(this.body);
        return mail;
    }
}
