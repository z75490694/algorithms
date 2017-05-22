package com.example.basicknowledge;


@Factory(
        id = "Margherita",
        type = Meal.class
)
public class MargheritaPizza implements Meal {

    @Override public float getPrice() {
        return 6.0f;
    }
}
