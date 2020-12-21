package com.epam.borisov.assignment_2;

public class Car {

    /**
     * 8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
     * Создать массив объектов. Вывести:
     * a) список автомобилей заданной марки;
     * b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
     * c) список автомобилей заданного года выпуска, цена которых больше указанной.
     */
    private final String UNKNOWN_NUMBER = "NA";
    private static int id;
    private int carId;
    private Brand brand;
    private String model;
    private int manufactureYear;
    private Colour colour;
    private double price;
    private String registrationNumber;

    public Car(Brand brand, String model, int manufactureYear, Colour colour, double price, String registrationNumber) {
        this.carId = id++;
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.colour = colour;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Car(Brand brand, String model, int manufactureYear, Colour colour, double price) {
        this.carId = id++;
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.colour = colour;
        this.price = price;
        this.registrationNumber = UNKNOWN_NUMBER;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car id -> " + carId + "; brand -> " + brand.name() + "; model -> " + model + "; manufacture year -> " + manufactureYear
                + "; colour -> " + colour.name() + "; price -> " + price + "; registration number -> " + registrationNumber + ";";
    }
}
