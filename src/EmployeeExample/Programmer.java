package EmployeeExample;

public class Programmer extends Developer{
    public Programmer(String name, String address, double salary,String programmingLanguage){
        super(name,address,salary,"EmployeeExample.Programmer",programmingLanguage);
    }
    @Override
    public double calculateBonus(){
        return getSalary()*0.12;
    }
    @Override
    public String generatingPerformanceReport(){
        return "Performance of " + getName() + "is OK!.";
    }
    public void debugCode(){
        System.out.println("Programemr" + getName() + "is debugging code in" + getProgrammingLanguage());
    }

}
