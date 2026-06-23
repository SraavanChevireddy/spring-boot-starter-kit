# spring-boot-starter-kit

> A production-ready Spring Boot template so you can skip the boilerplate and start shipping. Java 21, Maven, Docker, OpenAPI, health checks, structured logging, and CI — wired up and tested.

[![CI](https://github.com/SraavanChevireddy/spring-boot-starter-kit/actions/workflows/ci.yml/badge.svg)](https://github.com/SraavanChevireddy/spring-boot-starter-kit/actions/workflows/ci.yml)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.org/projects/jdk/21/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Every new Spring Boot service starts with the same 30 minutes of plumbing: actuator, logging format, exception handling, API docs, a Dockerfile, CI. This repo is that plumbing, done right, so you can clone and build.

## What's included

- **Java 21 + Spring Boot 3.3** on Maven.
- **Actuator health probes** (`/actuator/health`, liveness + readiness) ready for Kubernetes.
- **OpenAPI / Swagger UI** at `/swagger-ui.html`, auto-generated from your controllers.
- **Global exception handler** returning consistent JSON errors instead of stack traces.
- **Structured console logging** with a sane pattern and per-package levels.
- **Multi-stage Dockerfile** that runs as a non-root user.
- **GitHub Actions CI** that builds and tests on every push/PR.
- **Tests** with MockMvc as a starting point.

## Quick start

```bash
git clone https://github.com/SraavanChevireddy/spring-boot-starter-kit.git
cd spring-boot-starter-kit

# Run it
./mvnw spring-boot:run

# In another terminal
curl "http://localhost:8080/api/hello?name=Sraavan"
# -> {"message":"Hello, Sraavan!","timestamp":"..."}
```

Then open:
- API docs: http://localhost:8080/swagger-ui.html
- Health: http://localhost:8080/actuator/health

## Run with Docker

```bash
docker build -t starter-kit .
docker run -p 8080:8080 starter-kit
```

## Run the tests

```bash
./mvnw test
```

## Project layout

```
src/main/java/com/sraavan/starter
├── StarterKitApplication.java   # entry point
├── config/OpenApiConfig.java    # Swagger metadata
└── web/
    ├── HelloController.java      # sample endpoint
    └── GlobalExceptionHandler.java
src/main/resources/application.yml
```

## Making it yours

1. Rename the `com.sraavan.starter` package and `groupId`/`artifactId` in `pom.xml`.
2. Replace `HelloController` with your real endpoints.
3. Add your datasource / dependencies to `pom.xml`.

## License

[MIT](LICENSE) © Sraavan Chevireddy
