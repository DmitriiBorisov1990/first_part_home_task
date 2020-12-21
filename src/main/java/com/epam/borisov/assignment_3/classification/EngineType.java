package com.epam.borisov.assignment_3.classification;

public enum EngineType {

    TURBOFAN, TURBOPROP, TURBOSHAFT;

    private String model;
    private int quantity;

    EngineType() {
    }

    EngineType(String model, int quantity) {
        this.model = model;
        this.quantity = quantity;
    }
}
