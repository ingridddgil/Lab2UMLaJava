package Actividad3;


public class Main {
    public static void main(String[] args) {
     Empleado empleado1 = new Empleado("Julio Gutierrez");
     Empleado empleado2 = new Empleado("Ingrid Gil");
     
     TareaOptativa tareaOptativa = new TareaOptativa("Desarrollo de Software",
     10);
     TareaAdministrativa tareaAdministrativa = new
     TareaAdministrativa("Revisión de Documentos");
     
     empleado1.hacerTarea(tareaOptativa);
     empleado2.hacerTarea(tareaAdministrativa);
     
     }
}