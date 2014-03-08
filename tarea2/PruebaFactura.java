/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.13 <PruebaFactura>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.util.Scanner;

public class PruebaFactura{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Factura factura1 = new Factura("AGZ023", "Pelota", 5, 120.0);

		System.out.printf("\n Factura: \n NumArt: %s \n DescripArt: %s \n CantArt: %d \n PrecioArt: %.2f \n MontoTotal: %.2f\n", factura1.obtenerNumeroDePieza(),
							factura1.obtenerDescripcionPieza(), factura1.obtenerCantidadArticulos(), 
							factura1.obtenerPrecioArticulo(), factura1.obtenerMontoFactura());
	}
}