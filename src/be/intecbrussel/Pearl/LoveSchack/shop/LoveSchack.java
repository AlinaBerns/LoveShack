package be.intecbrussel.Pearl.LoveSchack.shop;

import be.intecbrussel.Pearl.LoveSchack.mixables.Food;
import be.intecbrussel.Pearl.LoveSchack.mixables.fruits.*;
import be.intecbrussel.Pearl.LoveSchack.mixables.vegetabels.Celery;
import be.intecbrussel.Pearl.LoveSchack.mixables.vegetabels.Spinache;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class LoveSchack {

    private SmoothieRecipe[] orders;
    private double totalPrice;
    private Orange orange;
    private StrawBerry strawberry;
    private Banana banana;
    private Apple apple;
    private Lemon lemon;
    private Spinache spinache;
    private Celery celery;

    private int ingredients = 0;
    private int anInt = 4;


    Scanner in = new Scanner(System.in);


    public LoveSchack() {
        this.orange = new Orange(1);
        this.strawberry = new StrawBerry(2);
        this.banana = new Banana(1.25);
        this.apple = new Apple(0.5);
        this.lemon = new Lemon(0.75);
        this.spinache = new Spinache(1.25);
        this.celery = new Celery(1);
        this.orders = new SmoothieRecipe[4];
    }

    void order() {

        System.out.println("Input Smoothie Recipe: "
                + "\n" + SmoothieRecipe.CITRUS.name()
                + "\n" + SmoothieRecipe.STRAWBERRYDREAM.name()
                + "\n" + SmoothieRecipe.BANASLIDE.name()
                + "\n" + SmoothieRecipe.VEGIESLURRY.name()
                + "\n" + SmoothieRecipe.CUSTOM_SMOOTHIE.name());

            String s = in.nextLine();
            String s1 = s.toUpperCase(Locale.ROOT);

            SmoothieRecipe recipe = SmoothieRecipe.valueOf(s1);

            switch (recipe) {

                case CITRUS:
                    SmoothieRecipe k = SmoothieRecipe.CITRUS;
                    System.out.println("Your choice: " + k.name() + ", price: " + k.getTotalPrice());

                    break;

                case STRAWBERRYDREAM:
                    SmoothieRecipe k1 = SmoothieRecipe.STRAWBERRYDREAM;
                    System.out.println("Your choice: " + k1.name() + ", price: " + k1.getTotalPrice());

                    break;
                case BANASLIDE:
                    SmoothieRecipe k2 = SmoothieRecipe.BANASLIDE;
                    System.out.println("Your choice: " + k2.name() + ", price: " + k2.getTotalPrice());

                    break;
                case VEGIESLURRY:
                    SmoothieRecipe k3 = SmoothieRecipe.VEGIESLURRY;
                    System.out.println("Your choice: " + k3.name() + ", price: " + k3.getTotalPrice());

                    break;

                case CUSTOM_SMOOTHIE:

                    String ing_s;

                    do {
                        System.out.println("Input " + anInt + " ingredients. Input 'stop' to complete ");
                        ing_s = in.nextLine();

                        switch (ing_s) {

                            case ("orange"):
                                this.totalPrice += this.orange.getPricePerPiece();

                                ingredients++;
                                anInt--;
                                orange.mix();

                                break;

                            case ("strawberry"):
                                this.totalPrice += this.strawberry.getPricePerPiece();
                                ingredients++;
                                anInt--;
                                strawberry.mix();

                                break;

                            case ("banana"):
                                this.totalPrice += this.banana.getPricePerPiece();
                                ingredients++;
                                anInt--;
                                banana.mix();

                                break;

                            case ("apple"):
                                this.totalPrice += this.apple.getPricePerPiece();
                                ingredients++;
                                anInt--;
                                apple.mix();

                                break;

                            case ("lemon"):
                                this.totalPrice += this.lemon.getPricePerPiece();
                                ingredients++;
                                anInt--;
                                lemon.mix();

                                break;

                            case ("spinache"):
                                this.totalPrice += this.spinache.getPricePerPiece();
                                ingredients++;
                                anInt--;
                                spinache.mix();

                                break;

                            case ("celery"):
                                this.totalPrice += this.celery.getPricePerPiece();
                                ingredients++;
                                anInt--;
                                celery.mix();

                                break;

                            default:
                                System.out.println(" ");
                                break;
                        }


                    } while (ing_s.equals("stop") || ingredients < 4);

                    System.out.println("Total price: " + totalPrice);

                    break;
            }


        }

    }
