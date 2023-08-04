public class CalculatorSimulator {
    public static void main(String[] args) {

        // Test Case 1
        TaxCalculator calculator1 = new TaxCalculator();
        try {
            double taxAmount1 = calculator1.calculateTax("Ron", false, 34000);
            System.out.println("Tax amount is " + taxAmount1);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        }

        // Test Case 2
        try {
            double taxAmount2 = new TaxCalculator().calculateTax("Tim", true, 1000);
            System.out.println("Tax amount is " + taxAmount2);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        // Test Case 3
        try {
            double taxAmount2 = new TaxCalculator().calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + taxAmount2);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }

        // Test Case 4
        try {
            double taxAmount2 = new TaxCalculator().calculateTax( "",true, 30000);
            System.out.println("Tax amount is " + taxAmount2);
        } catch (CountryNotValidException e) {
            System.out.println(e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println(e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}
