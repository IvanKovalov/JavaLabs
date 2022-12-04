package org.example.lab4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Airport {
    private Plain[] plains;

    private final Random random = new Random();

    public void createPlains(int plainAmount) {
        plains = new Plain[plainAmount];
        for (int plainCount = 0; plainCount < plainAmount; plainCount++) {
            int place = random.nextInt(1000);
            int size = random.nextInt(150);
            int fuel = random.nextInt(2000);
            int serialNumber = random.nextInt();
            int floors = random.nextInt(5);
            Plain plain = new Plain(place, size, serialNumber, fuel, floors);
            plains[plainCount] = plain;
        }
    }

    public void sortByPlaces() {
        System.out.println("Sort by places");
        plains = Arrays.stream(plains).sorted(Comparator.comparing(Plain::getPlace)).toArray(Plain[]::new);
    }

    public void sortBySize() {
        System.out.println("Sort by size");
        plains = Arrays.stream(plains).sorted(Comparator.comparing(Plain::getSize).reversed()).toArray(Plain[]::new);
    }

    public void showPlains() {
        for (Plain plain : plains) {
            System.out.println(plain.toString());
        }
        System.out.println("----------------");
    }
}

