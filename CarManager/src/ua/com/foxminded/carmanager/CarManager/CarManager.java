package ua.com.foxminded.carmanager.CarManager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

    public static void main(String[] args) {
// Внутри переменные Toyota, Renault, Audi работают так, как они были созданы(Bus, PassengerCar)
// но обращаться к ней мы можем так, как они объявлены(Car)
        Car Toyota = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Colors.GREEN);
        Car Renault = new Bus("Renault Laguna", 2000, 9700, 1600, Colors.WHITE);
        Car Audi = new PassengerCar("Renault Laguna", 2000, 9700, 1600, Colors.WHITE);

        List<Car> cars = new ArrayList<>(); // Создали коллекцию ArrayList с именем cars
// Положили объекты класса Car в коллекцию cars
        cars.add(Toyota);
        cars.add(Renault);
        cars.add(Audi);

        System.out.println(cars); //вывели коллекцию на экран

//        AgriculturalMachinery Belarus = new Traktor("Belarus_1209");
//        AgriculturalMachinery Kuzma = new Traktor("Belarus_1209");
//        Kuzma.AddMileage(25000);
//        Belarus.AddMileage(19000);
//        System.out.println(Kuzma.isReadyToService());
//        System.out.println(Belarus.isReadyToService());
//        System.out.println(Belarus.equals(Kuzma));
//        System.out.println(Kuzma + " " + Belarus);
//
//        Toyota.AddMileage(6);
//        Toyota.AddMileage(15000);
//        Renault.AddMileage(8);
//        Audi.AddMileage(10000);
//
//        boolean indicatorToyota = Toyota.isReadyToService(), indicatorRenault = Renault.isReadyToService(), indicatorAudi = Audi.isReadyToService() ;
//        System.out.println(indicatorToyota);
//        System.out.println(indicatorRenault);
//        System.out.println(indicatorAudi);
//
//        System.out.println(Renault.equals(Audi));
//
//        System.out.println(Toyota);
//        System.out.println(Renault);
//        System.out.println(Audi);
    }

}
