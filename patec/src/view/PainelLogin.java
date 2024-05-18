package view;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class PainelLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel loginContainer;
	private JTextField tfUsuario;
	private JPasswordField pfSenha;

	/**
	 * Create the panel.
	 */
	public PainelLogin() {
		setBackground(new Color(240, 240, 240));
		GridBagLayout gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.ipadx = 10;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.rowWeights = new double[] { 0.0 };
		panel.setLayout(gbl_panel);

		JLabel lblLogin = new JLabel("Log-in");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.gridx = 0;
		gbc_lblLogin.gridy = 0;
		panel.add(lblLogin, gbc_lblLogin);

		loginContainer = new JPanel();
		loginContainer.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_loginContainer = new GridBagConstraints();
		gbc_loginContainer.fill = GridBagConstraints.BOTH;
		gbc_loginContainer.gridx = 2;
		gbc_loginContainer.gridy = 0;
		add(loginContainer, gbc_loginContainer);

		GridBagLayout gbl_loginContainer = new GridBagLayout();
		gbl_loginContainer.columnWidths = new int[] { 10, 150, 30, 30, 30, 0 };
		gbl_loginContainer.rowHeights = new int[] { 0, 20, 0, 20, 23, 0, 0 };
		gbl_loginContainer.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_loginContainer.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		loginContainer.setLayout(gbl_loginContainer);

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 6;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		loginContainer.add(separator, gbc_separator);

		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.gridwidth = 4;
		gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 0;
		loginContainer.add(lblUsuario, gbc_lblUsuario);

		JLabel lblErroUsuarioSenha = new JLabel("Usuário e/ou senha inválido(s).");
		lblErroUsuarioSenha.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_lblErroUsuarioSenha = new GridBagConstraints();
		gbc_lblErroUsuarioSenha.anchor = GridBagConstraints.WEST;
		gbc_lblErroUsuarioSenha.gridwidth = 4;
		gbc_lblErroUsuarioSenha.insets = new Insets(0, 0, 5, 5);
		gbc_lblErroUsuarioSenha.gridx = 1;
		gbc_lblErroUsuarioSenha.gridy = 4;
		loginContainer.add(lblErroUsuarioSenha, gbc_lblErroUsuarioSenha);
		lblErroUsuarioSenha.setVisible(false);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.gridwidth = 4;
		gbc_lblSenha.fill = GridBagConstraints.VERTICAL;
		gbc_lblSenha.anchor = GridBagConstraints.WEST;
		gbc_lblSenha.insets = new Insets(0, 0, 5, 0);
		gbc_lblSenha.gridx = 1;
		gbc_lblSenha.gridy = 2;
		loginContainer.add(lblSenha, gbc_lblSenha);

		tfUsuario = new JTextField();
		tfUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblErroUsuarioSenha.setVisible(false);
			}
		});
		tfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tfUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					char[] senha = pfSenha.getPassword();

					if (tfUsuario.getText().contentEquals("coordenador") && senhaValida(false, senha)) {
						Arrays.fill(senha, '0');
						PainelMenuCoordenador p = new PainelMenuCoordenador();
						FramePatec.frame.setContentPane(p);
						FramePatec.frame.revalidate();
						FramePatec.frame.repaint();
					} else if (tfUsuario.getText().contentEquals("aluno") && senhaValida(true, senha)) {
						Arrays.fill(senha, '0');
						PainelMenuAluno p = new PainelMenuAluno();
						FramePatec.frame.setContentPane(p);
						FramePatec.frame.revalidate();
						FramePatec.frame.repaint();
					} else {
						lblErroUsuarioSenha.setVisible(true);
					}
				}
			}
		});
		GridBagConstraints gbc_tfUsuario = new GridBagConstraints();
		gbc_tfUsuario.gridwidth = 4;
		gbc_tfUsuario.fill = GridBagConstraints.BOTH;
		gbc_tfUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_tfUsuario.gridx = 1;
		gbc_tfUsuario.gridy = 1;
		loginContainer.add(tfUsuario, gbc_tfUsuario);

		pfSenha = new JPasswordField();
		pfSenha.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblErroUsuarioSenha.setVisible(false);
			}
		});
		pfSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pfSenha.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					char[] senha = pfSenha.getPassword();

					if (tfUsuario.getText().contentEquals("coordenador") && senhaValida(false, senha)) {
						Arrays.fill(senha, '0');
						PainelMenuCoordenador p = new PainelMenuCoordenador();
						FramePatec.frame.setContentPane(p);
						FramePatec.frame.revalidate();
						FramePatec.frame.repaint();
					} else if (tfUsuario.getText().contentEquals("aluno") && senhaValida(true, senha)) {
						Arrays.fill(senha, '0');
						PainelMenuAluno p = new PainelMenuAluno();
						FramePatec.frame.setContentPane(p);
						FramePatec.frame.revalidate();
						FramePatec.frame.repaint();
					} else {
						lblErroUsuarioSenha.setVisible(true);
					}
				}
			}
		});
		GridBagConstraints gbc_pfSenha = new GridBagConstraints();
		gbc_pfSenha.gridwidth = 4;
		gbc_pfSenha.fill = GridBagConstraints.BOTH;
		gbc_pfSenha.insets = new Insets(0, 0, 5, 0);
		gbc_pfSenha.gridx = 1;
		gbc_pfSenha.gridy = 3;
		loginContainer.add(pfSenha, gbc_pfSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] senha = pfSenha.getPassword();

				if (tfUsuario.getText().contentEquals("coordenador") && senhaValida(false, senha)) {
					Arrays.fill(senha, '0');
					PainelMenuCoordenador p = new PainelMenuCoordenador();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				} else if (tfUsuario.getText().contentEquals("aluno") && senhaValida(true, senha)) {
					Arrays.fill(senha, '0');
					PainelMenuAluno p = new PainelMenuAluno();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				} else {
					lblErroUsuarioSenha.setVisible(false);
				}

			}
		});
		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.gridwidth = 4;
		gbc_btnEntrar.anchor = GridBagConstraints.NORTH;
		gbc_btnEntrar.gridx = 1;
		gbc_btnEntrar.gridy = 5;
		loginContainer.add(btnEntrar, gbc_btnEntrar);

	}

	private static boolean senhaValida(boolean isAluno, char[] input) {
		boolean correto = true;
		char[] senhaCoord = { 'a', 'd', 'm', 'i', 'n' };
		char[] senhaAluno = { 'a', 'l', 'u', 'n', 'o' };

		if (isAluno == false) {
			if (input.length != senhaCoord.length) {
				correto = false;
			} else {
				correto = Arrays.equals(input, senhaCoord);
			}
		} else {
			if (input.length != senhaAluno.length) {
				correto = false;
			} else {
				correto = Arrays.equals(input, senhaAluno);
			}
		}

		Arrays.fill(senhaCoord, '0');
		Arrays.fill(senhaAluno, '0');

		return correto;
	}
}
