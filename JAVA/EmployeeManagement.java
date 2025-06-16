//OOP PRACTICE - INHERITANCE

class Employee{
    public int EmpID;
    public String EmpName;

    Employee(int EmpID, String EmpName){
        this.EmpID = EmpID;
        this.EmpName = EmpName;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + EmpID);
        System.out.println("Employee Name: " + EmpName);
    }
}

class Manager extends Employee{
    public String Dept;
    Manager(int EmpID, String EmpName, String Dept){
        super(EmpID, EmpName);
        this.Dept = Dept;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department :"+Dept);
    }
}

public class EmployeeManagement {
    public static void main (String args[]){
        Employee emp1 = new Employee(1001, "Nithesh");
        emp1.displayDetails();
        Manager emp2 = new Manager(1002,"Nidhi", "Development");
        emp2.displayDetails();
    }
}
