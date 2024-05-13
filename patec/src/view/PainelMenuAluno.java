package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PainelMenuAluno extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PainelMenuAluno() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{450, 0};
		gridBagLayout.rowHeights = new int[]{28, 272, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		JMenuBar menuBar = new JMenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.anchor = GridBagConstraints.NORTH;
		gbc_menuBar.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBar.insets = new Insets(0, 0, 5, 0);
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		add(menuBar, gbc_menuBar);
		
		JMenu mnNewMenu = new JMenu("Semestres");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("1° SEM");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("2° SEM");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("3° SEM");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("4° SEM");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("5° SEM");
		mnNewMenu.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("6° SEM");
		mnNewMenu.add(mnNewMenu_6);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelLogin p = new PainelLogin();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSair.gridx = 0;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);
	}

}
