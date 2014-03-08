/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 03 / Marzo / 2014
 *
 * Practica: Complejos(PruebaComplejos)
 ******************************************************************************/

public class PruebaComplejos{
	public static void main(String[] args) {

		Complejos cmps, cmpr, cmpp, cmpd;
		Complejos cmp1 = new Complejos();
		Complejos cmp2 = new Complejos(2.0, 2.0);

		cmp1.imprimirComplejos(1);
		cmp2.imprimirComplejos(2);

		cmp1.establecerReal(5.0);
		cmp1.establecerImaginaria(2.0);
		cmp2.establecerReal(2.0);
		cmp2.establecerImaginaria(-3.0);

		cmp1.imprimirComplejos(1);
		cmp2.imprimirComplejos(2);

		cmps = new Complejos();
		cmps.sumaComplejos(cmp1, cmp2);
		cmpr = new Complejos();
		cmpr.restaComplejos(cmp1, cmp2);
		cmpp = new Complejos();
		cmpp.productoComplejos(cmp1, cmp2);
		cmpd = new Complejos();
		cmpd.divisionComplejos(cmp1, cmp2);

		cmps.imprimirComplejos(3);
		cmpr.imprimirComplejos(4);
		cmpp.imprimirComplejos(5);
		cmpd.imprimirComplejos(6);

		System.out.println();
	}
}