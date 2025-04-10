package org.example;

public class Tester {
    private String name;
    private String surname;
    private int background;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0, "Сыромолот", 0.0);
    }

    public Tester(String name, String surname, int background) {
        this(name, surname, background, "B1", 300.0);
    }

    public Tester(String name, String surname, int background, String englishLevel) {
        this(name, surname, background, englishLevel, 100.0);
    }

    public Tester(String name, String surname, int background, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.background = background;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Тестировшик - " + name + " " + surname);
    }

    public void printInfo(boolean showBackground) {
        System.out.print("Тестировщик - " + name + " " + surname);
        if (showBackground) {
            System.out.print(", Опыт - " + background + " лет");
        }
        System.out.println();
    }

    public void printInfo(String message) {
        System.out.println("Тестировщик - " + name + " " + surname + ". " + message);
    }
    public static void printSumSalary(double salary1, double salary2, double salary3) {
        double sum = salary1 + salary2 + salary3;
        System.out.println("Сумма заработных плат - " + sum);
    }
}