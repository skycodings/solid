package openclosed;

import example.Employee;

public  abstract class Manager extends Employee{
   private String getEmployeeDetails;


    public Manager(String getEmployeeDetails) {
        super(30, "hn", "sj", "jd", 6763.0f);
        this.getEmployeeDetails = getEmployeeDetails;
    }


}