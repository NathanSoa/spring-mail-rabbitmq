package br.com.nathansoares.mailservice.domain;

import lombok.Data;

@Data
public class Mail {

    private String to;
    private String from;
    private String subject;
    private String body;
}
