package day7;

public class Airplane {
    private String producer;
    private String name;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, String name, int year, int length, int weight) {
        this.producer = producer;
        this.name = name;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ". Название: " + name + ". Год выпуска: "
                + year + ", длина: " + length + ", вес: " + weight +
                ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int addFuel) {
        fuel += addFuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        System.out.println("Длинна первого самолёта(" + airplane1.name + ") - " + airplane1.length);
        System.out.println("Длинна второго самолёта(" + airplane2.name + ") - " + airplane2.length);
        if (airplane1.length > airplane2.length) {
            System.out.println("Из двух самолётов длиннее - " + airplane1.name);
        } else if (airplane1.length < airplane2.length) {
            System.out.println("Из двух самолётов длиннее - " + airplane2.name);

        } else {
            System.out.println("Длинны самолётов равны.");
        }
    }
}
