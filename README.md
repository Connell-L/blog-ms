# blog

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/blog-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- OpenID Connect Client ([guide](https://quarkus.io/guides/security-openid-connect-client)): Get and refresh access tokens from OpenID Connect providers
- Qute ([guide](https://quarkus.io/guides/qute)): Offer templating support for web, email, etc in a build time, type-safe way
- SmallRye Fault Tolerance ([guide](https://quarkus.io/guides/smallrye-fault-tolerance)): Build fault-tolerant network services
- Scheduler ([guide](https://quarkus.io/guides/scheduler)): Schedule jobs and tasks
- RESTEasy Classic ([guide](https://quarkus.io/guides/resteasy)): REST endpoint framework implementing Jakarta REST and more
- Quarkus Extension for Spring Data JPA API ([guide](https://quarkus.io/guides/spring-data-jpa)): Use Spring Data JPA annotations to create your data access layer
- JDBC Driver - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Connect to the PostgreSQL database via JDBC
- Narayana JTA - Transaction manager ([guide](https://quarkus.io/guides/transaction)): Offer JTA transaction support (included in Hibernate ORM)
- RESTEasy Classic Mutiny ([guide](https://quarkus.io/guides/resteasy#reactive)): Mutiny support for RESTEasy Classic server
- SmallRye OpenAPI ([guide](https://quarkus.io/guides/openapi-swaggerui)): Document your REST APIs with OpenAPI - comes with Swagger UI
- Kubernetes Client ([guide](https://quarkus.io/guides/kubernetes-client)): Interact with Kubernetes and develop Kubernetes Operators
- OpenTelemetry ([guide](https://quarkus.io/guides/opentelemetry)): Use OpenTelemetry to trace services
- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern
- OpenID Connect Token Propagation ([guide](https://quarkus.io/guides/security-openid-connect-client)): Use Jakarta REST Client filter to propagate the incoming Bearer access token or token acquired from Authorization Code Flow as HTTP Authorization Bearer token
- Agroal - Database connection pool ([guide](https://quarkus.io/guides/datasource)): Pool JDBC database connections (included in Hibernate ORM)
- RESTEasy Classic Qute ([guide](https://quarkus.io/guides/qute)): Qute Templating integration for RESTEasy
- Hibernate ORM ([guide](https://quarkus.io/guides/hibernate-orm)): Define your persistent model with Hibernate ORM and Jakarta Persistence
- REST Client Classic ([guide](https://quarkus.io/guides/rest-client)): Call REST services
- OpenID Connect Client Filter ([guide](https://quarkus.io/guides/security-openid-connect-client)): Use Jakarta REST Client filter to get and refresh access tokens with OpenId Connect Client and send them as HTTP Authorization Bearer tokens
- YAML Configuration ([guide](https://quarkus.io/guides/config-yaml)): Use YAML to configure your Quarkus application
- Logging JSON ([guide](https://quarkus.io/guides/logging#json-logging)): Add JSON formatter for console logging
- SmallRye Health ([guide](https://quarkus.io/guides/smallrye-health)): Monitor service health
- Kubernetes ([guide](https://quarkus.io/guides/kubernetes)): Generate Kubernetes resources from annotations
- SmallRye Context Propagation ([guide](https://quarkus.io/guides/context-propagation)): Propagate contexts between managed threads in reactive applications
- Micrometer metrics ([guide](https://quarkus.io/guides/micrometer)): Instrument the runtime and your application with dimensional metrics using Micrometer.
- Eclipse Vert.x ([guide](https://quarkus.io/guides/vertx)): Write reactive applications with the Vert.x API
- Hibernate Validator ([guide](https://quarkus.io/guides/validation)): Validate object properties (field, getter) and method parameters for your beans (REST, CDI, Jakarta Persistence)
- SmallRye Reactive Messaging ([guide](https://quarkus.io/guides/reactive-messaging)): Produce and consume messages and implement event driven and data streaming applications
- OpenID Connect ([guide](https://quarkus.io/guides/security-openid-connect)): Verify Bearer access tokens and authenticate users with Authorization Code Flow
- Quarkus Extension for Spring DI API ([guide](https://quarkus.io/guides/spring-di)): Define your dependency injection with Spring DI
- Liquibase ([guide](https://quarkus.io/guides/liquibase)): Handle your database schema migrations with Liquibase

## Provided Code

### YAML Config

Configure your application with YAML

[Related guide section...](https://quarkus.io/guides/config-reference#configuration-examples)

The Quarkus application configuration is located in `src/main/resources/application.yml`.

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)

[Related Hibernate with Panache section...](https://quarkus.io/guides/hibernate-orm-panache)


### REST Client

Invoke different services through REST with JSON

[Related guide section...](https://quarkus.io/guides/rest-client)

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)

### RESTEasy Qute

Create your web page using Quarkus RESTEasy & Qute

[Related guide section...](https://quarkus.io/guides/qute#type-safe-templates)

### SmallRye Health

Monitor your application's health using SmallRye Health

[Related guide section...](https://quarkus.io/guides/smallrye-health)
