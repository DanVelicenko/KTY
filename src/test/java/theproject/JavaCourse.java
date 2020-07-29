package theproject;

import javax.lang.model.element.VariableElement;

//Java basic - variables, strings etc. (crash course)

public class JavaCourse {
    public static void main(String[] args) {
        System.out.println("Hello, today date: ");
        System.out.println(java.time.LocalDate.now());

        System.out.println("And time: ");
        System.out.println(java.time.LocalTime.now());

        String stringvariable = "Thank You!!!";
                System.out.println(stringvariable);

        System.out.println(getsomeText());
    }

    private static String getsomeText() {
        return "So far so good";
    }

}