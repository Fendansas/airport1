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
        PasPlan.add(new PassengerPlane("Boeing 747", 12_100, 10_668, 917, 13, 425));
        PasPlan.add(new PassengerPlane("Boeing 737", 2518, 10_058, 793, 3, 192));
        PasPlan.add(new PassengerPlane("Boeing 767", 4000, 10_668, 873, 5,252));
        PasPlan.add(new PassengerPlane("Boeing 777", 7404, 10_668, 891, 7,235));
        PasPlan.add(new PassengerPlane("Airbus A320", 3717, 10_668, 853, 4,149));
        PasPlan.add(new PassengerPlane("Airbus A330", 11_900, 10_000, 925, 12,440));

        Set<CargoAirplane> CargoAir = new TreeSet<>();
        CargoAir.add(new CargoAirplane("Boeing 747", 7800, 13_000, 878, 8,113_000));
        CargoAir.add(new CargoAirplane("Airbus 300 B4", 5300, 10_670, 917, 15, 43_500));
        CargoAir.add(new CargoAirplane("DC 10", 9200, 12_800, 910, 20, 65_000));
        CargoAir.add(new CargoAirplane("Fokker 27", 1900, 8_890, 480, 5, 6000));
        CargoAir.add(new CargoAirplane("MD 11", 12_800, 12_270, 880, 17, 80_000));
        CargoAir.add(new CargoAirplane("ТУ 204", 6900, 12_500, 810, 9, 28_500));



        printPas(PasPlan);
        System.out.println("======================================================================================================= ");
        printCarg(CargoAir);


    }

    private static void printPas(Set<PassengerPlane> planes) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed","LiterKm", "Places");
        for (PassengerPlane plane : planes) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(), plane.getLiterKm(),
                    plane.getPlaces());
        }
    }

    private static void printCarg(Set<CargoAirplane> planes) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed","literKm", "Weight");
        for (CargoAirplane plane : planes) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(),plane.getLiterKm(), plane.getWeight());
        }
    }

}
