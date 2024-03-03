# MCQ-QuizExam
## About this project:
**"MCQ Quiz-Exam"** is a simple Java-based quiz application allowing the `Admin` to add multiple-choice questions (MCQ), to the question bank in JSON format. While `Students` can log in, take a 
quiz consisting of 10 random questions from the bank, and receive immediate feedback on their performance. 

## Features of this project
### Admin
- Log in as an admin, allows user to add new questions to the question bank.
- Admin can add as many questions, as he wishes with 4 multiple choices and correct answer and it will be saved on the quiz.json file.
  
Here is a video demonstration how the admin is adding quiz questions to the question bank.
 ####  Admin Panel Showcase 
 [Link to Video](https://github.com/SanjidaSharmin8986/MCQ-QuizExam-JavaSimpleProject/blob/main/admin.mp4)
### Student
- Log in s a student, allows user to participte the quiz exam
- The user will see 10 random questions with options from the question bank.
- Each correct answer earns 1 point with no negative marking
- Lastly, the system calculates scores based on user responses and provides corresponding result messages.
 
## Prerequisite
- JDK

## Tools and Technology used:
- IntelliJ IDEA

## How to run this project:
- Clone this project
- Open `build.gradle` file as a project with IntelliJ IDEA
- Run `login.java`
- Enter `username: admin` & `password:1234` - if you want to log in as an admin. Enter `username: sanjida` & `password:1234` - if you want to log in as a student.
