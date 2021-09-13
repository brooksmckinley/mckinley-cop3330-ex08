/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people? ");
        int people = scan.nextInt();
        System.out.print("How many pizzas do you have? ");
        int pizzas = scan.nextInt();
        System.out.print("How many slices per pizza? ");
        int slicesPerPizza = scan.nextInt();

        System.out.println(getPizzaReport(people, pizzas, slicesPerPizza));
    }

    public static String getPizzaReport(int people, int pizzas, int slicesPerPizza) {
        int totalSlices = pizzas * slicesPerPizza;
        int slicesPerPerson = totalSlices / people;
        int leftovers = totalSlices % people;
        return people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)\n" +
                "Each person gets " + slicesPerPerson + " pieces of pizza.\n" +
                "There are " + leftovers + " leftover pieces.";
    }
}