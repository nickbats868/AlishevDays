package day7;

public class TaskN1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Warsaw","KUKUMETTO", 1999, 183881, 150);
        Airplane plane2 = new Airplane("Germany", "JUSEPPE", 1989, 143220,150);

        Airplane.compareAirplanes(plane1, plane2);
        plane2.info();
    }
}
