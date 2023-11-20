package organization;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee (String name, double baseSalary){
        this.name= name;
        this.baseSalary=baseSalary;
    }
    public double calculateSalary(){
        return baseSalary;
    }
    public String getName(){
        return name;
    }
}
