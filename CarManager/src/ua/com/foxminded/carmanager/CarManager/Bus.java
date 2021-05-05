package ua.com.foxminded.carmanager.CarManager;

public class Bus extends Car{
    public Bus(String brandAuto, int yearOfProduction, int price, int weight, Colors color) {
        super(brandAuto, yearOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if (MileageOnService >= 50_000){
            return true;
        }
        return false;
    }
}
