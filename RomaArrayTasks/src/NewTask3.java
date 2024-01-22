import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class NewTask3 {
    public static void main(String[] args){

        //Creating
        ArrayList<Integer> array = new ArrayList<>();
        Random rnd = new Random();

        for (int iKey = 0; iKey<9; iKey++) {
            int value = rnd.nextInt(10);// Gen-ing a rnd numb from 0 to 9
            array.add(value);
            }

        System.out.println(array);



        // Creating a Map to count the number of repetitions
        HashMap<Integer,Integer> countMap = new HashMap<>();

       // counting the number of repetitions
        for(int number : array){
            if (countMap.containsKey(number)) {
                countMap.put(number,countMap.get(number) + 1);
            } else {
                countMap.put(number,1);
            }
        }

        //output of duplicate values and their number
        for(int key : countMap.keySet()){
            int count = countMap.get(key); //declaring a counter variable
            if (count > 1) {
                System.out.println("The number " + key + " repeats " + count + " times");
            }
        }
    }
}