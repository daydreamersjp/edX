public class BusinessEmployee extends Employee{

    private static double budget;

    public BusinessEmployee(String name) {
        super(name, 50000);
        this.budget = 10000;
    }

    public double getBudget() {
        return this.budget;
    }

    public void useBudget(double budgetUse) {
        this.budget -= budgetUse;
    }

    public String employeeStatus() {
        return this.getEmployeeID() + " " + this.getName() + " with a budget of " + this.getBudget();
    }

}
