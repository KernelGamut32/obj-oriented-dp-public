package labs.lab09.solution.employee;

import java.text.NumberFormat;
import java.util.Locale;

enum EmployeeType {
    SALARIED,
    HOURLY,
    CONTRACT
}

abstract class Employee {
    private String name;
    private EmployeeType type;
    private double payRate;

    protected Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getType() {
        return this.type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public abstract double calculatePay();

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        return this.getType() + " Employee " + this.getName() + " makes " + formatter.format(this.calculatePay());
    }
}