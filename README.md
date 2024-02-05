# weather
Simple Spring Boot weather application.

This project integrates Spring Boot, Spring Data JPA, Thymeleaf, and makes use of the OpenWeatherMap API to create a basic weather application. It follows the MVC (Model-View-Controller) pattern, where the controller handles requests, the service performs business logic, and the repository manages data access. Thymeleaf is used for dynamic HTML rendering, and configurations are specified in the application.properties file.

To summarize, the user requests a city's weather. The project displays the information in the page and inserts them into mySQL table.

The table structure:
Table: weather
Columns:
id int AI PK 
city varchar(255) 
description varchar(255) 
temperature double 
date date

Remember to modify your application.properties according to your api key and your mySQL database name.
