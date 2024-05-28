package Actividad3;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean hacerTarea(Tarea tarea) {

        System.out.println(nombre + " está haciendo la tarea: " + tarea.getNombre());
        return true;
    }

}
