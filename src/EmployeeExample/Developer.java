package EmployeeExample;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage){
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }
    public String getProgrammingLanguage(){
        return this.programmingLanguage;
    }
    @Override
    public double calculateBonus(){
        return getSalary()* 0.25;
    }
    @Override
    public String generatingPerformanceReport(){
        return "EmployeeExample.Programmer" + getName() + "performance is Wonderful";
    }

    public void writeCode(){
        System.out.println("EmployeeExample.Programmer" + getName() + "is writing code in "+ getProgrammingLanguage());
    }




}
