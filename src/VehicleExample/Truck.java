package VehicleExample;

public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String make,String model,int year,String fuelType, double fuelEfficiency,double cargoCapacity){
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }
    public double getCargoCapacity(){
        return this.cargoCapacity;
    }
    @Override
    public double calculateFuelEfficiency(){
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }
    @Override
    public double calculateDistanceTraveled(){
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    @Override
    public double getMaxSpeed(){
        return 90.0;
    }
}
