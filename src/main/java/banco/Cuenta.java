package banco;

public class Cuenta {

    private int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int monto){
        if (monto<0){
            System.out.println("Ingrese un valor correcto".toUpperCase());
        }else {
            this.saldo = monto+saldo;
            System.out.println("Deposito exitoso".toUpperCase());
        }
    }

    public void retirar(int monto){
        if(monto>saldo){
            System.out.println("saldo insuficiente.".toUpperCase());
        }else{
            this.saldo = monto-saldo;
            System.out.println("Retiro exitoso".toUpperCase());
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


}
