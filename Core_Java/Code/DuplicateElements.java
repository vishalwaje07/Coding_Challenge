package Code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int empID;
    private Double salary;
    private String name;

    public Employee(int empID, Double salary, String name) {
        this.empID = empID;
        this.salary = salary;
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}

public class DuplicateElements {
    public static void main(String args[]) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 500.00, "Vishal"));
        employees.add(new Employee(2, 600.00, "Sachin"));
        employees.add(new Employee(3, 500.00, "Ram"));
        employees.add(new Employee(4, 500.00, "Shiva"));
        employees.add(new Employee(5, 500.00, "Vishal"));

        Map<String, Employee> uniqueEmploeeMap = new HashMap<>();

        for (Employee employee : employees) {
            uniqueEmploeeMap.put(employee.getName(), employee);
        }
        List<Employee> uniqueEmployeeSorted = uniqueEmploeeMap.values().stream()
                .sorted(Comparator.comparing((Employee::getName)))
                .collect(Collectors.toList());

        uniqueEmployeeSorted.forEach(e -> System.out.println(e.getEmpID() + " " +
                e.getName() + " " + e.getSalary()));
    }
}