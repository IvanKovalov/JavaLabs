package org.example.lab6;

public class Freeze extends ElectricalDevice {

    Freeze(int power, boolean isActive, int electricMagneticPower) {
        super(power, isActive, electricMagneticPower);
    }

    @Override
    public String toString() {
        return "Freeze " +
                "power=" + getPower() +
                ", isActive=" + isActive() +
                ", electricMagneticPower=" + getElectricMagneticPower();
    }
}
