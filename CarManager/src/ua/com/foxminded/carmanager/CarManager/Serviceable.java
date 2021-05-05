package ua.com.foxminded.carmanager.CarManager;
// Interface - это полностью абстрактный класс. Т.е. в котором все методы абстрактные
public interface Serviceable {

    public boolean isReadyToService();
    public int getMileageOnService();
    public int getMileage();
    public void AddMileage(int addM);
    public void AddMileage(double add);

}
