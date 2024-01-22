package day6;

import java.util.concurrent.ThreadLocalRandom;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        int min = 2;
        int max = 5;
        int randomEvalue = ThreadLocalRandom.current().nextInt(min, max + 1);
        String assessment;

        switch (randomEvalue) {
            case 2:
                assessment = "неудовлетворительно";
                System.out.println(randomEvalue);
                break;
            case 3:
                assessment = "удовлетворительно";
                System.out.println(randomEvalue);
                break;
            case 4:
                assessment = "хорошо";
                System.out.println(randomEvalue);
                break;
            case 5:
                assessment = "отлично";
                System.out.println(randomEvalue);
                break;
            default:
                assessment = "Клоун";
                break;
        }

        StringBuilder result = new StringBuilder();
        result.append("Преподаватель ").append(name)
                .append(" Оценил студента с именем ")
                .append(student.
                        getName()).append(" по предмету ")
                .append(getSubject()).append(" на оценку ")
                .append(assessment);
        System.out.println(result.toString());
    }
}
