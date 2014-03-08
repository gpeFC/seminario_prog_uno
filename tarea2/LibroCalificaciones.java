/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.11 <LibroCalificaciones>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

public class LibroCalificaciones{

	private String nombreDelCurso;
	private String instructorCurso;

	public LibroCalificaciones(String nombre, String instructor){
		nombreDelCurso = nombre;
		instructorCurso = instructor;
	}

	public void establecerNombreDelCurso(String nombre){
		nombreDelCurso = nombre;
	}

	public void establecerNombreDelInstructor(String instructor){
		instructorCurso = instructor;
	}

	public String obtenerNombreDelCurso(){
		return nombreDelCurso;
	}

	public String obtenerNombreDelInstructor(){
		return instructorCurso;
	}

	public void mostrarMensaje(){
		System.out.printf("Bienvenido al Libro de calificaciones para \n%s!.\nEste curso es presentado por: %s\n", 
						  obtenerNombreDelCurso(), obtenerNombreDelInstructor());
	}
}