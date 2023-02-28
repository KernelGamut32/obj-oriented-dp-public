package labs.lab09.solution.employee;

public class ContractEmployee extends Employee {
    public ContractEmployee(String name, double payRate) {
        super(name, payRate);
        this.setType(EmployeeType.CONTRACT);
    }

    @Override
    public double calculatePay() {
        return this.getPayRate();
    }
}
