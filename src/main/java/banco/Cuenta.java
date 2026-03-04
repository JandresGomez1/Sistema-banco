package banco;

public class Cuenta {

    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        if (monto<0 || monto>2000000){
            System.out.println("Ingrese un valor correcto".toUpperCase());
        }else {
            this.saldo = monto+saldo;
            System.out.println("Deposito exitoso".toUpperCase());
        }
    }

    public void retirar(double monto){
        if(monto>saldo){
            System.out.println("saldo insuficiente.".toUpperCase());
        }else{
            this.saldo = saldo-monto;
            System.out.println("Retiro exitoso".toUpperCase());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
