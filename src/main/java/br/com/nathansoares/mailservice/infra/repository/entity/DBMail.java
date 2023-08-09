package br.com.nathansoares.mailservice.infra.repository.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class DBMail {

    protected DBMail() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "from_email")
    @NotBlank
    @Email
    private String from;

    @Column(nullable = false, name = "to_email")
    @NotBlank
    @Email
    private String to;

    @Column(nullable = false)
    @NotBlank
    private String subject;

    @Column(nullable = false)
    private LocalDateTime sentAt = LocalDateTime.now();
}
