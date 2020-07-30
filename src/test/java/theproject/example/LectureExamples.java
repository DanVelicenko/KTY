package theproject.example;

import theproject.human.Student;
import theproject.school.ClassRoom;
import theproject.example.ClassRoomExample;

import java.util.ArrayList;

public class LectureExample {
    public static void someprint() {
        System.out.println("Hello, today date: ");
        System.out.println(java.time.LocalDate.now());

        System.out.println("And time: ");
        System.out.println(java.time.LocalTime.now());

        String stringvariable = "Thank You!!!";
        System.out.println(stringvariable);

        public static void classRoomExample();{
            ClassRoom classroom = new ClassRoom(233, "Maija");

            System.out.println(new ClassRoom(355, "Maija"));

            ArrayList<Student> studentListFromClassroom = ClassRoom.getStudentList();
            Student firstStudentFromList = studentsListFromClassroom(0);
        }

        private static ArrayList<Student> studentCreator() ;{
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("Maija", "Berza", 34, true, "1111111"));
            students.add(new Student("Elza", "Farva", 52, false, "2222"));
            students.add(new Student("Luize", "Anamarija", 13, true, "34343"));
            students.add(new Student("Anita", "Ramka", 16, true, "555555"));

            System.out.println("Students in classroom: " + studentsListFromClassroom.size();

            return;
        }
    }
}