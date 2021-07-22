package oops.SOLID.openClosePrinciple.after.factory;


import oops.SOLID.openClosePrinciple.after.employees.Employee;
import oops.SOLID.openClosePrinciple.after.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.after.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.after.taxes.FullTimeTaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.PartTimeTaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.iTaxCalculator;

public class FactoryTaxCalculator {
	public static iTaxCalculator setCalculator(Employee employee) {
		if(employee instanceof FullTimeEmployee)
			return new FullTimeTaxCalculator();
		else if (employee instanceof PartTimeEmployee)
			return new PartTimeTaxCalculator();
		else
			return new InternTaxCalculator();
	}

}
