package theproject;

//Java basic - variables, strings etc. (crash course)

import theproject.human.Student;
import static theproject.example.LectureExamples.*;

public class JavaCourse {
    private static Object Student;
    private String firstName;
    private String lastName;
    private String age;
    private String personCode;

    public static void main(String[] args) {
        System.out.println();
        System.out.println(Student);

        someprint();
        ClassRoom();

        new Student("Arnolds", "Makds", 44, 444, true);
    }

    private static void ClassRoom() {


    }

    public static void Student(String firstName, String lastName, String age, String personCode){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.personCode = personCode;
        }
    }