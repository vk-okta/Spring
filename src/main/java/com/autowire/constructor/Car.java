package com.autowire.constructor;

public class Car {
    private Specification specification;

    // constructor needed for autowiring by constructor
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car details: " + specification.toString());
    }
}
