package com.bascomb;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        //Init
        List<Integer> heights = Arrays.asList(25, 12, 37);

        //Print Init State
        heights.forEach(System.out::println);

        //Print all heights less than 16;
        System.out.println("\nSmall Dogs (<16): ");
        heights.stream()
                .filter(h -> h < 16)
                .forEach(System.out::println);

        //Print all heights ordered largest to smallest;
        System.out.println("\n Shortest to Tallest: ");
        heights.stream()
                .sorted((a,b) -> a - b)
                .forEach(System.out::println);
    }
}
