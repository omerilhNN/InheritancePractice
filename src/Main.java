import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Developer developer = new Developer("Omer", "Kurtulus",12500,"Jr.Android dev","Kotlin");
        Programmer programmer = new Programmer("Faruk","Cankaya",32000,"C#");
        Manager manager = new Manager("Ilhan","Ankara",45000,"Program Manager",5);

        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

        System.out.println(manager.generatingPerformanceReport());
        System.out.println(developer.generatingPerformanceReport());
        System.out.println(programmer.generatingPerformanceReport());

        manager.manageProject();
        developer.writeCode();
        programmer.debugCode();




    }
}