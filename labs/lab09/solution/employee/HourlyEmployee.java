package labs.lab09.solution.employee;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(String name, double payRate) {
        super(name, payRate);
        this.setType(EmployeeType.HOURLY);
    }

    @Override
    public double calculatePay() {
        return this.getPayRate() * 40;
    }
}
