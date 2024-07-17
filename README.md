## Student Management Application

The Student Management Application is a web-based system developed using React for the frontend and Spring Boot with MongoDB for the backend. This application facilitates adding, viewing, and managing student information efficiently.


### Description

The Student Management Application allows users to perform the following actions:

- Add new students with details such as name, email, date of birth, and program.
- View a comprehensive list of all registered students.
- Automatically calculate and display each student's age based on their date of birth.

### Technologies Used

- **Frontend:** React
- **Backend:** Spring Boot
- **Database:** MongoDB

### Setup

#### Backend (Spring Boot)

1. Clone the repository:
   ```
   git clone <repository-url>
   cd <repository-folder>
   ```

2. Configure MongoDB connection in `application.properties`:
   ```
   spring.application.name=MongoProject
   spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.ofr17lj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
   ```

3. Build and run the Spring Boot application:
   ```
   mvn clean install
   mvn spring-boot:run
   ```

#### Frontend (React)

1. Navigate to the frontend directory:
   ```
   cd frontend
   ```

2. Install dependencies:
   ```
   npm install
   ```

3. Start the React development server:
   ```
   npm start
   ```

### Usage

1. Ensure both backend and frontend projects are running.
2. Open your web browser and go to http://localhost:3000.
3. Use the provided form to add new students by entering their name, email, date of birth, and program.
4. View the list of students displayed in a table below the form. The table includes student details and their calculated age.

### Author

Hann Jang

