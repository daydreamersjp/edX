public class TechnicalEmployee extends Employee {
    
    private static int successfulCheckins = 0;
    
    public TechnicalEmployee(String name) {
        this.name = name;
        this.baseSalary = 75000;
        this.successfulCheckins++;
        this.employeeID++;
    }
    
    public String employeeStatus() {
        String mt2 = "";
        if (this.successfulCheckins > 1) { mt2 = "s"; }
        System.out.println(super.employeeID + " " + this.name + " has " + this.successfulCheckins + " successful check in" + mt2);
    }

}
