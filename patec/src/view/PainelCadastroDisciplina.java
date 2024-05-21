package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PainelCadastroDisciplina extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PainelCadastroDisciplina() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 66, 0, 100, 150, 0, 66, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 272, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		KeyStroke ksCadGabarito = KeyStroke.getKeyStroke(KeyEvent.VK_G,
				KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		KeyStroke ksCadAluno = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		KeyStroke ksCadDisciplina = KeyStroke.getKeyStroke(KeyEvent.VK_D,
				KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		/*
		 * miRelatorioDisciplina.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { PainelRelatorioDisciplina p = new
		 * PainelRelatorioDisciplina(); FramePatec.frame.setContentPane(p);
		 * FramePatec.frame.revalidate(); FramePatec.frame.repaint(); } });
		 */
		KeyStroke ksRelatorioDisciplina = KeyStroke.getKeyStroke(KeyEvent.VK_D,
				KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		/*
		 * miRelatorioAluno.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { PainelRelatorioAluno p = new
		 * PainelRelatorioAluno(); FramePatec.frame.setContentPane(p);
		 * FramePatec.frame.revalidate(); FramePatec.frame.repaint(); } });
		 */
		KeyStroke ksRelatorioAluno = KeyStroke.getKeyStroke(KeyEvent.VK_A,
				KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);

		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelLogin p = new PainelLogin();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});

		JButton btnVoltar = new JButton("Voltar\r\n");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelMenuCoordenador p = new PainelMenuCoordenador();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});

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
		miCadDisciplina.setAccelerator(ksCadDisciplina);
		mnCadastro.add(miCadDisciplina);

		JMenu mnRelatorio = new JMenu("Relatório");
		mnRelatorio.setMnemonic(KeyEvent.VK_R);
		menuBarCoord.add(mnRelatorio);

		JMenuItem miRelatorioDisciplina = new JMenuItem("Por Disciplina");
		miRelatorioDisciplina.setAccelerator(ksRelatorioDisciplina);
		mnRelatorio.add(miRelatorioDisciplina);

		JMenuItem miRelatorioAluno = new JMenuItem("Por Aluno");
		miRelatorioAluno.setAccelerator(ksRelatorioAluno);
		mnRelatorio.add(miRelatorioAluno);
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 1;
		add(btnVoltar, gbc_btnVoltar);
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 5, 0);
		gbc_btnSair.gridx = 5;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.ipadx = 10;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 2;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0 };
		panel_1.setLayout(gbl_panel_1);

		JLabel lblNewLabel_3 = new JLabel("Cadastrar");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 0;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Disciplina");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 1;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 10, 0, 0, 0, 10 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 8;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		panel.add(separator, gbc_separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));

		JLabel lblNewLabel = new JLabel("Código da disciplina:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nome da disciplina:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Semestre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 4;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 5;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		JButton btnNewButton_3 = new JButton("Cadastrar");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.gridwidth = 4;
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 7;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
	}

}
