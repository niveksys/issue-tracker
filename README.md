# Issue Tracking Tool with Spring Boot

Run Microsoft Azure SQL Edge with Docker

```
$ docker run --name sqledge --cap-add SYS_PTRACE -e 'ACCEPT_EULA=Y' -e 'MSSQL_SA_PASSWORD=yourStrong(!)Password' -p 1433:1433 -v ~/Volumes/sqledge:/var/opt/mssql -d mcr.microsoft.com/azure-sql-edge
```

```
$ docker build -t issue-tracker .
$ docker-compose config
$ docker-compose up --build
$ ./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=issue-tracker
$ docker-compose up -d --scale app-server=3
```
