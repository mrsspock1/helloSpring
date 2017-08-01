package pl.akademiakodu.helloSpring.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Agnieszka on 2017-07-27.
 */
public class Lotto {
    public static Set<Integer> getRandomNumbers(){
        Set<Integer> numbers = new HashSet<>();
        Random rand = new Random();
        while(numbers.size() != 6) {
            int x = rand.nextInt(49) + 1;
            numbers.add(x);
        }
        return numbers;
    }
}
