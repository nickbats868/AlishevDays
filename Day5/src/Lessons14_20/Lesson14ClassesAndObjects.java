package Lessons14_20;

public class Lesson14ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Roma";
        person1.age = 30;
        System.out.println("My name is " + person1.name+", "+"мне " + person1.age+" лет");
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 22;
        System.out.println("My name is " + person2.name+", "+"мне " + person2.age+" лет");

    }
}

class Person{
    //The class may have:
    String name; int age; //data (fields)
    //actions that it can perform (methods)
}

