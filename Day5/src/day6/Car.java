package day6;


// Done
class Car {
    private int releaseYear;
    private String color;
    private String model;

    public Car(){
        releaseYear = 2027;
    }

    public void setReleaseYear(int releaseYear){
       this.releaseYear = releaseYear;
    }
    public int getReleaseYear(){
         return releaseYear;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int transferred_year){
        int year_difference = releaseYear - transferred_year;
        return year_difference;
    }

}