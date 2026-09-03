public class Employee {
    private String name;
    private int empID;
    private double salary;

    public void setName(String name){
        this.name = name;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getEmpID(){
        return empID;
    }
    public double getSalary(){
        return salary;
    }

    Employee(String name, int empID, double salary){
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println(getName());
        System.out.println(getEmpID());
        System.out.println(getSalary());
    }
}
