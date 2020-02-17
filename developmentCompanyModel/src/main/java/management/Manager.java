package management;

import staff.Employee;

public class Manager extends Employee {

    String departmentName;

    public Manager(String name, String NINumber, int salary, String departmentName) {
        super(name, NINumber, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
