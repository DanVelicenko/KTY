package theproject.human;

public class Student extends Human {
    private Boolean activeStudent;

    public Student(String firstName,String lastName,Integer age, Boolean activeStudent) {
        super(firstName, lastName, age);
        this.activeStudent = activeStudent;
    }

    public void setActiveStudent(Boolean activeStudent) {
        this.activeStudent = activeStudent;
    }
}
