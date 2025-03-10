
docker network create identity-network

docker run --network identity-network --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=12341234 -d mysql:8.0.36-debian

docker run --name identity-service --network identity-network -p 8080:8080 -e DBMS_CONNECTION=jdbc:mysql://mysql:3306/identity_service identity-service:0.0.1


docker run --name identity-service --network identity-network -p 8080:8080 -e DBMS_CONNECTION=jdbc:mysql://mysql:3306/identity_service loanxinhiu/identity_service_pudo:latest


