package organization;

public class OrganizationHierarchy {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Deo", 50000);
        Manager manager1 = new Manager("John Smith",60000,5000);
        Labour labour1= new Labour("Boe Johnson", 40000,2000);

        double totalSalary= calculateTotalSalary(employee1,manager1,labour1);
        System.out.println("Total Salary of all Employees: $"+ totalSalary);
    }
    public static double calculateTotalSalary(Employee... employees){
        double totalSalary = 0;
        for (Employee employee : employees){
            totalSalary +=employee.calculateSalary();
        }
        return totalSalary;
    }
}
