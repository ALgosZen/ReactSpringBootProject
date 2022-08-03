## If you have Docker installed, it might be useful to run the database as a container.
## use docker compose to install mysql. safer to use arm64v8/mysql:oracle image for mac m1.
## JDK 11
## table insert on entity was not working , had to change to..
### spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
## host port mapping is important in docker compose for local connection
