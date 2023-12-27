# Spring Boot Service Template

A template for creating Spring Boot service.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This is a template for creating Spring Boot service. I wanted an easy starting point to prototype a new idea or starting a new project without having to do the initial set up.

It includes the Spring Actuator library for a quick check if the service is working. It also includes a Dockerfile for quickly building and deploying the project.

## Prerequisites

You will need Java 21 to run this project. 

## Usage

To run the project, run the following command:

```bash
./gradlew bootRun
```

To build the Docker image, run the following command:

```bash
docker build -t spring-boot-service-template .
```

To run the Docker image, run the following command:

```bash
docker run -p 8080:8080 spring-boot-service-template
```

To test the service, run the following command:

```bash
curl localhost:8080/actuator/health
```

## Contributing

If you have any suggestions or improvements, please submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

