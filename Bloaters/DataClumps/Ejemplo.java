package Bloaters.DataClumps;

public class Ejemplo {
    //Problema: Los mismos datos siempre viajan juntos, pero no están encapsulados.
    public void registrarViaje(String boleto, String pasaporte, String reservaHotel) {
        System.out.println("Registrando viaje con: " + boleto + ", " + pasaporte + ", " + reservaHotel);
    }
    
    public void validarViaje(String boleto, String pasaporte, String reservaHotel) {
        System.out.println("Validando viaje...");
    }
    
}
