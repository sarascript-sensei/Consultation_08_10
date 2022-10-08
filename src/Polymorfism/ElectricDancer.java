package Polymorfism;

public class ElectricDancer extends Dancer{
    public ElectricDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
       super.dance();
       if(age < 15){
           System.out.println("Молодой танцор");
       }else{
           System.out.println("Повидавший танцор");
       }
    }
}
