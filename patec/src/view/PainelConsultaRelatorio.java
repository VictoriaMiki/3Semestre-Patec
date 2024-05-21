package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PainelConsultaRelatorio extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PainelConsultaRelatorio() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 450, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 272, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JMenuBar menuBarCoord = new JMenuBar();
		GridBagConstraints gbc_menuBarCoord = new GridBagConstraints();
		gbc_menuBarCoord.gridwidth = 3;
		gbc_menuBarCoord.anchor = GridBagConstraints.NORTH;
		gbc_menuBarCoord.fill = GridBagConstraints.HORIZONTAL;
		gbc_menuBarCoord.insets = new Insets(0, 0, 5, 0);
		gbc_menuBarCoord.gridx = 0;
		gbc_menuBarCoord.gridy = 0;
		add(menuBarCoord, gbc_menuBarCoord);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBarCoord.add(mnCadastro);

		JMenuItem miCadGabarito = new JMenuItem("Gabarito");
		miCadGabarito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelCadastroGabarito p = new PainelCadastroGabarito();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		mnCadastro.add(miCadGabarito);

		JMenuItem miCadAluno = new JMenuItem("Aluno");
		miCadAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelCadastroAluno p = new PainelCadastroAluno();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		mnCadastro.add(miCadAluno);

		JMenuItem miCadDisciplina = new JMenuItem("Disciplina");
		miCadDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelCadastroDisciplina p = new PainelCadastroDisciplina();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		mnCadastro.add(miCadDisciplina);

		JMenu mnRelatorio = new JMenu("Relatório");
		menuBarCoord.add(mnRelatorio);

		JMenuItem miRelatorioDisciplina = new JMenuItem("Por Disciplina");
		/*
		 * miRelatorioDisciplina.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { PainelRelatorioDisciplina p = new
		 * PainelRelatorioDisciplina(); FramePatec.frame.setContentPane(p);
		 * FramePatec.frame.revalidate(); FramePatec.frame.repaint(); } });
		 */
		mnRelatorio.add(miRelatorioDisciplina);

		JMenuItem miRelatorioAluno = new JMenuItem("Por Aluno");
		/*
		 * miRelatorioAluno.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { PainelRelatorioAluno p = new
		 * PainelRelatorioAluno(); FramePatec.frame.setContentPane(p);
		 * FramePatec.frame.revalidate(); FramePatec.frame.repaint(); } });
		 */
		mnRelatorio.add(miRelatorioAluno);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelLogin p = new PainelLogin();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});

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
		gbc_btnVoltar.anchor = GridBagConstraints.NORTH;
		gbc_btnVoltar.insets = new Insets(0, 0, 0, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 1;
		add(btnVoltar, gbc_btnVoltar);
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSair.gridx = 2;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);
	}

}
