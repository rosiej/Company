package pl.sdacademy.java7krkr;

public abstract class Employee implements Person {
    private double grossSalary;
    public Employee(double grossSalary){
        this.grossSalary = grossSalary;
    }

    public abstract double calculateNetSalary();

    public double getGrossSalary() {
        return grossSalary;
    }
}
