/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.12 <PruebaCuenta>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class PruebaCuenta{
	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(50.00);
		Cuenta cuenta2 = new Cuenta(-7.53);

		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo());

		Scanner entrada = new Scanner(System.in);
		double montoDeposito;

		System.out.print("Escriba el monto a depositar para la cuenta1: ");
		montoDeposito = entrada.nextDouble();
		System.out.printf("\nSumando %.2f al saldo de la cuenta1.\n\n", montoDeposito);
		cuenta1.abonar(montoDeposito);

		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo());

		System.out.print("Escriba el monto a depositar para la cuenta2: ");
		montoDeposito = entrada.nextDouble();
		System.out.printf("\nSumando %.2f al saldo de la cuenta2.\n\n", montoDeposito);
		cuenta2.abonar(montoDeposito);

		System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo());

		double montoRetiro;
		System.out.printf("\nEscriba el monto a retirar de la cuenta1: ");
		montoRetiro = entrada.nextDouble();
		cuenta1.cargar(montoRetiro);
	}
}