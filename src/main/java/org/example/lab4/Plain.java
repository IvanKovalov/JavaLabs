package org.example.lab4;

import java.util.Objects;

public class Plain {
    private int place;
    private int size;
    private int serialNumber;
    private int fuel;
    private int floor;

    Plain(int place, int size, int serialNumber, int fuel, int floor) {
        this.place = place;
        this.size = size;
        this.floor = floor;
        this.serialNumber = serialNumber;
        this.fuel = fuel;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFloor() {
        return floor;
    }

    public int getPlace() {
        return place;
    }

    public int getFuel() {
        return fuel;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Plain{" +
                "place=" + place +
                ", size=" + size +
                ", serialNumber=" + serialNumber +
                ", fuel=" + fuel +
                ", floor=" + floor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plain plain = (Plain) o;
        return place == plain.place && size == plain.size && floor == plain.floor && Objects.equals(serialNumber, plain.serialNumber) && Objects.equals(fuel, plain.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, size, serialNumber, fuel, floor);
    }
}
