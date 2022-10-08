package Polymorfism;

public class Dancer {
    String name;
    int age;

    public Dancer(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void dance(){
        System.out.println(toString() + "Я танцую как все");
    }

    @Override
    public String toString(){
        return "Я " + name + ", мне" + age + "лет.";
    }

}
