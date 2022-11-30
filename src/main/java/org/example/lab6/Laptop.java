package org.example.lab6;

public class Laptop extends ElectricalDevice {

    Laptop(int power, boolean isActive, int electricMagneticPower) {
        super(power, isActive, electricMagneticPower);
    }

    @Override
    public String toString() {
        return "Laptop " +
                "power=" + this.getPower() +
                ", isActive=" + this.isActive() +
                ", electricMagneticPower=" + this.getElectricMagneticPower();
    }
}
