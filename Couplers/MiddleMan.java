public class Empleado {
    public void trabajar() {
        //logica de trabajar
    }
}

public class Departamento {
    public void gestionarEmpleado(Empleado empleado) {
        empleado.trabajar();
    }
}

public class Gerente {
    private Departamento departamento;

    public void hacerTrabajar(Empleado empleado) {
        departamento.gestionarEmpleado(empleado); 
    }
}

