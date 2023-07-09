package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *  1. Завдання фільтрації (filter()) і мапування (map()):
 *         Створіть список цілих чисел із декількох значень (згенерувати випадкових 10 чисел).
 *         Використовуючи метод filter(), відфільтруйте лише парні числа.
 *         Використовуючи метод map(), помножте кожне число на 2.
 *         Виведіть результат на екран.
 *  2. Завдання перевірки (anyMatch()) і умови (allMatch()):
 *         Створіть список рядків, який містить кілька назв фруктів.
 *         Використовуючи метод anyMatch(), перевірте, чи містить список хоча б одне слово, що починається з літери "А".
 *         Використовуючи метод allMatch(), перевірте, чи всі рядки в списку складаються тільки з великих літер.
 *         Виведіть результати на екран.
 * 3. Завдання збору результатів (collect()):
 *         Створіть список рядків, що містить кілька імен.
 *         Використовуючи метод collect(), зіберіть всі рядки у вигляді одного рядка, розділеного комами.
 *         Виведіть отриманий результат на екран.
 * 4. Завдання обрізання (takeWhile()):
 *         Створіть список цілих чисел, який містить послідовність чисел.
 *         Використовуючи метод takeWhile(), видаліть всі елементи, що є меншими за 5.
 *         Виведіть новий список на екран.
 */
public class StreamTasks {
    public static void main(String[] args) {
        Random random = new Random();
        String separatorLine = "-".repeat(20);

        List<Integer> randomList = random.ints(10, 0,50).boxed().toList();
        List<Integer> task1 = filterAndMap(randomList);
        System.out.println("Task - 1");
        System.out.println(randomList);
        System.out.println(task1);
        System.out.println(separatorLine);

    }

    public static List<Integer> filterAndMap(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
    }

    public static boolean anyMatchStartsWithA(List<String> fruits) {
        return fruits.stream()
                .anyMatch(fruit -> fruit.startsWith("A"));
    }

    public static boolean allMatchAreUpperCase(List<String> fruits) {
        return fruits.stream()
                .allMatch(fruit -> fruit.equals(fruit.toUpperCase()));
    }

    public static String collectNames(List<String> names) {
        return names.stream()
                .collect(Collectors.joining(", "));
    }

    public static List<Integer> takeWhileLessThanFive(List<Integer> sequence) {
        return sequence.stream()
                .takeWhile(n -> n < 5)
                .toList();
    }
}
