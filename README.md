# Friend Demo
It is Spring Boot (Web) Project for demo purpose.

## Project Requirement
- JDK 1.8+
- Maven 3.2+
- Spring Boot 2.1.8.RELEASE
- Springfox Swagger 2.8.0
- Jaxb api 2.3.0
- Any IDE (STS/Eclipse)

## Project Resources
- Web/Spring MVC (spring-boot-starter-web)
- Swagger 2 (springfox-swagger2)
- Swagger UI (springfox-swagger-ui)
- Jaxb api (jaxb-api)

##Run by:
mvn spring-boot:run

## API Docs
http://localhost:8080/swagger-ui.html

## API Endpoints
### get /api/v1/friends
### post /api/v1/friends

## Project Docs
- @RestController will have @Controller and @ResponseBody
- @RequestMapping for mapping request
- @Api for API doc by using Swagger
- @GetMapping for HTTP Get
- @PostMapping for HTTP Post
- @ApiOperation for API doc by using Swagger
- @RunWith
- @WebMvcTest
- @SpringBootTest
- @AutoConfigureMockMvc

## Project Dependency in pom.xml
### Web is Spring MVC (required)
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-test</artifactId>
	<scope>test</scope>
</dependency>
### Swagger is the library to build API Docs (optional)
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>2.8.0</version>
</dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger-ui</artifactId>
	<version>2.8.0</version>
</dependency>
### Jaxb api is the helper library to bind Swagger XML (optional)
<dependency>
	<groupId>javax.xml.bind</groupId>
	<artifactId>jaxb-api</artifactId>
</dependency>


## Note
### Why need Jaxb api? It will error like this if not add dependency:
o.s.boot.SpringApplication              [0;39m [2m:[0;39m Application run failed
Error creating bean with name 'xmlModelPlugin': Lookup method resolution failed;
Caused by: java.lang.IllegalStateException: Failed to introspect Class [springfox.documentation.schema.XmlModelPlugin] from ClassLoader [jdk.internal.loader.ClassLoaders$AppClassLoader@28c97a5]
