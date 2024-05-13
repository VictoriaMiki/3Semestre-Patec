package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PainelLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel loginContainer;
	private JTextField tfUsuario;
	private JTextField tfSenha;

	/**
	 * Create the panel.
	 */
	public PainelLogin() {
		setBackground(new Color(255, 255, 255));
		GridBagLayout gridBagLayout = new GridBagLayout();

		setLayout(gridBagLayout);

		loginContainer = new JPanel();
		GridBagConstraints gbc_loginContainer = new GridBagConstraints();
		gbc_loginContainer.fill = GridBagConstraints.BOTH;
		gbc_loginContainer.gridx = 1;
		gbc_loginContainer.gridy = 1;
		add(loginContainer, gbc_loginContainer);
		GridBagLayout gbl_loginContainer = new GridBagLayout();
		gbl_loginContainer.columnWidths = new int[] { 0, 2, 106, 0, 0 };
		gbl_loginContainer.rowHeights = new int[] { 0, 12, 20, 20, 23, 0, 0 };
		gbl_loginContainer.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_loginContainer.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		loginContainer.setLayout(gbl_loginContainer);

		JLabel lblLogin = new JLabel("Log-in");
		GridBagConstraints gbc_lblLogin = new GridBagConstraints();
		gbc_lblLogin.anchor = GridBagConstraints.SOUTH;
		gbc_lblLogin.insets = new Insets(0, 0, 5, 5);
		gbc_lblLogin.gridx = 2;
		gbc_lblLogin.gridy = 1;
		loginContainer.add(lblLogin, gbc_lblLogin);

		JLabel lblUsuario = new JLabel("Usuário:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 2;
		loginContainer.add(lblUsuario, gbc_lblUsuario);

		tfUsuario = new JTextField();
		GridBagConstraints gbc_tfUsuario = new GridBagConstraints();
		gbc_tfUsuario.fill = GridBagConstraints.BOTH;
		gbc_tfUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_tfUsuario.gridx = 2;
		gbc_tfUsuario.gridy = 2;
		loginContainer.add(tfUsuario, gbc_tfUsuario);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfUsuario.getText().contentEquals("coordenador") && !(tfSenha.getText().isBlank())) {
					PainelMenuCoordenador p = new PainelMenuCoordenador();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				} else if (tfUsuario.getText().contentEquals("aluno") && !(tfSenha.getText().isBlank())) {
					PainelMenuAluno p = new PainelMenuAluno();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				}
			}
		});

		JLabel lblSenha = new JLabel("Senha:");
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.fill = GridBagConstraints.VERTICAL;
		gbc_lblSenha.anchor = GridBagConstraints.EAST;
		gbc_lblSenha.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenha.gridx = 1;
		gbc_lblSenha.gridy = 3;
		loginContainer.add(lblSenha, gbc_lblSenha);

		tfSenha = new JTextField();
		GridBagConstraints gbc_tfSenha = new GridBagConstraints();
		gbc_tfSenha.fill = GridBagConstraints.BOTH;
		gbc_tfSenha.insets = new Insets(0, 0, 5, 5);
		gbc_tfSenha.gridx = 2;
		gbc_tfSenha.gridy = 3;
		loginContainer.add(tfSenha, gbc_tfSenha);

		GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
		gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEntrar.anchor = GridBagConstraints.NORTH;
		gbc_btnEntrar.gridx = 2;
		gbc_btnEntrar.gridy = 4;
		loginContainer.add(btnEntrar, gbc_btnEntrar);

	}
}
