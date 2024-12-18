package Dispensable.DataClass;

public class Cliente {
    // Problema: Esta clase no tiene lógica de negocio ni métodos que justifiquen su existencia. Solo almacena datos y depende de otras clases para hacer todo el trabajo.
    private String nombre;
    private String direccion;
    private String telefono;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
}
