/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 3.13 <Factura>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

public class Factura{

	private String numeroDePieza;
	private String descripcionPieza;
	private int cantidadArticulos;
	private double precioArticulo;

	public Factura(String numPieza, String descpPieza, int cantArticulos, double precArticulo){
		numeroDePieza = numPieza;
		descripcionPieza = descpPieza;
		if(cantArticulos < 0){
			cantidadArticulos = 0;
		}
		else{
			cantidadArticulos = cantArticulos;
		}
		if(precArticulo < 0.0){
			precioArticulo = 0.0;
		}
		else{
			precioArticulo = precArticulo;
		}
	}

	public void establecerNumeroDePieza(String numPieza){
		numeroDePieza = numPieza;
	}
	public String obtenerNumeroDePieza(){
		return numeroDePieza;
	}

	public void establecerDescripcionPieza(String descpPieza){
		descripcionPieza = descpPieza;
	}
	public String obtenerDescripcionPieza(){
		return descripcionPieza;
	}

	public void establecerCantidadArticulos(int cantArticulos){
		cantidadArticulos = cantArticulos;
	}
	public int obtenerCantidadArticulos(){
		return cantidadArticulos;
	}

	public void establecerPrecioArticulo(double precArticulo){
		precioArticulo = precArticulo;
	}
	public double obtenerPrecioArticulo(){
		return precioArticulo;
	}

	public double obtenerMontoFactura(){
		return (cantidadArticulos * precioArticulo);
	}
}