package InterviewCode;

class Employee {
    private int empId;
    private double salary;
    private String name;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int empId, double salary, String name) {
        this.empId = empId;
        this.salary = salary;
        this.name = name;
    }

}

class Duplicate_Elements {
    public static void main(String[] args) {
        // Now we can use two methods to solve this problem
        // 1. Map...
        // If we are using map then we need equals() and hasCode().
        // No nessary.

        // 2. Set...
        // If are using set then we need to write equal() and hashCode().
        // Must need to use equals() and hasCode().

        // 3. Tree...
        // If we are using the tree then we don't need to write equals() and hasCode().

    }

}