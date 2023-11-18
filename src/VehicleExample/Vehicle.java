package VehicleExample;

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;
    public Vehicle(String make,String model,int year,String fuelType,double fuelEfficiency){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getMake(){
        return this.make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
    public abstract double calculateFuelEfficiency();
    public abstract double calculateDistanceTraveled();
    public abstract double getMaxSpeed();





}
