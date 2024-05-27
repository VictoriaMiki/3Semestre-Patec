package view;

import java.awt.*;
import javax.swing.*;
import view.resources.*;

public class PainelListarDisciplinas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabelaDisciplinas;
	private String[] colunas = { "Código", "Nome", "Semestre" };
	private Object[][] dados = { { null, null, null } };

	/**
	 * Create the panel.
	 */
	public PainelListarDisciplinas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 66, 450, 0, 66, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 0, 272, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		MenuBarCoord mbc = new MenuBarCoord();
		GridBagConstraints gbc_mbc = new GridBagConstraints();
		gbc_mbc.gridwidth = 4;
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
		gbc_btnSair.gridx = 3;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JScrollPane containerListaDisciplinas = new JScrollPane();
		GridBagConstraints gbc_containerListaDisciplinas = new GridBagConstraints();
		gbc_containerListaDisciplinas.insets = new Insets(0, 0, 5, 5);
		gbc_containerListaDisciplinas.fill = GridBagConstraints.BOTH;
		gbc_containerListaDisciplinas.gridx = 1;
		gbc_containerListaDisciplinas.gridy = 3;
		add(containerListaDisciplinas, gbc_containerListaDisciplinas);

		tabelaDisciplinas = new JTable(new BaseTable(colunas, dados));
		tabelaDisciplinas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		containerListaDisciplinas.setViewportView(tabelaDisciplinas);
		tabelaDisciplinas.setFillsViewportHeight(true);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 3;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton btnNewButton = new JButton("Cadastrar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_1 = new JButton("Editar");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Excluir");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 3;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
	}
}
