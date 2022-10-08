package Polymorfism;

public class BreakDancer extends Dancer{
    public BreakDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "Я танцую брейкданс");
    }
}
