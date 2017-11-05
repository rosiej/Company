package pl.sdacademy.java7krkr;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public double calculateNetSalary() {
        double netSalary = (getGrossSalary()-1000)*0.8;
        return netSalary;
    }

    @Override
    public String getEmail() {
        return null;
    }
}
