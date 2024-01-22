package Lessons14_20;

public class Lesson19 {

    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Mikalai");
        human1.setAge(23);
        human1.setImportantEvent("Started working in the company as a programmer");

        human1.getInfo();
    }

}

class Human {
    private String name;
    private int age;
    private String importantEvent;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setImportantEvent(String impEvent) {
        importantEvent = impEvent;
    }

    public String getImportantEvent() {
        return importantEvent;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
        System.out.println(importantEvent);
    }
}




