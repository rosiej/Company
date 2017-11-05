package pl.sdacademy.java7krkr;

import java.util.LinkedList;
import java.util.List;

public class Company {
    private List<Employee> employees = new LinkedList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public double sumOfSalaries(){
        double sum =0;
        for (Employee employee : employees) {
            sum += employee.calculateNetSalary();
        }
        return sum;
    }
    public double avarageOfSalaries(){
        return sumOfSalaries()/employees.size();
    }
}