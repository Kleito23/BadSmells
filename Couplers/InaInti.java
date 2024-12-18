public class Cliente {
    private double saldo;

    public double getSaldo(){
        return saldo;
    }
    public void actualizarSaldo(double monto) {
        this.saldo += monto;
    }
}

public class CuentaBancaria {
    private Cliente cliente;
 
    public void depositar(double monto) {
        cliente.actualizarSaldo(monto); 
        System.out.println("Se depositó exitosamente.");
    }

    public void retirar(double monto) {
        if (cliente.getSaldo() >= monto) {
            cliente.actualizarSaldo(-monto);
            System.out.println("Se retiró exitosamente.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}