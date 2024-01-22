package day5;

public class TaskN2 {
    public static void main(String[] args) {
        Motorbike mbike1 = new Motorbike(2027,
                                         "dark blue",
                                         "yoshimitsu");
        System.out.println("My bike: ");
        System.out.println("Release year: " + mbike1.getReleaseYear());
        System.out.println("Color: " + mbike1.getColor());
        System.out.println("Model: " + mbike1.getModel());
    }
}
//Done

class Motorbike {
    private int releaseYear;
    private String color;
    private String model;

    public Motorbike(int releaseYear, String color, String model) {
        this.releaseYear = releaseYear;
        this.color = color;
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}


