package view;

import java.awt.*;
import javax.swing.*;
import view.resources.*;

public class PainelConsultaRelatorio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfRa;

	/**
	 * Create the panel.
	 */
	public PainelConsultaRelatorio() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 300, 0, 300, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 0, 272, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		MenuBarCoord bdf = new MenuBarCoord();
		GridBagConstraints gbc_bdf = new GridBagConstraints();
		gbc_bdf.gridwidth = 7;
		gbc_bdf.anchor = GridBagConstraints.NORTH;
		gbc_bdf.fill = GridBagConstraints.HORIZONTAL;
		gbc_bdf.insets = new Insets(0, 0, 5, 0);
		gbc_bdf.gridx = 0;
		gbc_bdf.gridy = 0;
		add(bdf, gbc_bdf);

		BtnVoltar btnVoltar = new BtnVoltar("Voltar");
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.anchor = GridBagConstraints.NORTH;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 1;
		add(btnVoltar, gbc_btnVoltar);

		BtnSair btnSair = new BtnSair("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 5, 0);
		gbc_btnSair.anchor = GridBagConstraints.NORTH;
		gbc_btnSair.gridx = 6;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JPanel containerRelatorioDisciplina = new JPanel();
		GridBagConstraints gbc_containerRelatorioDisciplina = new GridBagConstraints();
		gbc_containerRelatorioDisciplina.insets = new Insets(0, 0, 5, 5);
		gbc_containerRelatorioDisciplina.fill = GridBagConstraints.BOTH;
		gbc_containerRelatorioDisciplina.gridx = 2;
		gbc_containerRelatorioDisciplina.gridy = 3;
		add(containerRelatorioDisciplina, gbc_containerRelatorioDisciplina);
		GridBagLayout gbl_containerRelatorioDisciplina = new GridBagLayout();
		gbl_containerRelatorioDisciplina.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		gbl_containerRelatorioDisciplina.columnWeights = new double[] { 1.0 };
		containerRelatorioDisciplina.setLayout(gbl_containerRelatorioDisciplina);

		JLabel lblRelatorioDisciplina = new JLabel("Por Disciplina");
		lblRelatorioDisciplina.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblRelatorioDisciplina = new GridBagConstraints();
		gbc_lblRelatorioDisciplina.fill = GridBagConstraints.VERTICAL;
		gbc_lblRelatorioDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_lblRelatorioDisciplina.gridx = 0;
		gbc_lblRelatorioDisciplina.gridy = 0;
		containerRelatorioDisciplina.add(lblRelatorioDisciplina, gbc_lblRelatorioDisciplina);

		JLabel lblSelecaoDisciplina = new JLabel("Selecione a disciplina:");
		lblSelecaoDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblSelecaoDisciplina = new GridBagConstraints();
		gbc_lblSelecaoDisciplina.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblSelecaoDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelecaoDisciplina.gridx = 0;
		gbc_lblSelecaoDisciplina.gridy = 2;
		containerRelatorioDisciplina.add(lblSelecaoDisciplina, gbc_lblSelecaoDisciplina);

		JComboBox cbDisciplina = new JComboBox();
		cbDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_cbDisciplina = new GridBagConstraints();
		gbc_cbDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_cbDisciplina.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbDisciplina.gridx = 0;
		gbc_cbDisciplina.gridy = 3;
		containerRelatorioDisciplina.add(cbDisciplina, gbc_cbDisciplina);

		JButton btnGerarRelatorioDisciplina = new JButton("Gerar Relatório");
		GridBagConstraints gbc_btnGerarRelatorioDisciplina = new GridBagConstraints();
		gbc_btnGerarRelatorioDisciplina.gridx = 0;
		gbc_btnGerarRelatorioDisciplina.gridy = 5;
		containerRelatorioDisciplina.add(btnGerarRelatorioDisciplina, gbc_btnGerarRelatorioDisciplina);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.VERTICAL;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 3;
		gbc_separator.gridy = 3;
		add(separator, gbc_separator);

		JPanel containerRelatorioAluno = new JPanel();
		GridBagConstraints gbc_containerRelatorioAluno = new GridBagConstraints();
		gbc_containerRelatorioAluno.insets = new Insets(0, 0, 5, 5);
		gbc_containerRelatorioAluno.fill = GridBagConstraints.BOTH;
		gbc_containerRelatorioAluno.gridx = 4;
		gbc_containerRelatorioAluno.gridy = 3;
		add(containerRelatorioAluno, gbc_containerRelatorioAluno);
		GridBagLayout gbl_containerRelatorioAluno = new GridBagLayout();
		gbl_containerRelatorioAluno.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0 };
		gbl_containerRelatorioAluno.columnWeights = new double[] { 1.0 };
		containerRelatorioAluno.setLayout(gbl_containerRelatorioAluno);

		JLabel lblRelatorioAluno = new JLabel("Por Aluno");
		lblRelatorioAluno.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblRelatorioAluno = new GridBagConstraints();
		gbc_lblRelatorioAluno.insets = new Insets(0, 0, 5, 0);
		gbc_lblRelatorioAluno.gridx = 0;
		gbc_lblRelatorioAluno.gridy = 0;
		containerRelatorioAluno.add(lblRelatorioAluno, gbc_lblRelatorioAluno);

		JLabel lblEntradaRa = new JLabel("Digite o RA do aluno:");
		lblEntradaRa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEntradaRa = new GridBagConstraints();
		gbc_lblEntradaRa.anchor = GridBagConstraints.WEST;
		gbc_lblEntradaRa.insets = new Insets(0, 0, 5, 0);
		gbc_lblEntradaRa.gridx = 0;
		gbc_lblEntradaRa.gridy = 2;
		containerRelatorioAluno.add(lblEntradaRa, gbc_lblEntradaRa);

		tfRa = new JTextField();
		tfRa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tfRa = new GridBagConstraints();
		gbc_tfRa.insets = new Insets(0, 0, 5, 0);
		gbc_tfRa.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfRa.gridx = 0;
		gbc_tfRa.gridy = 3;
		containerRelatorioAluno.add(tfRa, gbc_tfRa);
		tfRa.setColumns(10);

		JButton btnGerarRelatorioAluno = new JButton("Gerar Relatório");
		GridBagConstraints gbc_btnGerarRelatorioAluno = new GridBagConstraints();
		gbc_btnGerarRelatorioAluno.gridx = 0;
		gbc_btnGerarRelatorioAluno.gridy = 5;
		containerRelatorioAluno.add(btnGerarRelatorioAluno, gbc_btnGerarRelatorioAluno);
	}

}
