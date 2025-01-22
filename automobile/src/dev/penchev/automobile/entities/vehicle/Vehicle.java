package dev.penchev.automobile.entities.vehicle;

import dev.penchev.automobile.entities.vehicle.enums.EngineType;
import dev.penchev.automobile.entities.vehicle.enums.ExteriorColor;
import dev.penchev.automobile.entities.vehicle.enums.VehicleManufacturer;

public class Vehicle {
    protected VehicleManufacturer manufacturer;
    protected String model;
    protected EngineType engineType;
    protected int horsePower;
    protected int mileage;
    protected ExteriorColor exteriorColor;

    public Vehicle(VehicleManufacturer manufacturer, String model, EngineType engineType, int horsePower, int mileage, ExteriorColor exteriorColor) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.mileage = mileage;
        this.exteriorColor = exteriorColor;
    }
}