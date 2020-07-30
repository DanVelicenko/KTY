package theproject;

//Java basic - variables, strings etc. (crash course)

import theproject.human.Student;

import static theproject.example.LectureExamples.*;

public class JavaCourse {
    private String firstName;
    private String lastName;
    private String age;

    public static void main(String[] args) {
        System.out.println();

        someprint();

        Student student = new Student("Arnolds", "Makds", 44, true);
    }

    public void Student(String firstName, String lastName, String age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }