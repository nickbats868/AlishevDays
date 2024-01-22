package Lessons14_20;

public class Lesson20 {
    public static void main(String[] args){
        Humman human1 = new Humman("PIDORASOV");

    }
}

class Humman{
    private String surname;
    private int age;

    public Humman(){
        System.out.println("Я - human1, объект класса Lessons15_20.Humman - пустой внутри и снаружи...");
    }

    public Humman(String surname){
         this.surname = surname;
         System.out.println("My surname is: " + surname);
    }

    public void setName(String surname) {this.surname = surname; }

    public void setAge(int age) {this.age = age; }
}
