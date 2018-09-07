public class BusinessEmployee {
    
    private static double budget = 0.0;
    
    public TechnicalEmployee(String name) {
        this.name = name;
        this.baseSalary = 50000;
        this.employeeID++;
    }    
    
    public double getBudget() {
    //////////////////////////
    }

    public String employeeStatus() {
        System.out.println(super.employeeID + " " + this.name + " with a budget of " + this.getBudget());
    }    

}
