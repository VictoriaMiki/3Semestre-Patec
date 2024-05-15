package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
		gridBagLayout.columnWidths = new int[] { 60, 200, 60, 0 };
		gridBagLayout.rowHeights = new int[] { 30, 100, 30, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

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
		gbc_btnSair.gridx = 2;
		gbc_btnSair.gridy = 0;
		add(btnSair, gbc_btnSair);

		JPanel containerSelecionarAvaliacao = new JPanel();
		containerSelecionarAvaliacao.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_containerSelecionarAvaliacao = new GridBagConstraints();
		gbc_containerSelecionarAvaliacao.insets = new Insets(0, 0, 5, 5);
		gbc_containerSelecionarAvaliacao.fill = GridBagConstraints.BOTH;
		gbc_containerSelecionarAvaliacao.gridx = 1;
		gbc_containerSelecionarAvaliacao.gridy = 1;
		add(containerSelecionarAvaliacao, gbc_containerSelecionarAvaliacao);
		GridBagLayout gbl_containerSelecionarAvaliacao = new GridBagLayout();
		gbl_containerSelecionarAvaliacao.columnWidths = new int[] { 0, 50, 80, 80, 80 };
		containerSelecionarAvaliacao.setLayout(gbl_containerSelecionarAvaliacao);

		JLabel lblSelecione = new JLabel("Selecione:");
		GridBagConstraints gbc_lblSelecione = new GridBagConstraints();
		gbc_lblSelecione.gridwidth = 3;
		gbc_lblSelecione.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelecione.gridx = 2;
		gbc_lblSelecione.gridy = 1;
		containerSelecionarAvaliacao.add(lblSelecione, gbc_lblSelecione);

		JLabel lblSemestre = new JLabel("Semestre:");
		GridBagConstraints gbc_lblSemestre = new GridBagConstraints();
		gbc_lblSemestre.insets = new Insets(0, 0, 5, 5);
		gbc_lblSemestre.anchor = GridBagConstraints.EAST;
		gbc_lblSemestre.gridx = 1;
		gbc_lblSemestre.gridy = 2;
		containerSelecionarAvaliacao.add(lblSemestre, gbc_lblSemestre);

		JComboBox<String> cbDisciplina = new JComboBox<String>(disciplinas);
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
		GridBagConstraints gbc_cbDisciplina = new GridBagConstraints();
		gbc_cbDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_cbDisciplina.gridwidth = 3;
		gbc_cbDisciplina.fill = GridBagConstraints.BOTH;
		gbc_cbDisciplina.gridx = 2;
		gbc_cbDisciplina.gridy = 3;
		containerSelecionarAvaliacao.add(cbDisciplina, gbc_cbDisciplina);

		JComboBox<String> cbSemestre = new JComboBox<String>(semestres);
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
		gbc_cbSemestre.gridx = 2;
		gbc_cbSemestre.gridy = 2;
		containerSelecionarAvaliacao.add(cbSemestre, gbc_cbSemestre);

		JLabel lblDisciplina = new JLabel("Disciplina:");
		GridBagConstraints gbc_lblDisciplina = new GridBagConstraints();
		gbc_lblDisciplina.insets = new Insets(0, 0, 5, 5);
		gbc_lblDisciplina.anchor = GridBagConstraints.EAST;
		gbc_lblDisciplina.gridx = 1;
		gbc_lblDisciplina.gridy = 3;
		containerSelecionarAvaliacao.add(lblDisciplina, gbc_lblDisciplina);

		JButton btnRealizarAvaliacao = new JButton("Realizar Avaliação");
		btnRealizarAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelFolhaDeRespostas p = new PainelFolhaDeRespostas();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		GridBagConstraints gbc_btnRealizarAvaliacao = new GridBagConstraints();
		gbc_btnRealizarAvaliacao.gridwidth = 3;
		gbc_btnRealizarAvaliacao.insets = new Insets(0, 0, 0, 5);
		gbc_btnRealizarAvaliacao.gridx = 2;
		gbc_btnRealizarAvaliacao.gridy = 4;
		containerSelecionarAvaliacao.add(btnRealizarAvaliacao, gbc_btnRealizarAvaliacao);
	}

}
