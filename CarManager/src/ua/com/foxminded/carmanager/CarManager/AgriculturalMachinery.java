package ua.com.foxminded.carmanager.CarManager;

import java.util.Objects;

public abstract class AgriculturalMachinery implements Serviceable{

    protected int MileageOnService = 0;
    private int Mileage = 0;
    String Brand;

    public AgriculturalMachinery(String brand) {
        Brand = brand;
    }

    @Override
    public abstract boolean isReadyToService();

    @Override
    public int getMileage() {
        return Mileage;
    }

    @Override
    public void AddMileage(int add) {
        Mileage += add;
        MileageOnService = getMileage();
    }

    @Override
    public void AddMileage(double add) {
        Mileage += add;
        MileageOnService = getMileage();
    }


    @Override
    public String toString() {
        return "AgriculturalMachinery{" +
                "MileageOnService=" + MileageOnService +
                ", Mileage=" + Mileage +
                ", Brand='" + Brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgriculturalMachinery that = (AgriculturalMachinery) o;
        return getMileageOnService() == that.getMileageOnService() && getMileage() == that.getMileage() && Brand.equals(that.Brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMileageOnService(), getMileage(), Brand);
    }
}
