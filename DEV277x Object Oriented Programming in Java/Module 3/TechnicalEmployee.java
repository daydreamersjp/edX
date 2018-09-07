public class TechnicalEmployee extends Employee {
    
    private static int successfulCheckins = 0;
    
    public TechnicalEmployee(String name) {
        this.name = name;
        this.baseSalary = 75000;
        this.successfulCheckins++;
        this.employeeID++;
    }
    
    public int getSuccessfulCheckins() {
        return this.successfulCheckins;
    }    
    
    public String employeeStatus() {
        String mt2 = "";
        if (this.getSuccessfulCheckins() > 1) { mt2 = "s"; }
        System.out.println(this.getEmployeeID() + " " + this.getName() + " has " + this.getSuccessfulCheckins() + " successful check in" + mt2);
    }

}
