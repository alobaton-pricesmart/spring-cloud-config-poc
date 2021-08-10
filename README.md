# spring-cloud-config-poc

Spring Cloud Config POC

## How to start?

Go to `springcloudconfigpoc` folder and compile the project:

```bash
cd springcloudconfigpoc && mvn clean package
```

Go to `server` module and start the server:

```bash
cd server && mvn spring-boot:run -DskipTests=true
```

Go to `client` module and start the client:

```bash
cd client && mvn spring-boot:run -DskipTests=true
```

Get `dev` properties:

```bash
curl --location --request GET 'http://localhost:8080/client/dev/main' \
--header 'Authorization: Basic cm9vdDpzM2NyM3Q='
```

Test client integration:

```bash
curl --location --request GET 'http://localhost:8081'
```