# Integer Factorizer Backend

This is a REST API backend that, given a number, serves the factors of that number. It is written in Java and uses the
Spring Boot library.

## Running

Run the application using Maven by running:

```shell
./mvnw spring-boot:run
```

## Usage

The default port is set to 8080. The format for accessing the factors of a number are as follows:
```
http://{website}:8080/api/{number}/factors
```
The webserver currently does not support HTTPS, so not specifying the port may give you an SSL error depending on the
browser you use.