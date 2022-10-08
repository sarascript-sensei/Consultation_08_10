package Inheritance;

public class Person {
    String name;
    int age;



    public Person(String clientsName, int clientsAge){
        this.name = clientsName;
        this.age = clientsAge;
    }


    public void breath(){
        System.out.println(name + "сказал Вдох-выдох и его возраст: " + age);
    }

}

// Создайте 3 класса, которые наследуются от Person (Student, BankWorker, Mother)
// Унаследуйте имя и возраст от класса Person и добавьте переменные и методы, характерные для этих классов
