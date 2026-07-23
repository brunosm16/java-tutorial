package com.baeldung.domain;

public class Car {
    // States
    String type;
    String model;
    String color;
    int speed;

    // Constructor - Behavior
    public Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    // Methods - Behavior
    int increaseSpeed(int increase) {
        this.speed = this.speed + increase;
        return this.speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + getColor() + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }

    // Drive Code
    public static void main(String[] args) {
        Car focus = new Car("Ford", "Focus", "red");
        Car auris = new Car("Toyota", "Auris", "blue");
        Car golf = new Car("Volkswagen", "Golf", "green");

        System.out.println(focus);
        System.out.println(auris);
        System.out.println(golf);

        focus.increaseSpeed(10);
        auris.increaseSpeed(20);
        golf.increaseSpeed(30);

        System.out.println(focus);
        System.out.println(auris);
        System.out.println(golf);

    }
}
