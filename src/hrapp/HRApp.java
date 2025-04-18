/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author nishanthinim
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("WElcome Krishna!!");

        Employee e1 = new Employee(23, "Kanna", 563882);
        Employee e2 = new Employee(30, "Krishna", 3628936);
//        System.out.println("Emp2 : " + e1);

        Department dpt = new Department("Education");
        System.out.println("Department : " + dpt.getName());
        dpt.addEmp(e1);
        dpt.addEmp(e2);
        dpt.addEmp(new Employee(68, "krish", 689545));

        Employee emp[] = dpt.getEmployee();
        
        for (Employee x : emp) {
            System.out.println("Emp: " + x);
        }
        System.out.println("Total salary : " + dpt.getTotalSalary());
        System.out.println("Average salary : " + dpt.getAvgSalary());
    }

}
