import java.util.stream.IntStream;

/**
 * Напишите программу, которая выводит на экран числа от 1 до 100.
 * При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
 * а вместо чисел, кратных пяти — слово «Buzz». Если число кратно и 3, и 5,
 * то программа должна выводить слово «FizzBuzz»
 */
public class BuzzFeed {

    public static void buzzFeedStreams(int max) {
        IntStream.rangeClosed(1, max)
                .mapToObj(i-> i%3==0 ? (i%5==0 ? "FizzBuzz ":"Fizz ") : (i%5==0 ? "Buzz ": i+" "))
                .forEach(System.out::println);
    }

    public static void buzzFeed(int max) {
        for (int i = 0; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        buzzFeedStreams(100);
    }
}
