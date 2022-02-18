package com.company;

public enum Seasons {
    WINTER(-10),
    SUMMER(30),
    SPRING(25),
    AUTUMN(20);
    public final int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Seasons " +
                " temperature= " + temperature;
    }
}
