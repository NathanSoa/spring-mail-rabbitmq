package br.com.nathansoares.mailservice.infra.messaging.publisher;

public interface Publisher<T> {

    void publish(T t);
}
