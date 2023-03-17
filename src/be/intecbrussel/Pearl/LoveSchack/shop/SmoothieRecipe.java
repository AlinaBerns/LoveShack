package be.intecbrussel.Pearl.LoveSchack.shop;

import be.intecbrussel.Pearl.LoveSchack.mixables.Food;
import be.intecbrussel.Pearl.LoveSchack.mixables.fruits.*;
import be.intecbrussel.Pearl.LoveSchack.mixables.vegetabels.Celery;
import be.intecbrussel.Pearl.LoveSchack.mixables.vegetabels.Spinache;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public enum SmoothieRecipe {

    CITRUS (new Food[] {new Orange(1), new Orange(1), new Lemon(0.75)}),
    STRAWBERRYDREAM (new Food[] {new StrawBerry(2), new Orange (1), new Orange(1), new Banana(1.25)}),
    BANASLIDE (new Food[] {new Banana(1.25), new Banana(1.25), new Orange(1)}),
    VEGIESLURRY (new Food[] {new Banana(1.25), new Celery(1), new Spinache(1.25), new Apple(0.5)}),
    CUSTOM_SMOOTHIE (new Food[4]);

    private double totalPrice;

    Food [] recipe;
    SmoothieRecipe(Food [] recipe) {
        this.recipe = recipe;

        for (Food food: recipe) {
            if (food != null) {
                totalPrice += food.getPricePerPiece();
            }
        }

    }

    public double getTotalPrice() {

        return totalPrice;
    }

    public Food[] getRecipe() {
        if (this.recipe.length > 4 &&this.name().equals(CUSTOM_SMOOTHIE)|| this.recipe.length < 2&&this.name().equals(CUSTOM_SMOOTHIE)) {
            System.out.println("Not possible");
            CUSTOM_SMOOTHIE.recipe = null;
        } else {
            CUSTOM_SMOOTHIE.recipe = recipe;
        }
        return recipe;
    }

    public void setRecipe(Food[] recipe) {
       
    }

    @Override
    public String toString() {
        return "SmoothieRecipe{" +
                "totalPrice=" + totalPrice +
                ", recipe=" + Arrays.toString(recipe) +
                "} " + super.toString();
    }
}
