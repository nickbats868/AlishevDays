package day6;

public class TaskN1 {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.info();
        System.out.println(car1.yearDifference(2010));

        Motorbike mbike1 = new Motorbike(2009,
                                         "black blue",
                                         "electro");
        mbike1.info();
        System.out.println(mbike1.yearDifference(2015));
    }
}

