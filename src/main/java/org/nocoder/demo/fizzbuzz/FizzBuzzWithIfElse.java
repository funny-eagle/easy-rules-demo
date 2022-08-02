package org.nocoder.demo.fizzbuzz;

/**
 * @author yangjl
 * @description fizz buzz
 * @date 2022-08-01 21:47
 **/
public class FizzBuzzWithIfElse {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (((i % 5) == 0) && (((i % 7) == 0))) {
                System.out.println("fizzbuzz");
            } else if ((i % 5) == 0) {
                System.out.println("fizz");
            } else if ((i % 7) == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
            System.out.println();
        }
    }
}
