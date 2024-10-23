package InterviewCode;

import java.util.HashMap;
import java.util.Map;

class Employee {
    private int employeeId;
    private double employeeSalary;
    private String emloyeeName;

    public Employee(int employeeId, double employeeSalary, String emloyeeName) {
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.emloyeeName = emloyeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmloyeeName() {
        return emloyeeName;
    }

}

public class Duplicate_Elements_Map {
    public static void main(String[] args) {

        Map<String, Employee> employeeMap = new HashMap<>();
    }
}