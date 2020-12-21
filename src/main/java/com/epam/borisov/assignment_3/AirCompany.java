package com.epam.borisov.assignment_3;

import com.epam.borisov.assignment_3.aircrafts.Aircraft;
import com.epam.borisov.assignment_3.aircrafts.Airplane;
import com.epam.borisov.assignment_3.aircrafts.Helicopter;
import com.epam.borisov.assignment_3.classification.EngineType;
import com.epam.borisov.assignment_3.classification.ManufacturerCountry;
import com.epam.borisov.assignment_3.classification.СomfortСlass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AirCompany {

    private static List<Aircraft> listOfAircraft = Arrays.asList(
            new Helicopter("aw 139", 1061, 2.1, 200, 6, 390, "EW 001-PH", СomfortСlass.VVIP, EngineType.TURBOSHAFT, ManufacturerCountry.ITALY, 13.8),
            new Helicopter("mi 8MTV-5", 950, 1.8, 500, 9, 680, "EW 001-DA", СomfortСlass.VIP, EngineType.TURBOSHAFT, ManufacturerCountry.RUSSIA, 21.3),
            new Helicopter("mi 8MTV-5", 950, 1.8, 500, 8, 680, "EW 002-DA", СomfortСlass.VIP, EngineType.TURBOSHAFT, ManufacturerCountry.RUSSIA, 21.3),
            new Helicopter("airbus h-175", 1259, 2.14, 300, 7, 400, "EW 003-PH", СomfortСlass.VVIP, EngineType.TURBOSHAFT, ManufacturerCountry.FRANCE, 14.8),
            new Airplane("boeing 737-ER", 2900, 23.83, 15000, 128, 2600, "EW 001-PA", СomfortСlass.VIP, EngineType.TURBOFAN, ManufacturerCountry.USA),
            new Airplane("boeing 767", 12200, 91.3, 43800, 218, 4800, "EW 001-PB", СomfortСlass.VIP, EngineType.TURBOFAN, ManufacturerCountry.USA),
            new Airplane("CRJ 200-ER", 3000, 6.5, 6124, 50, 1280, "EW 001-PL", СomfortСlass.VIP, EngineType.TURBOFAN, ManufacturerCountry.CANADA),
            new Airplane("Yakovlev 40", 820, 3.91, 3240, 27, 1200, "EW 88187", СomfortСlass.VIP, EngineType.TURBOPROP, ManufacturerCountry.USSR),
            new Airplane("Gulf Stream G550", 12500, 18.7, 2812, 8, 1380, "EW 001-PJ", СomfortСlass.VVIP, EngineType.TURBOFAN, ManufacturerCountry.USA)
    );

    public static void main(String[] args) {
        totalGrossWeightAndCapacity(listOfAircraft);
        sortByRange(listOfAircraft);
        System.out.println(getAircraftDependingOnFuelConsumptionRateRange(listOfAircraft, 500, 700));
    }

    private static void totalGrossWeightAndCapacity(List<Aircraft> list) {
        int totalWeight = 0;
        int totalCapacity = 0;
        for (Aircraft aircraft : list) {
            totalWeight += aircraft.getBaggageCapacity();
            totalCapacity += aircraft.getPassengersCapacity();
        }
        System.out.println("Total weight : " + totalWeight + " kg;\ntotal passenger capacity : " + totalCapacity + " person.");
    }

    private static void sortByRange(List<Aircraft> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    private static Aircraft getAircraftDependingOnFuelConsumptionRateRange(List<Aircraft> list, int lowerRangeFuelConsumptionRate, int upperRangeFuelConsumptionRate) {
        Aircraft requiredAircraft = null;
        for (Aircraft aircraft : list) {
            if ((lowerRangeFuelConsumptionRate <= aircraft.getFuelConsumptionRate()) && (aircraft.getFuelConsumptionRate() <= upperRangeFuelConsumptionRate)) {
                int airplaneIndex = list.indexOf(aircraft);
                requiredAircraft = list.get(airplaneIndex);
                break;
            }
        }
        return requiredAircraft;
    }
}
