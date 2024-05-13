package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PainelCadastroAluno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNomeAluno;
	private JTextField tfRegistroAluno;

	/**
	 * Create the panel.
	 */
	public PainelCadastroAluno() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 66, 257, 66, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 36, 230, 22, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
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
		mnCadastro.setMnemonic(KeyEvent.VK_C);
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
		KeyStroke ksCadGabarito = KeyStroke.getKeyStroke(KeyEvent.VK_G,
				KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miCadGabarito.setAccelerator(ksCadGabarito);
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
		KeyStroke ksCadAluno = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miCadAluno.setAccelerator(ksCadAluno);
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
		KeyStroke ksCadDisciplina = KeyStroke.getKeyStroke(KeyEvent.VK_D,
				KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miCadDisciplina.setAccelerator(ksCadDisciplina);
		mnCadastro.add(miCadDisciplina);

		JMenu mnRelatorio = new JMenu("Relatório");
		mnRelatorio.setMnemonic(KeyEvent.VK_R);
		menuBarCoord.add(mnRelatorio);

		JMenuItem miRelatorioDisciplina = new JMenuItem("Por Disciplina");
		/*
		 * miRelatorioDisciplina.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { PainelRelatorioDisciplina p = new
		 * PainelRelatorioDisciplina(); FramePatec.frame.setContentPane(p);
		 * FramePatec.frame.revalidate(); FramePatec.frame.repaint(); } });
		 */
		KeyStroke ksRelatorioDisciplina = KeyStroke.getKeyStroke(KeyEvent.VK_D,
				KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miRelatorioDisciplina.setAccelerator(ksRelatorioDisciplina);
		mnRelatorio.add(miRelatorioDisciplina);

		JMenuItem miRelatorioAluno = new JMenuItem("Por Aluno");
		/*
		 * miRelatorioAluno.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { PainelRelatorioAluno p = new
		 * PainelRelatorioAluno(); FramePatec.frame.setContentPane(p);
		 * FramePatec.frame.revalidate(); FramePatec.frame.repaint(); } });
		 */
		KeyStroke ksRelatorioAluno = KeyStroke.getKeyStroke(KeyEvent.VK_A,
				KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miRelatorioAluno.setAccelerator(ksRelatorioAluno);
		mnRelatorio.add(miRelatorioAluno);

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
		gbc_btnSair.anchor = GridBagConstraints.NORTH;
		gbc_btnSair.gridx = 2;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JPanel containerCadastroAluno = new JPanel();
		containerCadastroAluno.setBackground(new Color(0, 255, 0));
		GridBagConstraints gbc_containerCadastroAluno = new GridBagConstraints();
		gbc_containerCadastroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_containerCadastroAluno.fill = GridBagConstraints.BOTH;
		gbc_containerCadastroAluno.gridx = 1;
		gbc_containerCadastroAluno.gridy = 2;
		add(containerCadastroAluno, gbc_containerCadastroAluno);
		GridBagLayout gbl_containerCadastroAluno = new GridBagLayout();
		gbl_containerCadastroAluno.columnWidths = new int[] { 0, 0, 63, 54, 44, 61, 0, 0, 0 };
		gbl_containerCadastroAluno.rowHeights = new int[] { 0, 40, 40, 40, 40, 0, 0, 0, 0 };
		gbl_containerCadastroAluno.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_containerCadastroAluno.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		containerCadastroAluno.setLayout(gbl_containerCadastroAluno);

		JLabel lblNomeAluno = new JLabel("Nome:");
		GridBagConstraints gbc_lblNomeAluno = new GridBagConstraints();
		gbc_lblNomeAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeAluno.anchor = GridBagConstraints.EAST;
		gbc_lblNomeAluno.gridx = 2;
		gbc_lblNomeAluno.gridy = 1;
		containerCadastroAluno.add(lblNomeAluno, gbc_lblNomeAluno);

		tfNomeAluno = new JTextField();
		GridBagConstraints gbc_tfNomeAluno = new GridBagConstraints();
		gbc_tfNomeAluno.fill = GridBagConstraints.BOTH;
		gbc_tfNomeAluno.gridwidth = 4;
		gbc_tfNomeAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfNomeAluno.gridx = 3;
		gbc_tfNomeAluno.gridy = 1;
		containerCadastroAluno.add(tfNomeAluno, gbc_tfNomeAluno);
		tfNomeAluno.setColumns(10);

		JLabel lblRegistroAluno = new JLabel("RA:");
		GridBagConstraints gbc_lblRegistroAluno = new GridBagConstraints();
		gbc_lblRegistroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistroAluno.anchor = GridBagConstraints.EAST;
		gbc_lblRegistroAluno.gridx = 2;
		gbc_lblRegistroAluno.gridy = 2;
		containerCadastroAluno.add(lblRegistroAluno, gbc_lblRegistroAluno);

		tfRegistroAluno = new JTextField();
		GridBagConstraints gbc_tfRegistroAluno = new GridBagConstraints();
		gbc_tfRegistroAluno.gridwidth = 4;
		gbc_tfRegistroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tfRegistroAluno.fill = GridBagConstraints.BOTH;
		gbc_tfRegistroAluno.gridx = 3;
		gbc_tfRegistroAluno.gridy = 2;
		containerCadastroAluno.add(tfRegistroAluno, gbc_tfRegistroAluno);
		tfRegistroAluno.setColumns(10);

		JLabel lblCpfAluno = new JLabel("CPF:");
		GridBagConstraints gbc_lblCpfAluno = new GridBagConstraints();
		gbc_lblCpfAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpfAluno.anchor = GridBagConstraints.EAST;
		gbc_lblCpfAluno.gridx = 2;
		gbc_lblCpfAluno.gridy = 3;
		containerCadastroAluno.add(lblCpfAluno, gbc_lblCpfAluno);

		JFormattedTextField ftfCpfAluno = new JFormattedTextField();
		GridBagConstraints gbc_ftfCpfAluno = new GridBagConstraints();
		gbc_ftfCpfAluno.gridwidth = 4;
		gbc_ftfCpfAluno.insets = new Insets(0, 0, 5, 5);
		gbc_ftfCpfAluno.fill = GridBagConstraints.BOTH;
		gbc_ftfCpfAluno.gridx = 3;
		gbc_ftfCpfAluno.gridy = 3;
		containerCadastroAluno.add(ftfCpfAluno, gbc_ftfCpfAluno);

		JLabel lblDataNascimentoAluno = new JLabel("Data de nasc.:");
		GridBagConstraints gbc_lblDataNascimentoAluno = new GridBagConstraints();
		gbc_lblDataNascimentoAluno.anchor = GridBagConstraints.EAST;
		gbc_lblDataNascimentoAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataNascimentoAluno.gridx = 2;
		gbc_lblDataNascimentoAluno.gridy = 4;
		containerCadastroAluno.add(lblDataNascimentoAluno, gbc_lblDataNascimentoAluno);

		JFormattedTextField tftDataNascimentoAluno = new JFormattedTextField();
		GridBagConstraints gbc_tftDataNascimentoAluno = new GridBagConstraints();
		gbc_tftDataNascimentoAluno.gridwidth = 4;
		gbc_tftDataNascimentoAluno.insets = new Insets(0, 0, 5, 5);
		gbc_tftDataNascimentoAluno.fill = GridBagConstraints.BOTH;
		gbc_tftDataNascimentoAluno.gridx = 3;
		gbc_tftDataNascimentoAluno.gridy = 4;
		containerCadastroAluno.add(tftDataNascimentoAluno, gbc_tftDataNascimentoAluno);

		JButton btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCadastrar.gridx = 3;
		gbc_btnCadastrar.gridy = 6;
		containerCadastroAluno.add(btnCadastrar, gbc_btnCadastrar);

		JButton btnListar = new JButton("Listar");
		GridBagConstraints gbc_btnListar = new GridBagConstraints();
		gbc_btnListar.insets = new Insets(0, 0, 5, 5);
		gbc_btnListar.gridx = 4;
		gbc_btnListar.gridy = 6;
		containerCadastroAluno.add(btnListar, gbc_btnListar);

		JButton btnAlterar = new JButton("Alterar");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAlterar.gridx = 5;
		gbc_btnAlterar.gridy = 6;
		containerCadastroAluno.add(btnAlterar, gbc_btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluir.gridx = 6;
		gbc_btnExcluir.gridy = 6;
		containerCadastroAluno.add(btnExcluir, gbc_btnExcluir);
	}

}
