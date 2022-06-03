package company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       String [] plans = new String[] {"wake up", "have breakfast", "go to work", "solve 5 tasks from codewars"};
            StringBuilder data = new StringBuilder("My plans:");
            for (int i = 0; i < plans.length; i++){
                data.append("\n" + (i+1) + ".)").append(" " + plans[i] + ";");
            }
            String result = data.toString();
            System.out.println(result);









    }

}
