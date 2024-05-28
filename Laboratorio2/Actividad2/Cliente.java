package Actividad2;

public class Cliente {
    protected String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    protected void pagar(Pedido pedido) {
        System.out.println(nombre + " está pagando un pedido de " + pedido.getPrecio() + " unidades.");
    }
}
