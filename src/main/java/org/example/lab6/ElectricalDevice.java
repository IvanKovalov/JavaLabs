package org.example.lab6;

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
                "power=" +
                ", isActive=" + isActive +
                ", electricMagneticPower=" + electricMagneticPower;
    }
}
