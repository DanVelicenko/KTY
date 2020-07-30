package theproject.school;

import theproject.human.Student;

import java.util.ArrayList;

public class ClassRoom {
    private Integer classRoomNumber;
    private ArrayList<Student> studentList;

    public ClassRoom(Integer classRoomNumber, ArrayList<Student> studentList) {
        setClassRoomNumber(classRoomNumber);
        setStudentList(studentList);
    }

    public Integer getClassRoomNumber() {
        return classRoomNumber;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setClassRoomNumber(Integer classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudents(Student xxx){
        this.studentList.add(xxx);
    }
}