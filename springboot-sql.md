```
============================================================
install Postgres or Mysql and the the following sql
============================================================

CREATE TABLE movie (
	id bigserial primary key,
	movie_name TEXT NOT NULL,
	release_date DATE NOT NULL,
	unique(movie_name)
);

CREATE TABLE super_hero (
	id bigserial primary key,
	super_hero_name TEXT NOT NULL,
	movie bigint REFERENCES movie(id),
	unique (super_hero_name, movie)
);

insert into movie(movie_name, release_date) values ('The Incredible Hulk', now());
insert into super_hero(super_hero_name, movie) values ('Hulk', );

============================================================
add the following maven dependencies:
============================================================

<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>

<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jdbc</artifactId>
</dependency>

============================================================
add the following to application.properties
============================================================

# Postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/bright
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=org.postgresql.Driver

# MySQL
#spring.datasource.url=jdbc:mysql://localhost:3306/bright
#spring.datasource.username=?
#spring.datasource.password=?
#spring.datasource.driver-class-name=com.mysql.jdbc.Driver

============================================================
Inject JdbcTemplate to your DataAccess services
============================================================

private JdbcTemplate jdbcTemplate;
```