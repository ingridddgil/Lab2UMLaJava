package Actividad2;

public class ClienteCorporativo extends Cliente {
    private String cuenta;

    public ClienteCorporativo(String nombre, String cuenta) {
        super(nombre);
        this.cuenta = cuenta;
    }

    @Override
    protected void pagar(Pedido pedido) {
        super.pagar(pedido);
        System.out.println("El pago se realizará desde la cuenta corporativa: " + cuenta);
    }
}
