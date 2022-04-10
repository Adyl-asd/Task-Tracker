# Task Tracker web app
This is a web application for tracking tasks within projects. It allows creating, editing, viewing and deleting projects, as well as tasks associated with them.

Project is mostly written on Java 11, Spring Boot version 2.5.3 and assembled with Maven. 

My choice of DBMS was MySQL due to having the most experience with it, while also using Flyway Migrations to add tables and data to the database. 

I used JQuery 3.6.0, Bootstrap 5.1 and Apache Freemarker to implement frontend.

Swagger is also implemented for API documentation.

I have been initially planning to include unit tests for services, but didn't have enough time for that unfortunately. I will most likely add them at some point. I was also planning to deploy the app using Docker and faced the same problem.

# Installing and starting the app
## Database
Firstly, you need to have MySQL server installed on your PC. You will need to create "task_tracker" schema and make sure that it is empty.

Next, after downloading the project repository, you will need to change the "application.properties" file located in "src/main/resources/application.properties".

spring.datasource.url= jdbc:mysql://localhost:3306/task_tracker - In case you have a different port (3306 here), please insert your value

spring.datasource.username=root - "root" is the default username in MySQL, also needs to be changed if you have a different one

spring.datasource.password=Asd123456 - this field is the password you set during MySQL server setup, same as everything else, needs to be changed

## Jar
If you have an IDE like IntelliJ IDEA you can simply build the app from there. 

However, if you don't, you can assemble the .jar file using maven and launch the generated .jar file. Please refer to Maven documentation.

After all that is done, you should be set.

http://localhost:8080/ - should direct you to app

http://localhost:8080/swagger-ui/ - Swagger UI
