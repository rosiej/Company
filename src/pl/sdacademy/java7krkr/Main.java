package pl.sdacademy.java7krkr;

public class Main {

    public static void main(String[] args) {
        Company firma = new Company();
        Employee student = new Student(800.50);
        Employee temporaryEmployee = new TemporaryEmployee(1200.34);
        Employee fullTimeEmployee = new FullTimeEmployee(1400.9);

        firma.addEmployee(student);
        firma.addEmployee(temporaryEmployee);
        firma.addEmployee(fullTimeEmployee);

        System.out.println(String.format("%.2f",firma.sumOfSalaries()));
        System.out.println(String.format("%.2f",firma.avarageOfSalaries()));
        System.out.format("%.2f",firma.avarageOfSalaries());

    }
}
