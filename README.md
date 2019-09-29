# Task-manager-server

## Requirements

For building and running the application you need:

- [PostgreSQL 9.5](https://www.postgresql.org)  or higher
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or [Liberica OJDK](https://bell-sw.com/pages/java-11.0.4/)
- [Apache Maven](https://maven.apache.org)

## Steps to Setup

**1. Clone the repository**

```bash
git clone https://github.com/RamazanovRR/Task-manager-server.git
```

**2. Configure PostgreSQL**

First, create a database named `Task-List`. Then, open `src/main/resources/application.properties` file and change the spring datasource username and password as per your PostgreSQL installation.

**3. Run the app**

Type the following command from the root directory of the project to run it -

```bash
mvn spring-boot:run
```

Alternatively, you can package the application in the form of a JAR file and then run it like so -

```bash
mvn clean package
java -jar target/task-manager-0.0.1-SNAPSHOT.jar
```

