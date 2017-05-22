package com.example.basicknowledge;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by WHZ on 2017/5/21.
 */
public class PizzaStore {

    public Meal order(String mealName) {

        if (mealName == null) {
            throw new IllegalArgumentException("Name of the meal is null!");
        }

        if ("Margherita".equals(mealName)) {
            return new MargheritaPizza();
        }

        if ("Calzone".equals(mealName)) {
            return new CalzonePizza();
        }

        if ("Tiramisu".equals(mealName)) {
            return new Tiramisu();
        }

        throw new IllegalArgumentException("Unknown meal '" + mealName + "'");
    }

    public static void main(String[] args) throws IOException {
        PizzaStore pizzaStore = new PizzaStore();
        Scanner s = new Scanner(System.in);
        String type = s.nextLine();
        Meal meal = pizzaStore.order(type);
        System.out.println("Bill: $" + meal.getPrice());
    }
}
