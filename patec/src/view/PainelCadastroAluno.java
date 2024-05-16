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
		gridBagLayout.columnWidths = new int[] { 66, 0, 100, 150, 0, 66, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 230, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JMenuBar menuBarCoord = new JMenuBar();
		GridBagConstraints gbc_menuBarCoord = new GridBagConstraints();
		gbc_menuBarCoord.gridwidth = 6;
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
		gbc_btnSair.gridx = 5;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.ipadx = 10;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBackground(new Color(128, 255, 255));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Aluno");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JPanel containerCadastroAluno = new JPanel();
		containerCadastroAluno.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_containerCadastroAluno = new GridBagConstraints();
		gbc_containerCadastroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_containerCadastroAluno.fill = GridBagConstraints.BOTH;
		gbc_containerCadastroAluno.gridx = 3;
		gbc_containerCadastroAluno.gridy = 2;
		add(containerCadastroAluno, gbc_containerCadastroAluno);
		GridBagLayout gbl_containerCadastroAluno = new GridBagLayout();
		gbl_containerCadastroAluno.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_containerCadastroAluno.columnWidths = new int[] { 0, 5, 0, 0, 0, 0 };
		containerCadastroAluno.setLayout(gbl_containerCadastroAluno);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 10;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		containerCadastroAluno.add(separator, gbc_separator);

		JLabel lblNomeAluno = new JLabel("Nome:");
		lblNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNomeAluno = new GridBagConstraints();
		gbc_lblNomeAluno.gridwidth = 2;
		gbc_lblNomeAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeAluno.anchor = GridBagConstraints.WEST;
		gbc_lblNomeAluno.gridx = 1;
		gbc_lblNomeAluno.gridy = 0;
		containerCadastroAluno.add(lblNomeAluno, gbc_lblNomeAluno);

		tfNomeAluno = new JTextField();
		tfNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tfNomeAluno = new GridBagConstraints();
		gbc_tfNomeAluno.fill = GridBagConstraints.BOTH;
		gbc_tfNomeAluno.gridwidth = 5;
		gbc_tfNomeAluno.insets = new Insets(0, 0, 5, 0);
		gbc_tfNomeAluno.gridx = 1;
		gbc_tfNomeAluno.gridy = 1;
		containerCadastroAluno.add(tfNomeAluno, gbc_tfNomeAluno);
		tfNomeAluno.setColumns(10);

		JLabel lblRegistroAluno = new JLabel("RA:");
		lblRegistroAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRegistroAluno = new GridBagConstraints();
		gbc_lblRegistroAluno.gridwidth = 2;
		gbc_lblRegistroAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistroAluno.anchor = GridBagConstraints.WEST;
		gbc_lblRegistroAluno.gridx = 1;
		gbc_lblRegistroAluno.gridy = 2;
		containerCadastroAluno.add(lblRegistroAluno, gbc_lblRegistroAluno);

		tfRegistroAluno = new JTextField();
		tfRegistroAluno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tfRegistroAluno = new GridBagConstraints();
		gbc_tfRegistroAluno.gridwidth = 5;
		gbc_tfRegistroAluno.insets = new Insets(0, 0, 5, 0);
		gbc_tfRegistroAluno.fill = GridBagConstraints.BOTH;
		gbc_tfRegistroAluno.gridx = 1;
		gbc_tfRegistroAluno.gridy = 3;
		containerCadastroAluno.add(tfRegistroAluno, gbc_tfRegistroAluno);
		tfRegistroAluno.setColumns(10);

		JLabel lblCpfAluno = new JLabel("CPF:");
		lblCpfAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCpfAluno = new GridBagConstraints();
		gbc_lblCpfAluno.gridwidth = 2;
		gbc_lblCpfAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpfAluno.anchor = GridBagConstraints.WEST;
		gbc_lblCpfAluno.gridx = 1;
		gbc_lblCpfAluno.gridy = 4;
		containerCadastroAluno.add(lblCpfAluno, gbc_lblCpfAluno);

		JFormattedTextField ftfCpfAluno = new JFormattedTextField();
		ftfCpfAluno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_ftfCpfAluno = new GridBagConstraints();
		gbc_ftfCpfAluno.gridwidth = 5;
		gbc_ftfCpfAluno.insets = new Insets(0, 0, 5, 0);
		gbc_ftfCpfAluno.fill = GridBagConstraints.BOTH;
		gbc_ftfCpfAluno.gridx = 1;
		gbc_ftfCpfAluno.gridy = 5;
		containerCadastroAluno.add(ftfCpfAluno, gbc_ftfCpfAluno);

		JLabel lblDataNascimentoAluno = new JLabel("Data de nasc.:");
		lblDataNascimentoAluno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDataNascimentoAluno = new GridBagConstraints();
		gbc_lblDataNascimentoAluno.gridwidth = 2;
		gbc_lblDataNascimentoAluno.anchor = GridBagConstraints.WEST;
		gbc_lblDataNascimentoAluno.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataNascimentoAluno.gridx = 1;
		gbc_lblDataNascimentoAluno.gridy = 6;
		containerCadastroAluno.add(lblDataNascimentoAluno, gbc_lblDataNascimentoAluno);

		JFormattedTextField tftDataNascimentoAluno = new JFormattedTextField();
		tftDataNascimentoAluno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tftDataNascimentoAluno = new GridBagConstraints();
		gbc_tftDataNascimentoAluno.gridwidth = 5;
		gbc_tftDataNascimentoAluno.insets = new Insets(0, 0, 5, 0);
		gbc_tftDataNascimentoAluno.fill = GridBagConstraints.BOTH;
		gbc_tftDataNascimentoAluno.gridx = 1;
		gbc_tftDataNascimentoAluno.gridy = 7;
		containerCadastroAluno.add(tftDataNascimentoAluno, gbc_tftDataNascimentoAluno);

		JButton btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.gridwidth = 5;
		gbc_btnCadastrar.gridx = 1;
		gbc_btnCadastrar.gridy = 9;
		containerCadastroAluno.add(btnCadastrar, gbc_btnCadastrar);
	}

}
