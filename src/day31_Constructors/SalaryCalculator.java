package day31_Constructors;

public class SalaryCalculator {
    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours *52;
    }

    public double stateTax(){
         double stateTax = (salary() > 0 && salary() < 49999)? 0.15 :
                 (salary() > 50000 && salary() < 98000)? 0.21 : (salary() > 98001 && salary() < 150000)? 0.26 :
                (salary() > 150001 && salary() < 210000)? 0.29 : 0.15;
         return stateTax;

    }

    public double federalTaxRate(){
        double federalTaxRate = (salary() > 0 && salary() < 45000)? 0.05 :
                (salary() > 45001 && salary() < 90000)? 0.09 : (salary() > 98001 && salary() < 150000)? 0.12 :
                (salary() > 150001 && salary() < 220000)? 0.13 : 0.14;
        return federalTaxRate;
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - (salary() * stateTaxRate) - (salary() * federalTaxRate);
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTax() +
                ", federalTaxRate=" + federalTaxRate() +
                ", weeklyHours=" + weeklyHours +
                ", salary after tax=" + salaryAfterTax() +
                '}';
    }
}
