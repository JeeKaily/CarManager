package ua.com.foxminded.carmanager.CarManager;

public class Traktor extends AgriculturalMachinery{
    public Traktor(String brand) {
        super(brand);
    }

    @Override
    public boolean isReadyToService(){
        if (MileageOnService >= 20_000){
            return true;
        }
        return false;
    }

    @Override
    public int getMileageOnService() {
        return MileageOnService;
    }
}
