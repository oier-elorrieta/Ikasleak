package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelPelis;

@SuppressWarnings("serial")
public class PanelPelis extends JPanel {

	private JButton btnVolver;
	private JLabel lblPelis;
	private ControladorPanelPelis controladorPanelPelis;
	
	public PanelPelis(ControladorPanelPelis controladorPanelPelis)
	{
		this.controladorPanelPelis = controladorPanelPelis;
		
		setLayout(null);
		
		lblPelis = new JLabel("Panel Pelis");
		lblPelis.setBounds(58, 35, 115, 14);
		add(lblPelis);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(58, 62, 89, 23);
		add(btnVolver);
		
		JButton btnHasiera = new JButton("Hasiera");
		btnHasiera.setBounds(58, 107, 89, 23);
		add(btnHasiera);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnVolver.addActionListener(listenerBotonVolver(this.controladorPanelPelis));
	}
	
	private ActionListener listenerBotonVolver(ControladorPanelPelis controladorPanelPelis) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver");
				controladorPanelPelis.accionadoBottonVolverPanelPelis();
			}
		};
	}
}
