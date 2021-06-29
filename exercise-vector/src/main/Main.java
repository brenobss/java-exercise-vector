package main;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int numEmployees = sc.nextInt();
        Employee[] employees = new Employee[numEmployees];
        int count = 1;
        for (int i = 0; i < numEmployees; i++){
            System.out.println();
            System.out.println("Employee #" + count + ": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            employees[i] = new Employee(id, name, salary);
            count++;
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int searchId = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < employees.length; i++){
            if (employees[i].getId() == searchId){
                System.out.print("Enter the percentage: ");
                double percent = sc.nextDouble();
                sc.nextLine();
                employees[i].setIncrease(percent);
                break;
            } else if (i == employees.length - 1){
                System.out.println("This id does not exist!");
            }
        }
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee employee : employees){
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
        }




    }
}
