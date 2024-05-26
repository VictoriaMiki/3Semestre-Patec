package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import view.resources.BaseTable;
import view.resources.BtnSair;
import view.resources.BtnVoltar;
import view.resources.MenuBarCoord;

public class PainelListarAlunos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabelaAlunos;
	private String[] colunas = {"RA", "CPF", "Nome Completo", "Data de Nascimento"};
	private Object[][] dados = {{null, null, null, null}};

	/**
	 * Create the panel.
	 */
	public PainelListarAlunos() {
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

		BtnVoltar btnVoltar = new BtnVoltar("Voltar");
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 1;
		add(btnVoltar, gbc_btnVoltar);

		BtnSair btnSair = new BtnSair("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 5, 0);
		gbc_btnSair.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSair.gridx = 2;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JScrollPane containerListaAlunos = new JScrollPane();
		GridBagConstraints gbc_containerListaAlunos = new GridBagConstraints();
		gbc_containerListaAlunos.insets = new Insets(0, 0, 5, 5);
		gbc_containerListaAlunos.fill = GridBagConstraints.BOTH;
		gbc_containerListaAlunos.gridx = 1;
		gbc_containerListaAlunos.gridy = 2;
		add(containerListaAlunos, gbc_containerListaAlunos);
		
		tabelaAlunos = new JTable(new BaseTable(colunas, dados));
		tabelaAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		containerListaAlunos.setViewportView(tabelaAlunos);
		tabelaAlunos.setFillsViewportHeight(true);
	}

}
