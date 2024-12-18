public class Direccion {
    private String calle;
    private String ciudad;
    private String pais;


    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }
}

public class Persona {
    private String nombre;
    private Direccion direccion;


    public String getDireccionCompleta() {
        return direccion.getCalle() + ", " + address.getCiudad() + ", " + address.getPais();  
    }

}

