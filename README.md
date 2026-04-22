# Weather-Calendar-Web-application
The Weather Calendar is a web application that displays a calendar with weather information such as temperature and probability of rain for upto 16 days from the current date. The web application also features an authentication system using Google's OAuth2 authentication and a dedicated weather page for more detailed weather information, such weather information is obtained via an external api call to open-meteo's weather api. The web application was built using Java and the Spring Boot framework with the following dependencies: lombok, thymeleaf, spring security and OAuth2 client.

The Weather Calendar is based on a microservices architecture with 3 microservices handling all http requests and endpoint calls.

They are as follows:
1. FE (Abbreviation of Front End): The FE microservice handles all incoming hhtp requests made via a GUI to its controllers


2. Calendar: The Calendar microservice handles requests from the FE microservice that pertain to showing the calendar and obtaining weather information from an external api call to provide 16 days worth of weather information to the client


3. Weather: The Weather microservice handles requests from the FE microservice that pertain to showing a dedicated weather page with more details with such details obtained from an external api call to provide current weather information to the client

The web application was deployed on Google Cloud by building a docker image and docker container for all the 3 microservices and added to a kubernetes cluster. The ip address to the web application is provided below.

Link to the Web application:
[Click me](http://35.186.220.230.nip.io/home)


Home page:
<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/f08d6f51-4fce-4dc9-b57f-b40307ddfcbc" />

Calendar page:
<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/03f87526-a620-4d55-b7bd-10d4150a406f" />

Weather page:
<img width="1920" height="1020" alt="image" src="https://github.com/user-attachments/assets/a26ca7dc-3231-40b9-8776-bcc114d699dc" />


