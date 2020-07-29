package theproject.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LectureExamples {
    public static void someprint() {
        System.out.println("Hello, today date: ");
        System.out.println(java.time.LocalDate.now());

        System.out.println("And time: ");
        System.out.println(java.time.LocalTime.now());

        String stringvariable = "Thank You!!!";
        System.out.println(stringvariable);
    }
        public static String getsomeText() {
            return "So far so good";
        }

        public static void arrayExample(){
            String[] carNames={"Tojota", "Nissan", "BMW", "Lada"};
            System.out.println(carNames[2]);

            carNames[2] = "Tesla";
        }

        public static void exple(){
            Map<Integer, String> people= new HashMap<Integer, String>();
            people.put(11, "Rembo");
            people.put(444, "Alex");

            System.out.println(people);

        }

        public static void retro(){
            List<String> someNames = new ArrayList<>();
            someNames.add("BMW");
            someNames.add("Toyota");
            someNames.add("Hunday");
            someNames.add("Jeep");

            someNames.set(1, "Tractor");

        /*System.out.println("Other array list: " + someNames.get(1));
        List<Integer> aha = new ArrayList<>();
        List<Object>[] rr ={aha};
        System.out.println(

                imutable list - java, library */
        }

    /*private static void sumething(int sumenumbers){
        if (sumenumbers == 1){
            System.out.println("Nop dude, number is one");
        } else if(sumenumbers < 1){
            System.out.println("Youre wrong");
        } else(sumenumbers > 1){
            System.out.println("Exactly, it is 0");
        }*/

        public static void bklaJavaCourse(char Course, char Prop){
            if (Course == Prop){
                System.out.println("Same");
            }else{
                System.out.println("Nop");
            }
        }
        public static void againTests(){
            for( int i=0; i<19; i++) {
                System.out.println("Itteration:" + i);
            }
        }
        public static void arraysExample(int abc) {
            for (int i = 0; i < abc; i++) {
                System.out.println("Itteration:" + i);
            }
        }

    }
