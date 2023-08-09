package br.com.nathansoares.mailservice.infra.repository;

import br.com.nathansoares.mailservice.infra.repository.entity.DBMail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends JpaRepository<DBMail, Long> {
}
