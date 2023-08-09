package br.com.nathansoares.mailservice.infra.repository.entity;

public class DBMailBuilder {

    private final DBMail dbMail;

    private DBMailBuilder() {
        this.dbMail = new DBMail();
    }

    public static DBMailBuilder of() {
        return new DBMailBuilder();
    }

    public DBMailBuilder withFrom(String from) {
        this.dbMail.setFrom(from);
        return this;
    }

    public DBMailBuilder withTo(String to) {
        this.dbMail.setTo(to);
        return this;
    }

    public DBMailBuilder withSubject(String subject) {
        this.dbMail.setSubject(subject);
        return this;
    }

    public DBMail build() {
        return this.dbMail;
    }
}
