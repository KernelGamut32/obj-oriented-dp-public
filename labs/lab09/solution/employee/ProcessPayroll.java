package labs.lab09.solution.employee;

import java.io.*;

class ProcessPayroll {
    public static void main(String[] args) throws IOException {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the type of employee: ");
        String type = br.readLine();

        System.out.print("Enter the employee name: ");
        String name = br.readLine();

        System.out.print("Enter the employee pay rate: ");
        double payRate = Double.parseDouble(br.readLine());

        Employee emp = employeeFactory.getEmployee(name, EmployeeType.valueOf(type.toUpperCase()), payRate);
        if (emp == null) {
            System.out.println("ERROR");
        } else {
            System.out.println(emp.toString());
        }
    }
}