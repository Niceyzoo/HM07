package ru.geek.hw07;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int action;
        Cat[] allCats = new Cat[5];
        allCats[0] = new Cat("Сирша", 20, false);
        allCats[1] = new Cat("Щипок", 30, false);
        allCats[2] = new Cat("Ликёрчик", 40, false);
        allCats[3] = new Cat("Фетбургер", 50, false);
        allCats[4] = new Cat("Джиро", 60, false);


        Plate plate = new Plate(200);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite <= plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Котя " + allCat.name + " съел " + allCat.appetite + "!");
            } else {
                System.out.println("Коте " + allCat.name + " не хватило еды :(");
            }
        }
        plate.info();
        System.out.println("Сколько добавить в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}
