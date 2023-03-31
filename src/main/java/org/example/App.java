package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Виталий!" );

        Tester tester = new Tester("Ivan", "Ivanov", 500, "C1", 1902);
        tester.print();
        tester.print("hi");
        
        tester.print("hop hey, 5");

    }
}
