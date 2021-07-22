package oops.SOLID.openClosePrinciple.after.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.after.employees.Employee;
import oops.SOLID.openClosePrinciple.after.factory.FactoryTaxCalculator;
import oops.SOLID.openClosePrinciple.after.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.after.service.TaxCalculateService;
import oops.SOLID.openClosePrinciple.after.taxes.iTaxCalculator;


public class CalculateTaxesClient {
    public static void main(String[] args) {
       
        EmployeeRepository repository = new EmployeeRepository();

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
   

        double totalTaxes = 0;
        for (Employee employee: employees){
        	System.out.println(employee.toString());
            // compute individual tax
        	
            TaxCalculateService taxService =  new TaxCalculateService(
            		FactoryTaxCalculator.setCalculator(employee));
            double tax = taxService.calculateTax(employee);
            		
            String formattedTax = currencyFormatter.format(tax);
            System.out.println(formattedTax);
            // add to company total taxes
            totalTaxes += tax;
           
        }
    }

	
}
