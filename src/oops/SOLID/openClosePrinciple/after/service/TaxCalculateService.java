package oops.SOLID.openClosePrinciple.after.service;

import oops.SOLID.openClosePrinciple.after.employees.Employee;
import oops.SOLID.openClosePrinciple.after.taxes.iTaxCalculator;

public class TaxCalculateService {
	static iTaxCalculator taxCalculator;
	public TaxCalculateService(iTaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
		
		
	}
	public static double calculateTax( Employee employee) {
		return taxCalculator.calculateTax(employee);
	}

}
