/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hrapp;

/**
 *
 * @author nishanthinim
 */
public class Department {

    private String name;
    private Employee[] emp = new Employee[10];
    private int last_count = -1;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmp(Employee aEmployee) {
        if (last_count < emp.length) {
            last_count++;
            emp[last_count] = aEmployee;
        }
    }

    public Employee[] getEmployee() {
        Employee actual[] = new Employee[last_count + 1];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = emp[i];
        }
        return actual;
    }

    public int getEmpCount() {
        return last_count + 1;
    }

    public Employee getEmpByID(int empID) {
        for (Employee x : emp) {
            if (x != null) {
                if (x.getID() == (empID)) {
                    return x;
                }
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double total = 0.0;
        for (int i = 0; i < last_count; i++) {
            total += emp[i].getSalary();
        }
        return total;
    }

    public double getAvgSalary() {
        if (last_count > -1) {
            return getTotalSalary() / (last_count + 1);
        }
        return 0.0;
    }

    public String toString() {
        return name;
    }
}
