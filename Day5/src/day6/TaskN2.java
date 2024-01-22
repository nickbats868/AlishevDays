package day6;

public class TaskN2 {
    public static void main(String[] args){
        System.out.println();

        Airplane boing911 = new Airplane("China",
                            1999,77,162);
        boing911.info();
        System.out.println();

        boing911.fillUp(100);
        boing911.info();

        boing911.setYear(20003);
        boing911.setLength(100000);
        boing911.fillUp(4319);
        boing911.fillUp(555);
        boing911.info();

    }
}
