package organization;

public class Manager extends Employee {
    private double incentive;

    public Manager(String name,double baseSalary, double incentive){
        super(name,baseSalary);
        this.incentive=incentive;
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary()+incentive;
    }
}
