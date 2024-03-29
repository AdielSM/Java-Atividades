package DesafiosAula.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee(("Tim"), "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalaryEmployee joe = new SalaryEmployee("Joe", "01/01/1990", "01/01/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's pay = " + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension = " + joe.collectPay());
    }
}
