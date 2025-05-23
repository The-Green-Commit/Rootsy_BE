# ROOTSYapp
![image](https://github.com/user-attachments/assets/e70a08c7-3357-4c66-89a8-b0fc380b9801)
<br>
***your plant friend***

## 📖 Description
Rootsy is an app designed for plantlovers 🌿! 

We're designing a SPA in ReactJS with a clear objective: to be informative and participative at the same time.
We have a DB with plenty of indoor and outdoor plants, with indivualized info: the family, the genus, if it's indoor or outdoor and if it's petfriendly, a small description, and more.

### FIRST RELEASE
These are the planned functionalities planned for the first version of this app: <br>
<br>
  🌱 landing page with a random plant that will change each time you leave and come back to it <br>
  🌱 search page with filters to help the user find the plant they need <br>
  🌱 plant details page with specific information regarding the plant chosen <br>

### Future releases
For each plant, the users will be able to comment their thoughts, share their own plant image.
The users will be able to comment on each plant once they register with a valid username and password, which are the only sensitive data necesarry and that won't be used for any extra purpose.
If a user notices there's a plant missing, he will be able to write to the creators requesting a new plant to be added. For that, they will have to provide full information of the plant, filling up a form with all the inputs necesarry.

For future releases, we're also planning on launching a forum, in which the users will be able to create posts to discuss and seek for any plant help they need.

*Note.1: this is not a social media app. It's a colaborative WIKI 📖* <br>
*Note.2: this repo needs to be followed by it's associated backend repo designed in Java Spring Boot. Please checkout the organization page to see it*

## 🛠️ Technologies
- **Java 21**  
- **Spring Boot 3.4.5** (Web, Data JPA)  
- **Maven** (Dependencies)
- **DB Config** dotenv-java 3.0

## 📌 Tools
- **VSCode**
- **PostgreSQL 42.7.5** (DB)
- **Postman 11.41** (endpoint testing)
- **Task management:** Trello
- **Gitflow:** Git - GitHub

## 📡 Endpoints: complete CRUD implemented
### GET
### POST
### PATCH
### DELETE

## 📊 Database

### Database Structure
The project uses JPA/Hibernate to automatically create tables in the database. The main entities are:

- **Plant**: The base of it all ☘
- **Comment**: Contains users comments on each plant and, later, at the forum
- **User**: Stores information about users who comment and their emails/password
- **Family**: Scientific classification
- **Genus**: Scientific classification
- **Type**: If a plant is indoor or outdoor.

  ![image](https://github.com/user-attachments/assets/949de676-abdc-4baa-875b-bc8e1efb0e15)


### ✅ Validations
Exception handling and validation are being done in the following ways:
- **in entities**: through Spring Boot tags such as @Size, @NotNull, @NotBlank, among others.
- **in the exception handler**: there is an exception handling file called GlobalExceptionHandler that handles exceptions with control over data present in the DB.

### ⚠️ Important!
>**This backend connects to a ReactJs frontend that must be active for full functionality.** <br>


## 🔗 Aditional info
🌲 Organization Repo: [The Green Commit](https://github.com/The-Green-Commit) <br>
🎨 FE Code: [Rootsy Frontend](https://github.com/The-Green-Commit/Rootsy_FE) <br>
📂 BE Code: [Rootsy Backend](https://github.com/craft-coders-llc/commit-me-BE)
