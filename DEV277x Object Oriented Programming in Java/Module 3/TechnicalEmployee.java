public class TechnicalEmployee extends Employee {

    private static int successfulCheckins = 0;

    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    public int getSuccessfulCheckins() {
        return this.successfulCheckins;
    }

    public void addSuccessfulCheckins() {
        this.successfulCheckins++;
    }

    public String employeeStatus() {
        String mt2 = "";
        if (this.getSuccessfulCheckins() > 1) { mt2 = "s"; }
        return this.getEmployeeID() + " " + this.getName() + " has " + this.getSuccessfulCheckins() + " successful check in" + mt2;
    }

}
