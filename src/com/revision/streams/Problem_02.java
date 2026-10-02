package com.revision.streams;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Topic: Stream API - map(), filter() & Method References (::)
 * 
 * Problem:
 * Given a list of employee names: ["john", "alex", "bhavesh", "sarah"]
 * 1. Convert all names to uppercase.
 * 2. Filter out names with length less than 5 characters (keep names with length >= 5).
 * 3. Collect into a list and log the result.
 * 
 * Key Concepts:
 * - String::toUpperCase (Method reference)
 * - filter(predicate)
 * - Collectors.toList()
 */
public class Problem_02 {

    private static final Logger logger = Logger.getLogger(Problem_02.class.getName());

    public static void main(String[] args) {
        List<String> names = List.of("john", "alex", "bhavesh", "sarah");

        logger.info("Processing names stream...");

        List<String> result = names.stream()
                .map(String::toUpperCase)
                .filter(name -> name.length() >= 5)
                .collect(Collectors.toList());

        logger.info("Filtered Uppercase Names: " + result);
    }
}
