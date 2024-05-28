package Actividad2;

  public class Main {
  public static void main(String[] args) {
  // Crear pedidos
  Pedido pedido1 = new Pedido("2024-05-28", 1000);
  Pedido pedido2 = new Pedido("2024-05-29", 2400);
  
  // Crear clientes
  ClienteCorporativo clienteCorp = new ClienteCorporativo("IngridBonita Inc",
  "zs22017036");
  ClienteParticular clientePart = new ClienteParticular("Sebastian Montero",
  "Tarjeta456564");
  
  // Realizar pagos
  clienteCorp.pagar(pedido1);
  clientePart.pagar(pedido2);
  
 }
  }
 
