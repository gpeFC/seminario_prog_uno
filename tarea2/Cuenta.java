/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.12 <Cuenta>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

public class Cuenta{

	private double saldo;

	public Cuenta(double saldoInicial){
		if(saldoInicial > 0.0)
			saldo = saldoInicial;
	}

	public void abonar(double monto){
		saldo = saldo + monto;
	}

	public void cargar(double monto){
		if(monto > saldo){
			System.out.printf("\nEl monto a cargar excede el saldo de la cuenta.\n");
		}
		else{
			saldo = saldo - monto;
			System.out.printf("\nRetiro de saldo exitoso.\n");
		}
	}

	public double obtenerSaldo(){
		return saldo;
	}
}