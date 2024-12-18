public class Persona{
	private Direccion direccion;

	public Direccion getDireccion(){
		return direccion;
	}
}

public class Direccion{
	private String ciudad;

	public String getCiudad(){
		return ciudad;
	}
}

public class Main{
	public static void main(String[] args){
        Persona persona=new Persona();
		//Codigo
		String ciudad=persona.getDireccion().getCiudad();
    }
}
