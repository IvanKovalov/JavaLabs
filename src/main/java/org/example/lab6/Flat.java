package org.example.lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Flat {
    private final ArrayList<ElectricalDevice> electricalDevices = new ArrayList<>();
    private final Random random = new Random();

    public void generateDevice(int expectedDeviceAmount) {
        for (int deviceCount = 0; deviceCount < expectedDeviceAmount; deviceCount++) {
            int randomNumber = (random.nextInt(3));
            switch (randomNumber) {
                case 0:
                    ElectricalDevice laptop = new Laptop(random.nextInt(220), random.nextBoolean(), random.nextInt(1000));
                    electricalDevices.add(laptop);
                    break;
                case 1:
                    ElectricalDevice freeze = new Freeze(random.nextInt(220), random.nextBoolean(), random.nextInt(1000));
                    electricalDevices.add(freeze);
                    break;
                case 2:
                    ElectricalDevice TV = new TV(random.nextInt(220), random.nextBoolean(), random.nextInt(1000));
                    electricalDevices.add(TV);
                    break;
                default:

            }
        }
    }

    public void printPowerCapacity() {
        int powerCapacity = 0;
        for (ElectricalDevice electricalDevice : electricalDevices) {
            if (electricalDevice.isActive()) {
                powerCapacity += electricalDevice.getPower();
            }
        }
        System.out.println("Sum of power= " + powerCapacity);
    }

    public void sortElectricalDevicesByPower() {
        System.out.println("-----------");
        System.out.println("Sort by power");
        List<ElectricalDevice> sortedDevices = electricalDevices.stream()
                .sorted(Comparator.comparingInt(ElectricalDevice::getPower))
                .collect(Collectors.toList());
        sortedDevices.forEach(electricalDevice -> System.out.println(electricalDevice.toString()));
    }

    public void sortElectricalDevicesByMagneticPower() {
        System.out.println("-----------");
        System.out.println("Sort by magnetic");
        List<ElectricalDevice> sortedDevices = electricalDevices.stream()
                .sorted(Comparator.comparingInt(ElectricalDevice::getElectricMagneticPower).reversed())
                .collect(Collectors.toList());
        sortedDevices.forEach(electricalDevice -> System.out.println(electricalDevice.toString()));
    }

    public void searchDeviceByDiapason(int min, int max) {
        System.out.println("-----------");
        System.out.println("Search by diapason");
        List<ElectricalDevice> searchedElectricalDevices = electricalDevices.stream()
                .filter(electricalDevice -> electricalDevice.getPower() > min && electricalDevice.getPower() < max)
                .collect(Collectors.toList());
        if (searchedElectricalDevices.isEmpty()) {
            System.out.println("Nothing found");
            return;
        }
        searchedElectricalDevices.forEach(electricalDevice -> System.out.println(electricalDevice.toString()));
    }


}
