# SIMPLE SPRING MAIL WITH RABBITMQ

## Description

This is a simple project to send emails using RabbitMQ and Spring Boot.

My goal was to create a simple project to learn more about AMQP.

I'm using the [RabbitMQ](https://www.rabbitmq.com/) as a message broker, [JavaMail](https://javaee.github.io/javamail/) to send emails and [MySQL](https://mysql.com) to store metadata about emails.

## How to run

Make sure you have [Docker and Docker Compose](https://www.docker.com/) installed and running.

Run the following command to start the application:

```bash
docker-compose up
```

The application will be available at [http://localhost:8080](http://localhost:8080).

## How to use

This apllication has two endpoints:
- `/mail/async`: This endpoint will use RabbitMQ to send the email asynchronously.
- `/mail/sync`: This endpoint will send the email synchronously.
