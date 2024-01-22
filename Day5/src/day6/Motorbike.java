package day6;

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

    public void info() {
        System.out.println("Это мотоцикл");
        System.out.println(releaseYear + " " + color + " " + model);
    }

    public int yearDifference(int transferred_year) {
        int age_difference = transferred_year - releaseYear;
        return age_difference;
    }


}


