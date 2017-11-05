package pl.sdacademy.java7krkr;

public class Student extends Employee {
    public Student(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public double calculateNetSalary() {
        double netSalary = getGrossSalary()*0.95;
        return netSalary;
    }

    @Override
    public String getEmail() {
        return null;
    }
}
