# Spring Boot - ServiceLayer (Using Implements)
This is a basic CRUD (Create, Read, Update, Delete) application built with Spring Boot, utilizing a service layer to handle business logic. The project uses Maven for build management and includes the following dependencies:

- JPA: For ORM and database interaction.
- Spring Web: To build web applications and RESTful services.
- DevTools: For developer tools and hot-reloading.
- MariaDB: As the database provider.

## Prerequisites
Ensure you have the following installed:
- JDK 17 or higher
- Maven 3.6+
- MariaDB 10.5+

## Project Setup
1. Clone the repository:
```sh
git clone https://github.com/yourusername/basic-crud-springboot.git
cd basic-crud-springboot
```
2. Build the project:
```sh
mvn clean install
```
3. Database Configuration
Update your application.properties or application.yml file with the appropriate MariaDB settings:
```sh
spring.datasource.url=jdbc:mariadb://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
Ensure MariaDB is running and the database is created before running the application.

## Running the Application
Start the Spring Boot application using the following command:

```sh
mvn spring-boot:run
```
The application will start on http://localhost:8080.

## API Endpoints
Below are the basic CRUD endpoints for the entity:

1. Test Endpoint
- URL: `/test`

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save DATA
- URL: `/save`
- Method: POST
- Description: Add a new device.
- Request Body: json in postman
  ```sh
    {
    "modelname":"redmi note 9 pro max",
    "companyname":"redmi",
    "devicetype":"smartphone",
    "price":20000
    }

3. Get All Student data
- URL: `/show`
- Method: GET
- Description: List of all device.
  
4. Retreving data using Name or Id.
- URL: `/name/{modelname}` or `/{deviceid}`
- Method: GET
- Description: Returns a list of all device data.

5. Updating Student data
- URL: `/update/{deviceid}`
- Method: PUT
- Description: Updates all fields of data.

6. Deletion of student data
- URL: `/delete/{deviceid}`
- Method: DELETE
- Description: Delete device data of provided id.
  
## Built With
- Spring Boot - Framework for building Java applications.
- JPA - For ORM and database interactions.
- MariaDB - Open-source relational database.
- Maven - Build tool for managing dependencies and building the project.
