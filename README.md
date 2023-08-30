# Whiskey tasting

## Description

Application to save whiskey tastings.
The goal of this application is to learn Java and Spring ecosystem

## Features

- Save whiskey tasting with name / distillery / score / etc ...
- Authentication with multiple roles
- Autocomplete to search whiskey names
- Data audit (which save what)

## Roadmap

### Bootstrap
- [ ] Initialize an empty Spring Boot project with Maven
- [x] Learn bases of Spring
- [x] Learn initialization of Spring
- [x] Learn Spring Web REST API
- [ ] Java app in Docker (See official images)
- [ ] Create controller + service + repository + Domain architecture

### Create base of the API
- [ ] See Spring IOC
- [ ] See Spring MVC
- [ ] See Spring Data
- [ ] Create in memory (HashMap) controller + repo
- [ ] Add body validation and proper error message with ControllerAdvice
- [ ] Add picture of the whiskey

### Persistence
- [ ] Create schema of database
- [ ] Add PostreSQL (and docker-compose)
- [ ] Use JPA to save data
- [ ] Use converter to save the date + Java Times
- [ ] Use transaction to save data
- [ ] See CAP Theorem + ACID

### Utils elements
- [ ] Add logger (slf4j)
- [ ] Add application.properties for configuration
- [ ] Use profiles of Spring
- [ ] Add OpenAPI / Swagger

### Authentication
- [ ] Add users and roles in database
- [ ] Add Basic authentication
- [ ] Add JWT authentication
- [ ] Add only doc as public route
- [ ] Add role per action
- [ ] Add API Audit to see which save data

### Advanced features
- [ ] Add scheduler to scrap whiskey external database (Use Future)
- [ ] Add route to autocomplete whiskey
- [ ] Add cache with Redis for autocomplete
- [ ] Add average score for whiskeys

### Testing
- [ ] Use JUnit for unit testing
- [ ] Use TestContainer for E2E testing

## Technical stack

- Spring / Spring Boot
- PostgreSQL
- Spring Secu : Authentication (Basic and JWT)
- Body validation with Spring Starter Validation
- Maven
- API Audit
- Java Times
- Jackson
- OpenAPI - Swagger
- Logging : slf4j
- Configuration of application
- Redis for cache (on autocomplete)
- JUnit

## Concepts to learn (not ordered)

- Spring / Spring Boot / Spring Data / Spring Secu / Spring IOC / Spring MVC
- Spring Starter Validation
- PosteSQL (Using JPA)
- Future / Stream / Optional
- Java Times
- API Audit
- Jackson
- Maven
- Logging with Slf4J
- "Convertor" (for dates)
- Controller Advices (for proper errors in validation)
- Scheduler (To fetch existing Whiskey names)
- Cache with Redis
- App configuration
- Hibernate
- JDBC Template
- JUnit (TestConteneur)
- CAP Theorem / ACID / Transaction

## Entities

### Whiskey tasting

- id (UUID)
- picture
- name
- date
- score (0 to 10)
- comment (in other table)
- flavor (enum)
- color (enum)
- taste (enum)

### Whiskeys

- id (UUID)
- name
