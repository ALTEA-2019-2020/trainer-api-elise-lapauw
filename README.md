Lapauw Elise

M2 MIAGE FA - ALTEA

API Trainer
============


Launch
-------------------------
The application is available at 
https://lapauw-trainer-api.herokuapp.com/

Or you can launch it and use
http://localhost:8081/

API
--------------
This application contains the following routes : 

 - GET /trainers  -> returns all the trainers
 - GET /trainers/{name} -> returns the trainer named {name}
 - PUT / trainers -> updates a trainer
 - POST /trainers -> creates a new trainer
 - DELETE /trainers/{name} -> deletes the trainer named {name}

A postman collection is available in the src/test/resources folder

The app needs a username and a password detailed in application.properties file.
spring.security.user.name=lapauw  
spring.security.user.password=36829d4e-8de1-402b-8258-84d53eaabbd2
