/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    public void testPizzaReport() {
        String expected = "8 people with 2 pizzas (16 slices)\n" +
                "Each person gets 2 pieces of pizza.\n" +
                "There are 0 leftover pieces.";
        String actual = App.getPizzaReport(8, 2, 8);
        Assertions.assertEquals(expected, actual);
    }
}