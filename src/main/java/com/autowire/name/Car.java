package com.autowire.name;

public class Car {
    // look for a bean name specification in the resource
    private Specification specification;

    // autoWire byName is done through setter
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails() {
        System.out.println("Car details: " + specification.toString());
    }
}
