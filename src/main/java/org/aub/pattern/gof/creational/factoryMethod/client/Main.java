package org.aub.pattern.gof.creational.factoryMethod.client;

import org.aub.pattern.gof.creational.factoryMethod.Creator;
import org.aub.pattern.gof.creational.factoryMethod.DeveloperCreator;
import org.aub.pattern.gof.creational.factoryMethod.Employee;
import org.aub.pattern.gof.creational.factoryMethod.ManagerCreator;

public class Main {
    public static void main(String[] args) {
        Creator[] creators = {new ManagerCreator(), new DeveloperCreator()};
        for(Creator creator : creators) {
            Employee employee = creator.factoryMethod();
            System.out.println(employee.getDescription() + " - " + employee.getSalary());
        }
    }
}
