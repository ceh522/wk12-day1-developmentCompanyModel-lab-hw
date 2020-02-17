package management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String NINumber, int salary, String departmentName, double budget) {
        super(name, NINumber, salary, departmentName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}


