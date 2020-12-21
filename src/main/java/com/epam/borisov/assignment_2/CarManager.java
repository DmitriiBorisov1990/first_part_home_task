package com.epam.borisov.assignment_2;

public class CarManager {
    private static final int PRESENT_TIME = Utility.getCurrentYear();

    public static void main(String[] args) {
        Car mazda1 = new Car(Brand.MAZDA, "Premacy I", 1999, Colour.GRIN, 2900, "8161 MK-4");
        Car mazda2 = new Car(Brand.MAZDA, "Mazda 6 II", 2008, Colour.SILVER, 5900);
        Car volkswagen1 = new Car(Brand.VOLKSWAGEN, "Golf GTI III", 1994, Colour.WHITE, 1250, "6443 IC-1");
        Car volkswagen2 = new Car(Brand.VOLKSWAGEN, "Jetta VI", 2012, Colour.BLACK, 8400, "4755 IB-2");
        Car skoda = new Car(Brand.SKODA, "Fabia I", 2006, Colour.BEIGE, 3500, "4591 BM-7");
        Car hyundai1 = new Car(Brand.HYUNDAI, "Solaris I", 2015, Colour.RED, 7400, "3422 IK-2");
        Car hyundai2 = new Car(Brand.HYUNDAI, "Sonata V", 2008, Colour.GRAY, 6500, "0294 MB-5");
        Car subaru1 = new Car(Brand.SUBARU, "Outback II", 2003, Colour.BLUE, 3450, "7PKT9639");
        Car subaru2 = new Car(Brand.SUBARU, "Impreza WRX II", 2001, Colour.SILVER, 6800, "8504 HK-7");
        Car cars[] = addCar(mazda1, mazda2, hyundai1, subaru1, subaru2, volkswagen1, volkswagen2, skoda, hyundai2);
        carListOfThisMake("skoda", cars);
        carListOfThisModelUsedForMoreThanYarLimits("Premacy I", 5, cars);
        carListYearPrice(2001, 2450, cars);
    }

    static Car[] addCar(Car... cars) {
        return cars;
    }

    static void carListOfThisMake(String carMake, Car... cars) {
        for (Car car : cars) {
            if (car.getBrand().name().equals(carMake.toUpperCase())) {
                System.out.println(car);
            }
        }
    }

    static void carListOfThisModelUsedForMoreThanYarLimits(String carModel, int yearsLimit, Car... cars) {
        for (Car car : cars) {
            if ((car.getModel().equals(carModel)) && (PRESENT_TIME - car.getManufactureYear() > yearsLimit)) {
                System.out.println(car);
            }
        }
    }

    static void carListYearPrice(int manufactureYear, double price, Car... cars) {
        for (Car car : cars) {
            if ((car.getManufactureYear() == manufactureYear) && (car.getPrice() > price)) {
                System.out.println(car);
            }
        }
    }
}
