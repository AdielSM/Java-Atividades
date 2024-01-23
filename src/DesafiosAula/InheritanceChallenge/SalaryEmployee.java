package DesafiosAula.InheritanceChallenge;

public class SalaryEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalaryEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = Math.floor(this.annualSalary / 26 * 100) / 100;
        return isRetired ? 0.9 * paycheck : paycheck;
    }

    public void retire(){
        super.terminate("12/12/2024");
        isRetired = true;
    }
}
