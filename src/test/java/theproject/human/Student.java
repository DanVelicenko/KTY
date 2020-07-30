package theproject.human;

public class Human {
    private String name;
    private String surname;
    private Integer age;
    private String personCode;

    public Human() {
        name = "Jānis";
        surname = "Kalniņš";
        age = 24;
    }

    public Human(String name, String surname, Integer age, String personCode) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setPersonCode(personCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetter(name.charAt(i))) {
                this.name = name;
            }
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        for (int i = 0; i < surname.length(); i++) {
            if (Character.isLetter(surname.charAt(i))) {
                this.surname = surname;
            }
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = age * (-1);
        }
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '' ' +
        ", surname='" + surname + '' ' +
        ", age=" + age +
                ", personCode='" + personCode + '' ' +
        '}';
    }
}