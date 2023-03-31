package org.example;


public class Tester {
    public String name;

    public String surmane;

    public int expirenceInYear;

    public String EnglishLevel;

    public double salary;

    public Tester(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Tester(String name, double salary, String EnglishLevel) {
        this(name, salary);
        this.EnglishLevel = EnglishLevel;
    }

    public Tester(
            String name,
            String surmane,
            double salary,
            String EnglishLevel,
            int expirenceInYear) {

        this(name, salary, EnglishLevel);

        this.expirenceInYear = expirenceInYear;
    }

    public void print() {
        System.out.println("print()");

        System.out.println("print(String str, int count)");
        System.out.println("name: " + name);
        System.out.println("surmane: " + surmane);
        System.out.println("salary: " + salary);
        System.out.println("EnglishLevel: " + EnglishLevel);
        System.out.println("expirenceInYear: " + expirenceInYear);
    }

    public void print(String str) {
        System.out.println("print(String str)");

        System.out.println(str);
    }

    public void print(String str, int count) {
        System.out.println("print(String str, int count)");

        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

}
