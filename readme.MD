# Identity Service

A Spring Boot-based Identity and Access Management (IAM) service providing authentication, authorization, and user management. Supports JWT, role-based access control, and integration with MySQL.

## Features
- User registration and management
- Role and permission management
- JWT-based authentication
- Token invalidation (logout)
- OAuth2 resource server support
- RESTful API endpoints

## Prerequisites
- Java 21+
- Maven 3.9+
- Docker (for containerized deployment)
- MySQL 8.x (or use Docker for MySQL)

## Getting Started

### Clone the repository
```bash
git clone <your-repo-url>
cd auth
```

### Build the project
```bash
./mvnw clean package
```

### Run with Docker
Create a Docker network:
```bash
docker network create identity-network
```

Start MySQL:
```bash
docker run --network identity-network --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=12341234 -d mysql:8.0.36-debian
```

Start the identity service:
```bash
docker run --name identity-service --network identity-network -p 8080:8080 -e DBMS_CONNECTION=jdbc:mysql://mysql:3306/identity_service identity-service:0.0.1
```
Or use the latest image:
```bash
docker run --name identity-service --network identity-network -p 8080:8080 -e DBMS_CONNECTION=jdbc:mysql://mysql:3306/identity_service loanxinhiu/identity_service_pudo:latest
```

### Run locally (without Docker)
1. Ensure MySQL is running and accessible.
2. Configure your database connection in `src/main/resources/application.yaml` or via environment variables.
3. Run:
```bash
./mvnw spring-boot:run
```

## Environment Variables
- `DBMS_CONNECTION`: JDBC URL for MySQL (default: `jdbc:mysql://localhost:3306/identity_service`)
- `DBMS_USERNAME`: MySQL username (default: `root`)
- `DBMS_PASSWORD`: MySQL password (default: `12341234`)
- `SIGNERKEY`: JWT signer key (default provided in `application.yaml`)

## API Overview
- `/api/auth/*`: Authentication endpoints (login, refresh, logout, introspect)
- `/api/users/*`: User management
- `/api/roles/*`: Role management
- `/api/permissions/*`: Permission management

## Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](LICENSE) (or specify your license here)


