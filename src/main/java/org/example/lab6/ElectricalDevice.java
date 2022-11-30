package org.example.lab6;

import java.util.Objects;

public class ElectricalDevice {

    private int power;
    private boolean isActive;
    private int electricMagneticPower;

    ElectricalDevice(int power, boolean isActive, int electricMagneticPower) {
        this.power = power;
        this.isActive = isActive;
        this.electricMagneticPower = electricMagneticPower;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getElectricMagneticPower() {
        return electricMagneticPower;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setElectricMagneticPower(int electricMagneticPower) {
        this.electricMagneticPower = electricMagneticPower;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "ElectricalDevice " +
                "power=" + power +
                ", isActive=" + isActive +
                ", electricMagneticPower=" + electricMagneticPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricalDevice that = (ElectricalDevice) o;
        return power == that.power && isActive == that.isActive && electricMagneticPower == that.electricMagneticPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, isActive, electricMagneticPower);
    }
}
