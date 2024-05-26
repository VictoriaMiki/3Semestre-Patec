package view.resources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.FramePatec;
import view.PainelMenuCoordenador;

public class BtnVoltar extends JButton {
	public BtnVoltar(String texto) {
		super(texto);
		this.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelMenuCoordenador p = new PainelMenuCoordenador();
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
	}
}