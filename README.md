# idea-refinery
Task Assignment for Idea Refinery
The Task Assignment API takes requests and displays output based on the operations,
which are CREATE, READ, and UPDATE.

##Table of Contents
- Requirements
- Setup/Instructions
- Troubleshooting

## Requirements
This api requires:
	- JRE version 23 (Java Runtime Environment), preferably an IDE compatible with Maven
	- testing suite such as PostMan or Swagger

## Setup and Instructions
(1) Download the project. 
(2) Open the project on your IDE. 
(3) Run the taskassingmentApplication.
(4) Check the port number.
(5) On Postman, select the type of API call you would like to request.
(6) Enter the URL.

For example, to create a task, you would select POST and type: 
http://localhost:8080/task/createTask

Select the Body tab and type:
{
        "title": "Inventory",
        "id": 3,
        "description": "Open the Invetory App and enter the quantity of item.",
        "completed": true,
        "createDate": "2023-09-17T18:25:43.511+00:00",
        "completeDate": "2023-09-19T20:25:43.511+00:00"
}

## Troubleshooting
Should the program fail, 
(1) check for a stable Internet connection
(2) be sure that the Java version is 23
(3) check to make sure you're using the correct port number in the IDE after
(4) check the console logs
