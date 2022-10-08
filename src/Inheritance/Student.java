package Inheritance;

public class Student extends Person{

    int StudentId;

    public Student(String clientsName, int clientsAge, int StudentId) {
        super(clientsName, clientsAge);
        this.StudentId = StudentId;
    }

    @Override
    public void breath() {
        System.out.println(name + " сказал я студент . Вдох-выдох. Мне " + age + " лет и мой" +
                "ID = " + StudentId);
    }
}
