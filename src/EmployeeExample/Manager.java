package EmployeeExample;

public class Manager extends Employee{
    private int numberOfSubordinates;
    public Manager(String name, String address, double salary,String jobTitle,int numberOfSubordinates ){
        super(name, address, salary, jobTitle);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates(){
        return this.numberOfSubordinates;
    }
    @Override
    public double calculateBonus(){
        return getSalary() * 0.15;
    }
    @Override
    public String generatingPerformanceReport(){
        return "Performance report for "+getName()+": Excellent";
    }

    public void manageProject(){
        System.out.println("EmployeeExample.Manager " + getName()+" is managing that project");
    }

}
