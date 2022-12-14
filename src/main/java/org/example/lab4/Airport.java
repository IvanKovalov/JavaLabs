package org.example.lab4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Airport {
    private Airplane[] airplanes;
    private final Random random = new Random();

    public void createPlains(int airplanesAmount) {
        airplanes = new Airplane[airplanesAmount];
        for (int airplanesCount = 0; airplanesCount < airplanesAmount; airplanesCount++) {
            int place = random.nextInt(1000);
            int size = random.nextInt(150);
            int fuel = random.nextInt(2000);
            int serialNumber = random.nextInt();
            int floors = random.nextInt(5);
            Airplane plain = new Airplane(place, size, serialNumber, fuel, floors);
            airplanes[airplanesCount] = plain;
        }
    }

    public void sortByPlaces() {
        System.out.println("Sort by places");
        airplanes = Arrays.stream(airplanes).sorted(Comparator.comparing(Airplane::getPlace)).toArray(Airplane[]::new);
    }

    public void sortBySize() {
        System.out.println("Sort by size");
        airplanes = Arrays.stream(airplanes).sorted(Comparator.comparing(Airplane::getSize).reversed()).toArray(Airplane[]::new);
    }

    public void showPlains() {
        for (Airplane plain : airplanes) {
            System.out.println(plain.toString());
        }
        System.out.println("----------------");
    }
}
