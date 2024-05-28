package Actividad2;

public class ClienteParticular extends Cliente {
    private String tarjeta;

    public ClienteParticular(String nombre, String tarjeta) {
        super(nombre);
        this.tarjeta = tarjeta;
    }

    @Override
    protected void pagar(Pedido pedido) {
        super.pagar(pedido);
        System.out.println("El pago se realizará con la tarjeta: " + tarjeta);
    }
}
