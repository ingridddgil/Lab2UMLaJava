package Actividad1;

public class Main {
    public static void main(String[] args) {
        // Crear una empresa
        Company company = new Company("IngridBonita Inc", 10);

        // Crear empleados a tiempo completo y parcial
        FullTimeEmp fullTimeEmp1 = new FullTimeEmp("Ingrid Sarahi", 1, 50000);
        FullTimeEmp fullTimeEmp2 = new FullTimeEmp("Joseph Avendaño", 2, 40000);
     
        PartTimeEmp partTimeEmp1 = new PartTimeEmp("Julio Gutiérrez", 4, 25, 15);


        // Añadir empleados a la empresa
        company.addEmployee(fullTimeEmp1);
        company.addEmployee(partTimeEmp1);
        company.addEmployee(fullTimeEmp2); 

        // Mostrar todos los empleados
        company.displayAll();

     
        int index = company.searchName("Ingrid Sarahi");
        System.out.println("Índice de Ingrid: " + index);

        // Calcular y mostrar el pago anual de un empleado
        double yearlyPay = company.getYearlyPay("Ingrid");
        System.out.println("Pago anual de Ingrid: " + yearlyPay);

        // Calcular y mostrar el pago promedio de los empleados a tiempo parcial
        double avgPartTimePay = company.calAvgPayForPartTime();
        System.out.println("Pago promedio de los empleados a tiempo parcial: " + avgPartTimePay);

        // Eliminar empleado por nombre
        company.deleteEmployee("Julio Gutiérrez");
    

        company.displayAll();
    }
}

