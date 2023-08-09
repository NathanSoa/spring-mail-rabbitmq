package br.com.nathansoares.mailservice.controller;

import br.com.nathansoares.mailservice.domain.MailDTO;
import br.com.nathansoares.mailservice.infra.mail.MailService;
import br.com.nathansoares.mailservice.useCases.MailUseCase;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
@AllArgsConstructor
public class MailController {

    private final MailUseCase useCase;
    private final MailService emailService;

    @PostMapping("/async")
    public void sendMail(@Valid @RequestBody MailDTO dto) {
        useCase.send(dto.ToDomain());
    }

    @PostMapping("/sync")
    public void sendMailSync(@Valid @RequestBody MailDTO dto) {
        emailService.send(dto.ToDomain());
    }
}
