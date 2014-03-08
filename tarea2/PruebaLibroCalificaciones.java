/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.11 <PruebaLibroCalificaciones>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

public class PruebaLibroCalificaciones{
	public static void main(String[] args){

		LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones("CS101 Introduccion a la programacion en Java", "Fulano de Tal");
		LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones("CS102 Estructuras de datos en Java", "Sutano de Tal");

		System.out.printf("EL nombre del curso libroCalificaciones1 es: %s\n", libroCalificaciones1.obtenerNombreDelCurso());
		System.out.printf("EL nombre del curso libroCalificaciones2 es: %s\n", libroCalificaciones2.obtenerNombreDelCurso());
	}
}