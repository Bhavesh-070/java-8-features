package com.revision.streams;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Topic: Stream API - filter() & collect()
 * Description:
 * Demonstrates basic functional filtering on integer collections using Java 8 Streams.
 * - Example 1: Filtering even numbers from a list.
 * - Example 2: Filtering employees by salary threshold (> 50,000).
 */
public class Problem_01 {

	 private static final Logger logger = Logger.getLogger(Problem_01.class.getName());
	 
    public static void main(String[] args) {
        // Example 1: Find all even numbers using Stream API
        List<Integer> numbers = Arrays.asList(10, 51, 84, 51, 513, 263, 65, 62);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        logger.info("Even Numbers: " + evenNumbers);

        // Example 2: Filter salaries greater than 50,000
        List<Integer> salaries = List.of(10000, 200000, 50000, 60000, 40000, 90000);
        List<Integer> highSalaries = salaries.stream()
                .filter(salary -> salary > 50000)
                .collect(Collectors.toList());
        logger.info("Salaries > 50,000: " + highSalaries);
    }
}
