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
        // Test
        Airline Air1 = new Airline(new ArrayList<PassengerPlane>(), new ArrayList<CargoAirplane>());
        //Air1.setCarg();

        System.out.println(Air1);

        //End Test


        Set<PassengerPlane> PasPlan = new TreeSet<>(Comparator.comparing(PassengerPlane::getRange));
        PasPlan.add(new PassengerPlane("Boeing 747", 12_100, 10_668, 917, 13, 425));
        PasPlan.add(new PassengerPlane("Boeing 737", 2518, 10_058, 793, 3, 192));
        PasPlan.add(new PassengerPlane("Boeing 767", 4000, 10_668, 873, 5, 252));
        PasPlan.add(new PassengerPlane("Boeing 777", 7404, 10_668, 891, 7, 235));
        PasPlan.add(new PassengerPlane("Airbus A320", 3717, 10_668, 853, 4, 149));
        PasPlan.add(new PassengerPlane("Airbus A330", 11_900, 10_000, 925, 12, 440));

        Set<CargoAirplane> CargoAir = new TreeSet<>(Comparator.comparing(CargoAirplane::getRange));
        CargoAir.add(new CargoAirplane("Boeing 747", 7800, 13_000, 878, 8, 113_000));
        CargoAir.add(new CargoAirplane("Airbus 300 B4", 5300, 10_670, 917, 15, 43_500));
        CargoAir.add(new CargoAirplane("DC 10", 9200, 12_800, 910, 20, 65_000));
        CargoAir.add(new CargoAirplane("Fokker 27", 1900, 8_890, 480, 5, 6000));
        CargoAir.add(new CargoAirplane("MD 11", 12_800, 12_270, 880, 17, 80_000));
        CargoAir.add(new CargoAirplane("ТУ 204", 6900, 12_500, 810, 9, 28_500));


        //List<PassengerPlane> pl = new ArrayList<>();
        // pl.addAll(PasPlan);
        //Collections.sort(pl);
        //System.out.println(pl);

        System.out.println("======================================================================================================================== ");
        printPas(PasPlan);
        System.out.println("======================================================================================================================== ");
        printCarg(CargoAir);
        System.out.println("======================================================================================================================== ");
        printWeight(CargoAir);
        System.out.println("======================================================================================================================== ");
        printPlaces(PasPlan);
        System.out.println("======================================================================================================================== ");
        printFuelPass(PasPlan);
        System.out.println("======================================================================================================================== ");
        printFuelCargo(CargoAir);
        System.out.println("======================================================================================================================== ");



    }

    private static void printPas(Set<PassengerPlane> planes) { //Вывод на экран отсортированный список по дфльности полета
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed", "LiterKm", "Places");
        for (PassengerPlane plane : planes) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(), plane.getLiterKm(),
                    plane.getPlaces());
        }
    }

    private static void printCarg(Set<CargoAirplane> planes) { //Вывод на экран отсортированный список по дфльности полета
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed", "literKm", "Weight");
        for (CargoAirplane plane : planes) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(), plane.getLiterKm(), plane.getWeight());
        }
    }

    private static int printWeight(Set<CargoAirplane> planes) { //выводит на экран общую грузоподъемность
        System.out.println("Total payload");
        int sum = 0;
        for (CargoAirplane plane : planes) {
            sum += plane.getWeight();
        }
        System.out.println(sum+" kg");
        return planes.size();
    }

    private static int printPlaces(Set<PassengerPlane> planes) {//выводит на экран общее кол-во мест
        System.out.println("Total Places");
        int sum = 0;
        for (PassengerPlane plane : planes) {
            sum += plane.getPlaces();
        }
        System.out.println(sum+" kg");
        return planes.size();
    }

    private static void printFuelPass(Set<PassengerPlane> planes) { // потребление горючего в заданном диапазоне
        System.out.println("Fuel consumption");
        int min = 3;
        int max = 4;
        System.out.println("Введенный параметр минимальный " + min + " макcимальный " + max);
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed", "LiterKm", "Places");

        for (PassengerPlane plane : planes) {
            if (min <= plane.getLiterKm() & plane.getLiterKm() <= max) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(), plane.getLiterKm(),
                        plane.getPlaces());
            }


        }

    }

    private static void printFuelCargo(Set<CargoAirplane> planes) { // потребление горючего в заданном диапазоне
        System.out.println("Fuel consumption");
        int min = 5;
        int max = 19;
        System.out.println("Введенный параметр минимальный " + min + " макcимальный " + max);
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Model", "Range", "Height", "Speed", "LiterKm", "Weight");

        for (CargoAirplane plane : planes) {
            if (min <= plane.getLiterKm() & plane.getLiterKm() <= max) {

                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", plane.getModel(), plane.getRange(), plane.getHeight(), plane.getSpeed(), plane.getLiterKm(),
                        plane.getWeight());


            }


        }

    }

    ///// Сортировака, немогу понять что я делаю не так(
    private static void printSortSpeed(Set<CargoAirplane> planes) {

//for(CargoAirplane plane: planes)
        for (int plane = 0; plane < planes.size(); plane++) {
            int min = planes.size();
            int min_i = plane;
            for (int plane1 = plane + 1; plane1 < planes.size(); plane1++) {
                if (planes.size() < min) {
                    min = planes.size();
                    min_i = plane1;
                }
            }


        }

    }




}
