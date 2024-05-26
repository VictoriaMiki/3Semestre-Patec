package view;

import java.awt.*;
import javax.swing.*;
import view.resources.*;

public class PainelListarGabaritos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabelaGabaritos;
	private String[] colunas = {"Código", "Questão 1", "Questão 2", "Questão 3", "Questão 4", "Questão 5", "Disciplina", "Avaliação"};
	private Object[][] dados = {{null, null, null, null, null, null, null, null}};

	/**
	 * Create the panel.
	 */
	public PainelListarGabaritos() {
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

		JScrollPane containerListaGabaritos = new JScrollPane();
		GridBagConstraints gbc_containerListaGabaritos = new GridBagConstraints();
		gbc_containerListaGabaritos.insets = new Insets(0, 0, 5, 5);
		gbc_containerListaGabaritos.fill = GridBagConstraints.BOTH;
		gbc_containerListaGabaritos.gridx = 1;
		gbc_containerListaGabaritos.gridy = 2;
		add(containerListaGabaritos, gbc_containerListaGabaritos);
		
		tabelaGabaritos = new JTable(new BaseTable(colunas, dados));
		tabelaGabaritos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		containerListaGabaritos.setViewportView(tabelaGabaritos);
		tabelaGabaritos.setFillsViewportHeight(true);
	}
}
