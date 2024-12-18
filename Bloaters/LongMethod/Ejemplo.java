package LongMethod;

public class Ejemplo {
    public void procesarPedido(Pedido pedido) {
        // Validar cliente
        if (pedido.getCliente() == null || pedido.getCliente().getNombre().isEmpty()) {
            throw new IllegalArgumentException("Cliente inválido");
        }
    
        // Verificar inventario
        for (Producto producto : pedido.getProductos()) {
            if (producto.getStock() <= 0) {
                throw new IllegalArgumentException("Producto sin stock: " + producto.getNombre());
            }
        }
    
        // Calcular impuestos
        double totalImpuestos = 0;
        for (Producto producto : pedido.getProductos()) {
            totalImpuestos += producto.getPrecio() * 0.15;
        }
    
        // Generar factura
        System.out.println("Generando factura para " + pedido.getCliente().getNombre());
        // Más lógica...
    }
    
}
