package homework19.collection2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
        List<String> words = List.of("один", "два", "два", "три", "три", "три", "три", "четыре");

        printOddNumbers(nums);
        printEvenNumbersNoDuplicates(nums);
        printUniqueWords(words);
        printWordDuplicatesCount(words);
    }

    // Метод для задания 1
    public static void printOddNumbers(List<Integer> nums) {
        System.out.println("Задание 1");
        nums.stream()
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
        System.out.println();
    }

    // Метод для задания 2
    public static void printEvenNumbersNoDuplicates(List<Integer> nums) {
        System.out.println("Задание 2");
        nums.stream()
                .filter(num -> num % 2 == 0)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

    }

    // Метод для задания 3
    public static void printUniqueWords(List<String> words) {
        System.out.println("Задание 3");
        words.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();
    }

    // Метод для задания 4
    public static void printWordDuplicatesCount(List<String> words) {
        System.out.println("Задание 4");
        Map<String, Long> wordCounts = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordCounts.values().forEach(System.out::println);
    }
}
