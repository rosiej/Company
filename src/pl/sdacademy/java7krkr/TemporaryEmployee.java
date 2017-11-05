package pl.sdacademy.java7krkr;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public double calculateNetSalary() {
        double netSalary = getGrossSalary()*0.9;
        return netSalary;
    }

    @Override
    public String getEmail() {
        return null;
    }
}
