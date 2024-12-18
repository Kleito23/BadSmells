public class Juego{
  private String nombreJugador;
  private int puntaje;

public void empezar(String nombreJugador, int puntaje){
    this.nombreJugador = nombreJuador;
    this.puntaje = puntaje;
    System.out.println("Nombre: "+ nombreJugador + "puntaje: "+ puntaje);
  }

public void finalizar(){
  System.out.println("Finalizacion del juego");
  nombreJugador = null;
  puntaje = 0;
  }
}  
