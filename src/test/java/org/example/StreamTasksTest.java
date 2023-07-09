package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.StreamTasks.*;
import static org.junit.jupiter.api.Assertions.*;

class StreamTasksTest {
    @Test
    public void testFilterAndMap() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(4, 8, 12, 16, 20);
        List<Integer> result = filterAndMap(numbers);
        assertEquals(expected, result);
    }

    @Test
    public void testAnyMatchStartsWithA() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Avocado");
        boolean result = anyMatchStartsWithA(fruits);
        assertTrue(result);
    }

    @Test
    public void testAllMatchAreUpperCase() {
        List<String> fruitsLowerCase = Arrays.asList("Apple", "Banana", "Orange", "Avocado");
        boolean result = allMatchAreUpperCase(fruitsLowerCase);
        assertFalse(result);

        List<String> fruitsUpperCase = Arrays.asList("APPLE", "BANANA", "ORANGE", "AVOCADO");
        boolean resultUpperCase = allMatchAreUpperCase(fruitsUpperCase);
        assertTrue(resultUpperCase);
    }

    @Test
    public void testCollectNames() {
        List<String> names = Arrays.asList("John", "Jane", "Mike", "Emily");
        String expected = "John, Jane, Mike, Emily";
        String result = collectNames(names);
        assertEquals(expected, result);
    }

    @Test
    public void testTakeWhileLessThanFive() {
        List<Integer> sequence = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = takeWhileLessThanFive(sequence);
        assertEquals(expected, result);
    }
}