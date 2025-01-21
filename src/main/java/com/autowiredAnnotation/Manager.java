package com.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    // field injection
    @Autowired
    @Qualifier("employee")
    private Employee employee;

    /*
    here spring will inject the Employee bean, constructor injection
    @Autowired
    public Manager(Employee employee) {
    public Manager(Employee employee) {
        this.employee = employee;
    }
    */

    @Override public String toString() {
        return "Manager{" + "employee=" + employee + '}';
    }
}
