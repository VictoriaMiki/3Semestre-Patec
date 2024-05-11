package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class PainelCadastroDisciplina extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PainelCadastroDisciplina() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{450, 0};
		gridBagLayout.rowHeights = new int[]{28, 272, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JMenuBar menuBarCoord = new JMenuBar();
		GridBagConstraints gbc_menuBarCoord = new GridBagConstraints();
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
		KeyStroke ksCadGabarito = KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
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
		KeyStroke ksCadDisciplina = KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.ALT_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miCadDisciplina.setAccelerator(ksCadDisciplina);
		mnCadastro.add(miCadDisciplina);
		
		JMenu mnRelatorio = new JMenu("Relatório");
		mnRelatorio.setMnemonic(KeyEvent.VK_R);
		menuBarCoord.add(mnRelatorio);
		
		JMenuItem miRelatorioDisciplina = new JMenuItem("Por Disciplina");
		/*
		miRelatorioDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelRelatorioDisciplina p = new PainelRelatorioDisciplina();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		*/
		KeyStroke ksRelatorioDisciplina = KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miRelatorioDisciplina.setAccelerator(ksRelatorioDisciplina);
		mnRelatorio.add(miRelatorioDisciplina);
		
		JMenuItem miRelatorioAluno = new JMenuItem("Por Aluno");
		/*
		miRelatorioAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelRelatorioAluno p = new PainelRelatorioAluno();
				FramePatec.frame.setContentPane(p);
				FramePatec.frame.revalidate();
				FramePatec.frame.repaint();
			}
		});
		*/
		KeyStroke ksRelatorioAluno = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK);
		miRelatorioAluno.setAccelerator(ksRelatorioAluno);
		mnRelatorio.add(miRelatorioAluno);
		
		JButton btnSair = new JButton("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnSair.gridx = 0;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);
	}	

}
