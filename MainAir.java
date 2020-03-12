package by.airport;
//Авиакомпания.
// Определить иерархию самолетов.
// Создать авиакомпанию.
// Посчитать общую вместимость и грузоподъемность.
// Провести сортировку самолетов компании по дальности полета.
// Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.


import java.util.*;

public class MainAir {
    public static void main(String[] args) {
        Set<PassengerPlane> PasPlan = new TreeSet<>();
        PasPlan.add(new PassengerPlane("Boeing 747", 12_100, 10_668, 917, 425));
        PasPlan.add(new PassengerPlane("Boeing-737", 2518, 10_058, 793, 192));
        PasPlan.add(new PassengerPlane("Boeing-767", 4000, 10_668, 873, 252));
        PasPlan.add(new PassengerPlane("Boeing-777", 7404, 10_668, 891, 235));
        PasPlan.add(new PassengerPlane("Airbus A320", 3717, 10_668, 853, 149));
        PasPlan.add(new PassengerPlane("Airbus A330", 11_900, 10_000, 925, 440));

        Set<CargoAirplane> CargoAir = new TreeSet<>();
        CargoAir.add(new CargoAirplane("Boeing 747 Dreamlifter", 7800, 13_000, 878, 113_000));


        printPas(PasPlan);
        // printCarg(CargoAir);

    }

    private static void printPas(Set<PassengerPlane> planes) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed", "Places");
        for (PassengerPlane plane : planes) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(), plane.getPlaces());
        }
    }

    private static void printCarg(Set<CargoAirplane> planes) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed", "Weight");
        for (CargoAirplane plane : planes) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(), plane.getWeight());
        }
    }

}
