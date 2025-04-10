package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello,Dominik");
        Tester tester1 = new Tester("Сыромолот", "Доминик");
        Tester tester2 = new Tester("Малинкович", "Григорий", 3);
        Tester tester3 = new Tester("Усачев", "Егор", 5, "C1");
        Tester tester4 = new Tester("Бубнов", "Игорь", 7, "B2", 1500.0);
        tester1.printInfo();
        tester2.printInfo(true);
        tester3.printInfo(false);
        tester4.printInfo("W");
        Tester.printSumSalary(1000.0, 1500.0, 2000.0);
    }
}