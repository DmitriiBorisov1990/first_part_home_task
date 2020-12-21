package com.epam.borisov.assignment_3.aircrafts;

import com.epam.borisov.assignment_3.classification.EngineType;
import com.epam.borisov.assignment_3.classification.ManufacturerCountry;
import com.epam.borisov.assignment_3.classification.СomfortСlass;

public abstract class Aircraft implements Comparable<Aircraft> {

    private String nameModel;
    private double range;
    private double fuelCapacity;
    private double baggageCapacity;
    private int passengersCapacity;
    private double fuelConsumptionRate;
    private String registrationNumber;
    private СomfortСlass comfortClass;
    private EngineType engineType;
    private ManufacturerCountry manufacturerCountry;

    Aircraft(String nameModel, double range, double fuelCapacity, double baggageCapacity, int passengersCapacity, double fuelConsumptionRate, String registrationNumber, СomfortСlass comfortClass, EngineType engineType, ManufacturerCountry manufacturerCountry) {
        this.nameModel = nameModel;
        this.range = range;
        this.fuelCapacity = fuelCapacity;
        this.baggageCapacity = baggageCapacity;
        this.passengersCapacity = passengersCapacity;
        this.fuelConsumptionRate = fuelConsumptionRate;
        this.registrationNumber = registrationNumber;
        this.comfortClass = comfortClass;
        this.engineType = engineType;
        this.manufacturerCountry = manufacturerCountry;
    }

    abstract void takeoff();

    abstract void landing();

    abstract void flight();

    public double getRange() {
        return range;
    }

    public double getBaggageCapacity() {
        return baggageCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public double getFuelConsumptionRate() {
        return fuelConsumptionRate;
    }

    @Override
    public int compareTo(Aircraft aircraft) {
        return Integer.compare ((int)aircraft.getRange(),(int)range);
    }

    @Override
    public String toString() {
        return "Aircraft model " + nameModel +
                "; range : " + range +
                " km; fuel capacity : " + fuelCapacity +
                " ton; baggage capacity : " + baggageCapacity +
                " kg; passengers capacity : " + passengersCapacity +
                "  person; fuel consumption rate : " + fuelConsumptionRate +
                " l/h; registration number : " + registrationNumber +
                "; comfort  class : " + comfortClass +
                "; engine type : " + engineType +
                "; manufacturer country : " + manufacturerCountry;
    }
}
