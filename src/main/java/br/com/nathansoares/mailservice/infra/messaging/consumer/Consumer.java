package br.com.nathansoares.mailservice.infra.messaging.consumer;

public interface Consumer<T> {

    void consume(T t);
}
