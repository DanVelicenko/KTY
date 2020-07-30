package theproject.human;

public class Student extends Human{
    private Boolean isActiveStudent;

    public Student(String name, String surname, Integer age, Boolean isActiveStudent, String personCode){
        super(name, surname, age, personCode);
        setActiveStudent(isActiveStudent);
    }

    public Boolean getActiveStudent() {
        return isActiveStudent;
    }

    public void setActiveStudent(Boolean activeStudent) {
        isActiveStudent = activeStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "isActiveStudent=" + isActiveStudent +
                '}';
    }
}
