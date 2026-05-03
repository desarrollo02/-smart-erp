# ERP Core

Sistema ERP modular basado en Jakarta EE, WildFly, PostgreSQL y Docker.

## Tecnologías

- Java 17
- Jakarta EE 10
- WildFly
- PostgreSQL
- Flyway
- Maven
- Docker

## Arquitectura

- JSF (presentación)
- Service (lógica de negocio)
- Repository (acceso a datos)
- JPA (persistencia)
- Flyway (versionado de base de datos)

## Levantar el proyecto

docker compose -f infra/docker/docker-compose.yml up -d --build

## Ejecutar migraciones

mvn flyway:migrate

## Deploy

mvn clean package
docker cp target/erp-core-1.0-SNAPSHOT.war erp-wildfly:/opt/jboss/wildfly/standalone/deployments/

## Acceso

http://localhost:8080/erp-core-1.0-SNAPSHOT/

## Módulos actuales

Competencia


## Carpeta de documentación

docs/

## Autor

Sergio Diaz

