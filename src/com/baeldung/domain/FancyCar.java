package com.baeldung.domain;

public class FancyCar extends Vehicle{

    @Override
    public String honk() {
        return "";
    }


    public static void main(String[] args) {
        FancyCar car1 = new FancyCar();

        // Reusing method
        System.out.println("Method drive - reusing: " + car1.drive());
    }
}
