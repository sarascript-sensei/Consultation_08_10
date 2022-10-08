import Inheritance.Person;
import Inheritance.Student;
import Polymorfism.BreakDancer;
import Polymorfism.Dancer;
import Polymorfism.ElectricDancer;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Наследование
        Person vasya = new Person("Vasya", 15);
        vasya.breath();

        Student michael = new Student("Michael", 20, 2412);
        michael.breath();

        //Полиморфизм
        Dancer dancer = new Dancer("Исмаил", 14);

        Dancer breakDancer = new BreakDancer("Алексей", 20);
        Dancer electroDancer = new ElectricDancer("Катя", 14);

        List<Dancer> party = Arrays.asList(dancer, breakDancer,electroDancer);

        for(Dancer d : party){
            d.dance(); //полиморфизный вызов метода
        }

    }
}
