/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 30 / Enero / 2014
 *
 * Ejercicio 4.19 <PanelDibujo>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		int anchura = getWidth();
		int altura = getHeight();

		g.drawLine(0,0,anchura,altura);
		g.drawLine(0,altura,anchura,0);
	}
}