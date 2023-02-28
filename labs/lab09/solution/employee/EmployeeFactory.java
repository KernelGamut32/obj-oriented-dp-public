package labs.lab09.solution.employee;

class EmployeeFactory {
    public Employee getEmployee(String name, EmployeeType type, double payRate) {
        if (type == EmployeeType.SALARIED) {
            return new SalariedEmployee(name, payRate);
        } else if (type == EmployeeType.HOURLY) {
            return new HourlyEmployee(name, payRate);
        } else if (type == EmployeeType.CONTRACT) {
            return new ContractEmployee(name, payRate);
        } else {
            return null;
        }
    }
}