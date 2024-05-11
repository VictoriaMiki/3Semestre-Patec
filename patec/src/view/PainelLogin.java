package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;

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
		
		JLabel lblUsuario = new JLabel("New label");
		
		JLabel lblSenha = new JLabel("New label");
		
		JLabel lblLogin = new JLabel("New label");
		
		tfUsuario = new JTextField();
		
		tfSenha = new JTextField();
		
		JButton btnEntrar = new JButton("New button");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelMenuAluno p = new PainelMenuAluno();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		
		GroupLayout gl_loginContainer = new GroupLayout(loginContainer);
		gl_loginContainer.setHorizontalGroup(
			gl_loginContainer.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_loginContainer.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addGroup(gl_loginContainer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginContainer.createSequentialGroup()
							.addGap(80)
							.addComponent(lblLogin))
						.addGroup(gl_loginContainer.createSequentialGroup()
							.addComponent(lblUsuario)
							.addGap(4)
							.addComponent(tfUsuario, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_loginContainer.createSequentialGroup()
							.addComponent(lblSenha)
							.addGap(4)
							.addComponent(tfSenha, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_loginContainer.createSequentialGroup()
							.addGap(58)
							.addComponent(btnEntrar)))
					.addGap(24))
		);
		
		gl_loginContainer.setVerticalGroup(
			gl_loginContainer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginContainer.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLogin)
					.addGap(6)
					.addGroup(gl_loginContainer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginContainer.createSequentialGroup()
							.addGap(3)
							.addComponent(lblUsuario))
						.addComponent(tfUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_loginContainer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginContainer.createSequentialGroup()
							.addGap(3)
							.addComponent(lblSenha))
						.addComponent(tfSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addComponent(btnEntrar)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		
		loginContainer.setLayout(gl_loginContainer);
		GridBagConstraints gbc_loginContainer = new GridBagConstraints();
		gbc_loginContainer.anchor = GridBagConstraints.NORTH;
		gbc_loginContainer.fill = GridBagConstraints.HORIZONTAL;
		gbc_loginContainer.gridx = 1;
		gbc_loginContainer.gridy = 1;
		add(loginContainer, gbc_loginContainer);

	}
}
