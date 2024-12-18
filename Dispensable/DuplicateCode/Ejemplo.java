package Dispensable.DuplicateCode;

public class Ejemplo {
    //Problema: Si necesitas cambiar la lógica del descuento, tendrás que modificarlo en varios lugares. Esto puede causar inconsistencias.
    // En la clase Cliente
    
public double calcularDescuento(double totalCompra) {
    if (totalCompra > 100) {
        return totalCompra * 0.10;
    }
    return 0;
}

// En la clase Proveedor
public double calcularDescuento(double totalCompra) {
    if (totalCompra > 100) {
        return totalCompra * 0.10;
    }
    return 0;
}

}
