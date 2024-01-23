package DesafiosAula.InheritanceChallenge;

/*
1 - Create a class Worker with the following attributes: name, birthDate, endDate. Create the methods getAge, collectPay and terminate.

2 - Create a class Employee that inherits from the Worker class and has the following attributes: employeeld, hireDate.

3 - Create a class SalaryEmployee that inherits from the Employee class and has the following attributes: annualSalary, isRetired. Create the methods retire.
 */

import java.time.Year;

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return Year.now().getValue() - Integer.parseInt(this.birthDate.substring(6));
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
