package openclosed;

public class EmployeeChild extends Employee{
     private String employeeFullName;
     private int employeeFullId;

    public EmployeeChild(String employeeFullName, int employeeFullId,String employeeId, float employeeSalary) {
        super(employeeId, employeeSalary);
        this.employeeFullName = employeeFullName;
        this.employeeFullId = employeeFullId;

    }

    public String getEmployeeFullName() {
        return this.employeeFullName;
    }

    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }

    public int getEmployeeFullId() {
        return this.employeeFullId;
    }

    public void setEmployeeFullId(int employeeFullId) {
        this.employeeFullId = employeeFullId;
    }

    @Override
    public String toString() {
        return "{" +
            " employeeFullName='" + getEmployeeFullName() + "'" +
            ", employeeFullId='" + getEmployeeFullId() + "'" +
            "}";
    }


    
}
