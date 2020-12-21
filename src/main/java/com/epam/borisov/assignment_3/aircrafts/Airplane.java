package com.epam.borisov.assignment_3.aircrafts;

import com.epam.borisov.assignment_3.classification.EngineType;
import com.epam.borisov.assignment_3.classification.ManufacturerCountry;
import com.epam.borisov.assignment_3.classification.СomfortСlass;

public class Airplane extends Aircraft {

    public Airplane(String nameModel, double range, double fuelCapacity, double baggageCapacity, int passengersCapacity, double fuelConsumptionRate, String registrationNumber, СomfortСlass comfortClass, EngineType engineType, ManufacturerCountry manufacturerCountry) {
        super(nameModel, range, fuelCapacity, baggageCapacity, passengersCapacity, fuelConsumptionRate, registrationNumber, comfortClass, engineType, manufacturerCountry);
    }

    @Override
    void takeoff() {

    }

    @Override
    void landing() {

    }

    @Override
    void flight() {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
