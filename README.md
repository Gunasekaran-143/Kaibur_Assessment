# Kaibur_Assessment
**#6th question**__

Step 1: Import the packages
Step 2: Explanatory Data Analysis and Feature Engineering by reading the features and counting them.
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/1d1cb4af-d965-4753-a91b-8b4d7b2be130)

![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/c45c0816-5c61-4074-a8f7-2d97f09bb888)

Step 3: Done the visulaization by using bar chart, pie charts
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/a6d4f4fc-6729-45ad-aadf-0eba13439b4d)

![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/6ad2734c-5b1d-4af4-ad98-38e74a12fef1)

![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/e40d66de-efa1-4ffa-97bd-92cac6832101)

Step 4: Feature Engineering: Creating a new category column
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/bbba817d-9fce-4c9d-a4fd-f9e0f9bdecfd)

Step 5: Text Pre processing
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/d5ec46aa-a3cd-4af3-9bb5-5af0ba93b372)

Step 6: Selection of Multi-Classification Model. Split the data into training and testing sets and did TF-IDF Vectorization,
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/a717473e-3e3a-46c0-92be-0d9ba296acd9)

Step 7: Initialize different classifiers like Random Forest, Naive Bayes,SVM,Logistic Regression and did Train and evaluate each classifier and Display the results.
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/a795af85-4851-4568-9489-c9ee47a18675)

Step 8: Model Evaluation
Step 9: Example prediction on new data
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/0ac34b56-5ff0-4946-8fe1-ff2f04ad9dc0)


**_#question 1_**

Step 1: Create a new Spring Boot project
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/6ab8900b-5c29-40bd-b5bd-b6b760f50571)

Step 2: Define the Server Entity. Create a Server class to represent the server objects. This class should include fields such as id, name, language, and framework and also annotate this class as a MongoDB document.
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/1623eb10-b133-49c2-869a-5b351bb5c258)

Step 3: Create a Repository Interface. Create a repository interface that extends MongoRepository to perform database operations for the Server entity.
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/bbf54fa8-1e08-4958-a5f6-90a53af87eb8)

Step 4: Create a REST Controller. Create a REST controller to define the API endpoints for creating, retrieving, and deleting servers.
![image](https://github.com/Gunasekaran-143/Kaibur_Assessment/assets/134137559/c01b2ed3-af01-4cd1-910d-c4ba14bf7ac1)

Step 5: Configure the MongoDB connection in the application.properties file
Step 6: API
To create a server: POST http://localhost:8080/servers with JSON body.
To retrieve all servers: GET http://localhost:8080/servers.
To retrieve a server by ID: GET http://localhost:8080/servers/{id}.
To delete a server by ID: DELETE http://localhost:8080/servers/{id}.
To search servers by name: GET http://localhost:8080/servers/findByName/{name}
