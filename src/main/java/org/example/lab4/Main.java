package org.example.lab4;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.createPlains(10);
        airport.sortByPlaces();
        airport.showPlains();
        airport.sortBySize();
        airport.showPlains();
    }
}
