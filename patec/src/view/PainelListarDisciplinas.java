package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import view.resources.BaseTable;
import view.resources.MenuBarCoord;

public class PainelListarDisciplinas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabelaDisciplinas;
	private String[] colunas = {"Código", "Nome", "Semestre"};
	private Object[][] dados = {{null, null, null}};

	/**
	 * Create the panel.
	 */
	public PainelListarDisciplinas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 450, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 272, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		MenuBarCoord mbc = new MenuBarCoord();
		GridBagConstraints gbc_mbc = new GridBagConstraints();
		gbc_mbc.gridwidth = 3;
		gbc_mbc.anchor = GridBagConstraints.NORTH;
		gbc_mbc.fill = GridBagConstraints.HORIZONTAL;
		gbc_mbc.insets = new Insets(0, 0, 5, 0);
		gbc_mbc.gridx = 0;
		gbc_mbc.gridy = 0;
		add(mbc, gbc_mbc);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelMenuCoordenador p = new PainelMenuCoordenador();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 1;
		add(btnVoltar, gbc_btnVoltar);

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
		gbc_btnSair.insets = new Insets(0, 0, 5, 0);
		gbc_btnSair.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSair.gridx = 2;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JScrollPane containerListaDisciplinas = new JScrollPane();
		GridBagConstraints gbc_containerListaDisciplinas = new GridBagConstraints();
		gbc_containerListaDisciplinas.insets = new Insets(0, 0, 5, 5);
		gbc_containerListaDisciplinas.fill = GridBagConstraints.BOTH;
		gbc_containerListaDisciplinas.gridx = 1;
		gbc_containerListaDisciplinas.gridy = 2;
		add(containerListaDisciplinas, gbc_containerListaDisciplinas);
		
		tabelaDisciplinas = new JTable(new BaseTable(colunas, dados));
		tabelaDisciplinas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		containerListaDisciplinas.setViewportView(tabelaDisciplinas);
		tabelaDisciplinas.setFillsViewportHeight(true);
	}
}
