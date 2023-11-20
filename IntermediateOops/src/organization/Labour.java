package organization;

public class Labour extends Employee {
    private double overtime;

    public Labour(String name, double baseSalary, double overtime){
        super(name,baseSalary);
        this.overtime=overtime;
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary()+overtime;
    }
}
