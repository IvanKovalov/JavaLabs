package org.example.lab6;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat();
        flat.generateDevice(10);
        flat.printPowerCapacity();
        flat.sortElectricalDevicesByPower();
        flat.sortElectricalDevicesByMagneticPower();
        flat.searchDeviceByDiapason(50, 100);
    }

}
