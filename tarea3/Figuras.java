/******************************************************************************
 * Seminario de Programacion I
 * Emanuel GP
 * 10 / Febrero / 2014
 *
 * Ejercicio <Figuras>
 * (Como programar en Java, Deitel.)
 ******************************************************************************/

import java.awt.Graphics;
import javax.swing.JPanel;

public class Figuras extends JPanel{
	
	private int opcion;

	public Figuras(int opcionFigura){
		opcion = opcionFigura;
	}

	public void paintComponent( Graphics g){
		super.paintComponent(g);
		switch(opcion){
			case 1:
				for(int i=0; i<100; i++){
					g.drawRect(250-i, 250-i, 80, 80);
					g.drawRect(250+i, 250-i, 80, 80);
					g.drawRect(250-i, 250+i, 80, 80);
					g.drawRect(250+i, 250+i, 80, 80);
					g.drawOval(93-i/2, 93-i/2, 393+i, 393+i);
				}
				break;
			case 2:
				for(int i=0; i<100; i++){
					g.drawOval(300-i, 300-i, i, i);
					g.drawOval(300, 300-i, i+1, i);
					g.drawOval(300-i, 300, i+1, i);
					g.drawOval(300, 300, i+1, i);
					g.drawRect(200-i/2, 200-i/2, 200+i, 200+i);
				}
				break;
		}
	}
}