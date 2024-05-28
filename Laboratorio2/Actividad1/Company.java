package Actividad1;
import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Employee> arrEmployee;
    private int nbEmployee;

    public Company(String name, int size) {
        this.name = name;
        this.arrEmployee = new ArrayList<>(size);
        this.nbEmployee = 0;
    }

    public String getNameCompany(){
        return name; 
    }

    public int getNbEmployee(){
        return nbEmployee; 
    }

    public void displayAll() {
        for (Employee e : arrEmployee) {
            e.display();
        }
    }

    public void addEmployee(Employee e) {
        arrEmployee.add(e);
        nbEmployee++;
    }

    public int searchName(String name) {
        for (int i = 0; i < arrEmployee.size(); i++) {
            if (arrEmployee.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteEmployee(String name) {
        int index = searchName(name);
        if (index != -1) {
            arrEmployee.remove(index);
            nbEmployee--;
        }
        System.out.println("El empleado ha sido eliminado");
    }

    public double getYearlyPay(String name) {
        int index = searchName(name);
        if (index != -1) {
            return arrEmployee.get(index).calculatePay() * 12;
        }
        return 0.0;
    }

    public double calAvgPayForPartTime() {
        double totalPay = 0.0;
        int count = 0;
        for (Employee e : arrEmployee) {
            if (e instanceof PartTimeEmp) {
                totalPay += e.calculatePay();
                count++;
            }
        }
        return count == 0 ? 0.0 : totalPay / count;
    }
}
