package oops.SOLID.openClosePrinciple.after.employees;

import oops.SOLID.openClosePrinciple.after.taxes.PartTimeTaxCalculator;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome ) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
       
        
    }

	
}