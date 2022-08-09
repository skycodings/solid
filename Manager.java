package openclosed;

import example.Employee;

public  abstract class Manager extends Employee{
   private String getEmployeeDetails;


    public Manager(int employeeAge, String employeeName,String employeeDepartment,String employeeDesignation,String getEmployeeDetails,String employeeId, float employeeSalary) {
        super(employeeAge, employeeName, employeeDesignation, employeeDepartment, employeeSalary);
    }




        
}
