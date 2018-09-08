public class CompanyStructure {
    public static void main(String[] args) {
        TechnicalEmployee te = new TechnicalEmployee("Michale Jackson");
        BusinessEmployee be = new BusinessEmployee("Total Tenbus");

        System.out.println(te.getEmployeeID());
        System.out.println(be.getEmployeeID());

        System.out.println(te.getBaseSalary());
        System.out.println(be.getBaseSalary());

        te.addSuccessfulCheckins();
        te.addSuccessfulCheckins();

        be.useBudget(450.50);

        System.out.println(te.employeeStatus());
        System.out.println(be.employeeStatus());


    }

}
