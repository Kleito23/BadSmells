package Dispensable.LazyClass;

public class RegistroHistorico {
    //Problema: Esta clase apenas hace algo útil. Solo tiene un atributo y dos métodos que podrían integrarse fácilmente en otra clase.
    private String historial;

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
}
