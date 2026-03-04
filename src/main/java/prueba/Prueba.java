package prueba;

import banco.Cuenta;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion=0;

        Cuenta cuenta = null;

        System.out.println("Bienvenidos al banco el Ahorrador".toUpperCase());
        System.out.println("1. crear cuenta sin saldo inicial".toUpperCase());
        System.out.println("2. crear cuenta con saldo inicial".toUpperCase());
        System.out.println("3. salir".toUpperCase());
        System.out.print("Elige una opcion: ".toUpperCase());

        opcion = sc.nextInt();

        if (opcion == 1) {
            cuenta = new Cuenta(0);
        } else if (opcion == 2) {
            System.out.print("Ingrese monto incial:".toUpperCase());
            double monto = sc.nextInt();
            cuenta = new Cuenta(monto);
        } else {
            System.exit(0);
        }

        int op;
        do{
            System.out.println("");
            System.out.println("Que desea hacer".toUpperCase());
            System.out.println("1. Depositar".toUpperCase());
            System.out.println("2. retirar".toUpperCase());
            System.out.println("3. consultar saldo".toUpperCase());
            System.out.println("4. salir".toUpperCase());
            System.out.print("Elige una opcion: ".toUpperCase());

            op = sc.nextInt();

            double monto;

            switch (op){
                case 1:
                    System.out.println("Ingrese valor a depositar".toUpperCase());
                    monto = sc.nextInt();
                    cuenta.depositar(monto);
                    break;
                case 2:
                    System.out.println("Ingrese valor a retirar".toUpperCase());
                    monto = sc.nextInt();
                    cuenta.retirar(monto) ;
                    break;
                case 3:
                    System.out.println("su saldo es: ".toUpperCase() + cuenta.getSaldo());
                    break;
            }
        }while(op!=4);
    }
}
