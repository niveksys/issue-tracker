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

$ docker exec -it issue-tracker_db_1 /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P <password>
```

```sql
CREATE DATABASE issue_tracker_dev
CREATE LOGIN it_dev WITH PASSWORD = 'it_dev123'
ALTER AUTHORIZATION On DATABASE::issue_tracker_dev TO it_dev
```

```shell
$ kubectl apply -f k8s
$ kubectl get pod
$ kubectl port-forward mssql-64bb84b765-sws2k 1433:1433
$ kubectl port-forward redis-6954764c79-hv8rz 6379:6379
```