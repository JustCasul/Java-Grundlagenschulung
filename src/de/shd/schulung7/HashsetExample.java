package de.shd.schulung7;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        int a = 15;
        Integer b = Integer.valueOf(a);
        numbers.add(b);
        numbers.contains(b);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

}
