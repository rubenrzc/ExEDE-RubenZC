package interfaz;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Etiqueta {
	public JLabel lblResultado;
	public JButton btnDepar;
	public JButton btnEmple;
	public JButton btnEstadDepar;
	public JButton btnEstadEmple;

	public Etiqueta(JButton btnDepar, JButton btnEmple, JButton btnEstadDepar, JButton btnEstadEmple) {
		this.btnDepar = btnDepar;
		this.btnEmple = btnEmple;
		this.btnEstadDepar = btnEstadDepar;
		this.btnEstadEmple = btnEstadEmple;
	}
}