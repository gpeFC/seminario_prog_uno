/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 10 / Febrero / 2014
 *
 * Ejercicio <PruebaFiguras>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaFiguras{
	public static void main(String[] args) {
		String entradaFigura = JOptionPane.showInputDialog(
			"Escriba 1 o 2 para dibujar una figura.\n"
			);
		int opcionFigura = Integer.parseInt(entradaFigura);

		Figuras panel = new Figuras(opcionFigura);
		JFrame aplicacion = new JFrame();

		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(panel);
		aplicacion.setSize(600,600);
		aplicacion.setVisible(true);
	}
}