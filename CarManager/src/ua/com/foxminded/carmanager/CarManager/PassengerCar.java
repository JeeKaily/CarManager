package ua.com.foxminded.carmanager.CarManager;

public class PassengerCar extends Car {
    public PassengerCar(String brandAuto, int yearOfProduction, int price, int weight, Colors color) {
        super(brandAuto, yearOfProduction, price, weight, color);
    }


    public boolean isReadyToService() {
        if (MileageOnService >= 10_000) {
            return true;
        }
        return false;
    }
}
