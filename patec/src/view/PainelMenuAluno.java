package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import view.resources.BtnSair;

public class PainelMenuAluno extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PainelMenuAluno() {

		String[] semestres = { "-- selecione um semestre --", "1° SEM", "2° SEM", "3° SEM", "4° SEM", "5° SEM",
				"6° SEM" };
		String[] disciplinas = { "-- selecione uma disciplina --" };
		String[] disciplinasPrimeiroSemestre = { "-- selecione uma disciplina --", "Administração Geral",
				"Comunicação e Expressão", "Contabilidade", "Informática Aplicada a Gestão", "Inglês I", "Matemática",
				"Sociedade, Tecnologia e Inovação" };
		String[] disciplinasSegundoSemestre = { "-- selecione uma disciplina --", "Comportamento Organizacional",
				"Economia", "Estatística Aplicada a Gestão", "Gestão Ambiental", "Inglês II",
				"Métodos Para a Produção do Conhecimento", "Sociologia das Organizações" };
		String[] disciplinasTerceiroSemestre = { "-- selecione uma disciplina --", "Gestão de Marketing",
				"Gestão de Pessoas", "Inglês III", "Matemática Financeira", "Organização, Sistemas e Métodos",
				"Sistemas de Informação" };
		String[] disciplinasQuartoSemestre = { "-- selecione uma disciplina --", "Comunicação Empresarial Geral",
				"Direito Empresarial", "Gestão Financeira", "Inglês IV", "Logística", "Planejamento de Marketing" };
		String[] disciplinasQuintoSemestre = { "-- selecione uma disciplina --", "Análise de Investimentos",
				"Espanhol I", "Fundamentos de Gestão de Qualidade", "Gestão da Produção",
				"Gestão de Projetos Empresariais", "Inglês V" };
		String[] disciplinasSextoSemestre = { "-- selecione uma disciplina --", "Desenvolvimento de Negócios",
				"Espanhol II", "Inglês VI", "Negócios Internacionais", "Planejamento e Gestão Estratégica",
				"Sistemas Integrados de Gestão" };

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 60, 100, 150, 0 };
		gridBagLayout.rowHeights = new int[] { 30, 100, 30, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		BtnSair btnSair = new BtnSair("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.ipady = 10;
		gbc_btnSair.ipadx = 10;
		gbc_btnSair.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSair.insets = new Insets(0, 0, 5, 0);
		gbc_btnSair.gridx = 3;
		gbc_btnSair.gridy = 0;
		add(btnSair, gbc_btnSair);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.ipadx = 10;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		panel.setLayout(gbl_panel);

		JLabel lblBemVindo = new JLabel("Bem-vindo(a)!");
		lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblBemVindo = new GridBagConstraints();
		gbc_lblBemVindo.anchor = GridBagConstraints.EAST;
		gbc_lblBemVindo.insets = new Insets(0, 0, 5, 0);
		gbc_lblBemVindo.gridx = 0;
		gbc_lblBemVindo.gridy = 0;
		panel.add(lblBemVindo, gbc_lblBemVindo);

		JPanel containerSelecionarAvaliacao = new JPanel();
		containerSelecionarAvaliacao.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_containerSelecionarAvaliacao = new GridBagConstraints();
		gbc_containerSelecionarAvaliacao.insets = new Insets(0, 0, 5, 5);
		gbc_containerSelecionarAvaliacao.fill = GridBagConstraints.BOTH;
		gbc_containerSelecionarAvaliacao.gridx = 2;
		gbc_containerSelecionarAvaliacao.gridy = 1;
		add(containerSelecionarAvaliacao, gbc_containerSelecionarAvaliacao);
		GridBagLayout gbl_containerSelecionarAvaliacao = new GridBagLayout();
		gbl_containerSelecionarAvaliacao.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0 };
		gbl_containerSelecionarAvaliacao.columnWidths = new int[] { 10, 0, 0, 0 };
		containerSelecionarAvaliacao.setLayout(gbl_containerSelecionarAvaliacao);

		JComboBox<String> cbDisciplina = new JComboBox<String>(disciplinas);
		cbDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbDisciplina.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					PainelFolhaDeRespostas p = new PainelFolhaDeRespostas();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				}
			}
		});

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 6;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		containerSelecionarAvaliacao.add(separator, gbc_separator);

		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblSemestre = new GridBagConstraints();
		gbc_lblSemestre.gridwidth = 3;
		gbc_lblSemestre.insets = new Insets(0, 0, 5, 0);
		gbc_lblSemestre.anchor = GridBagConstraints.WEST;
		gbc_lblSemestre.gridx = 1;
		gbc_lblSemestre.gridy = 0;
		containerSelecionarAvaliacao.add(lblSemestre, gbc_lblSemestre);

		JLabel lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDisciplina = new GridBagConstraints();
		gbc_lblDisciplina.gridwidth = 3;
		gbc_lblDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_lblDisciplina.anchor = GridBagConstraints.WEST;
		gbc_lblDisciplina.gridx = 1;
		gbc_lblDisciplina.gridy = 2;
		containerSelecionarAvaliacao.add(lblDisciplina, gbc_lblDisciplina);
		GridBagConstraints gbc_cbDisciplina = new GridBagConstraints();
		gbc_cbDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_cbDisciplina.gridwidth = 3;
		gbc_cbDisciplina.fill = GridBagConstraints.BOTH;
		gbc_cbDisciplina.gridx = 1;
		gbc_cbDisciplina.gridy = 3;
		containerSelecionarAvaliacao.add(cbDisciplina, gbc_cbDisciplina);

		JComboBox<String> cbSemestre = new JComboBox<String>(semestres);
		cbSemestre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbSemestre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbSemestre.getSelectedItem() == "1° SEM") {
					cbDisciplina.removeAllItems();
					for (int i = 0; i < disciplinasPrimeiroSemestre.length; i++) {
						cbDisciplina.addItem(disciplinasPrimeiroSemestre[i]);
					}
				} else if (cbSemestre.getSelectedItem() == "2° SEM") {
					cbDisciplina.removeAllItems();
					for (int i = 0; i < disciplinasSegundoSemestre.length; i++) {
						cbDisciplina.addItem(disciplinasSegundoSemestre[i]);
					}
				} else if (cbSemestre.getSelectedItem() == "3° SEM") {
					cbDisciplina.removeAllItems();
					for (int i = 0; i < disciplinasTerceiroSemestre.length; i++) {
						cbDisciplina.addItem(disciplinasTerceiroSemestre[i]);
					}
				} else if (cbSemestre.getSelectedItem() == "4° SEM") {
					cbDisciplina.removeAllItems();
					for (int i = 0; i < disciplinasQuartoSemestre.length; i++) {
						cbDisciplina.addItem(disciplinasQuartoSemestre[i]);
					}
				} else if (cbSemestre.getSelectedItem() == "5° SEM") {
					cbDisciplina.removeAllItems();
					for (int i = 0; i < disciplinasQuintoSemestre.length; i++) {
						cbDisciplina.addItem(disciplinasQuintoSemestre[i]);
					}
				} else if (cbSemestre.getSelectedItem() == "6° SEM") {
					cbDisciplina.removeAllItems();
					for (int i = 0; i < disciplinasSextoSemestre.length; i++) {
						cbDisciplina.addItem(disciplinasSextoSemestre[i]);
					}
				} else {
					cbDisciplina.removeAllItems();
					cbDisciplina.addItem(disciplinas[0]);
				}
			}
		});
		GridBagConstraints gbc_cbSemestre = new GridBagConstraints();
		gbc_cbSemestre.insets = new Insets(0, 0, 5, 0);
		gbc_cbSemestre.gridwidth = 3;
		gbc_cbSemestre.fill = GridBagConstraints.BOTH;
		gbc_cbSemestre.gridx = 1;
		gbc_cbSemestre.gridy = 1;
		containerSelecionarAvaliacao.add(cbSemestre, gbc_cbSemestre);

		JButton btnRealizarAvaliacao = new JButton("Realizar Avaliação");
		btnRealizarAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (cbDisciplina.getSelectedItem().toString() != "-- selecione uma disciplina --") {
					PainelFolhaDeRespostas p = new PainelFolhaDeRespostas();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				} else {
					JOptionPane.showMessageDialog(null, "Por favor, selecione uma disciplina.");
				}
			}
		});
		GridBagConstraints gbc_btnRealizarAvaliacao = new GridBagConstraints();
		gbc_btnRealizarAvaliacao.gridwidth = 3;
		gbc_btnRealizarAvaliacao.gridx = 1;
		gbc_btnRealizarAvaliacao.gridy = 5;
		containerSelecionarAvaliacao.add(btnRealizarAvaliacao, gbc_btnRealizarAvaliacao);
	}

}
