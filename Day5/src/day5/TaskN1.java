package day5;

public class TaskN1 {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.setModel("Tesla Model X");
        car1.setColor("White");
        car1.setReleaseYear(2028);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println("Release year: " + car1.getReleaseYear());
    }
}
// Done
class Car {
    private int releaseYear;
    private String color;
    private String model;

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

}