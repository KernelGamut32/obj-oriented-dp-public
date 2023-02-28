package labs.lab09.solution.employee;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, double payRate) {
        super(name, payRate);
        this.setType(EmployeeType.SALARIED);
    }

    @Override
    public double calculatePay() {
        return this.getPayRate() / 52;
    }
}
