import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    private int empId;
    private double salary;
    private String name;

    public Employee(int empId, double salary, String name) {
        this.empId = empId;
        this.salary = salary;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}

public class Duplicate_Map {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, 100, "Vishal"));
        empList.add(new Employee(2, 200, "Akshay"));
        empList.add(new Employee(3, 300, "Nikhil"));
        empList.add(new Employee(4, 400, "Sarthak"));
        empList.add(new Employee(5, 500, "Pritam"));
        empList.add(new Employee(6, 900, "Krishna"));
        empList.add(new Employee(7, 700, "Vishal"));

        Map<String, Employee> employeeMap = new HashMap<>();
        empList.forEach(emp -> employeeMap.put(emp.getName(), emp));

        List<Employee> sortedList = employeeMap.values().stream()
                .sorted(Comparator.comparing(Employee::getName))
                .toList();

        sortedList.forEach(e -> System.out.println(
                e.getEmpId() + " " +
                        e.getName() + " " +
                        e.getSalary()));
    }
}