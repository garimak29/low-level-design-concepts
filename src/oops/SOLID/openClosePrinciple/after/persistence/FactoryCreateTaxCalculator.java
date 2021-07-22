package oops.SOLID.openClosePrinciple.after.persistence;

import oops.SOLID.openClosePrinciple.after.employees.*;
import oops.SOLID.openClosePrinciple.after.taxes.*;

public class FactoryCreateTaxCalculator {
	
	public static iTaxCalculator getCalculator(Employee employee) {
		if (employee instanceof Intern ) {
			return new InternTaxCalculator();
		}
		else if (employee instanceof FullTimeEmployee)
			return new FullTimeTaxCalculator();
		else 
			return new PartTimeTaxCalculator();
		
			
	}

}
