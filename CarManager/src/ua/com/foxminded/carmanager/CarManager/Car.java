package ua.com.foxminded.carmanager.CarManager;

import java.util.Objects;

public abstract class Car implements Serviceable {
    String BrandAuto;
    int YearOfProduction;
    int Price;
    int Weight;
    Colors Color;
    private int Mileage = 0; //Private - уровень доступа только этому классу
    protected int MileageOnService = 0; /* Пробег на момент последнего тех обслуживания, Protected - уровень доступа
    только этому классу и всем его наследникам */

    public Car(String brandAuto, int yearOfProduction, int price, int weight, Colors color) {
        BrandAuto = brandAuto;
        YearOfProduction = yearOfProduction;
        Price = price;
        Weight = weight;
        Color = color;
    }

    //Сброс пробега
    protected void Service(){
        MileageOnService = 0;
    }

    public void AddMileage(int add) {
        Mileage += add;
        MileageOnService = getMileage();
    }

    public void AddMileage(double add) {
        Mileage += add;
        MileageOnService = getMileage();
    }

    public int getMileageOnService() {
        return MileageOnService;
    }

    public int getMileage() {
        return Mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return YearOfProduction == car.YearOfProduction && Price == car.Price && Weight == car.Weight && Double.compare(car.Mileage, Mileage) == 0 && BrandAuto.equals(car.BrandAuto) && Color == car.Color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(BrandAuto, YearOfProduction, Price, Weight, Color, Mileage);
    }

    @Override
    public String toString() {
        return "{" +
                "BrandAuto='" + BrandAuto + '\'' +
                ", YearOfProduction=" + YearOfProduction +
                ", Price=" + Price +
                ", Weight=" + Weight +
                ", Color=" + Color +
                ", Mileage=" + Mileage +
                ", MileageOnService=" + MileageOnService +
                '}';
    }
}
