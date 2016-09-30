package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Jackson {
    private String dept;
    private float paygrade;
    private int employeeID;

    public String introduceYourself()
    {
        return "Hello! I am "+getFname()+" "+getLname()+"! I work for CITE! :)";
    }


    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public float getPaygrade() {
        return paygrade;
    }

    public void setPaygrade(float paygrade) {
        this.paygrade = paygrade;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
