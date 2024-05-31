package view.resources;

import java.awt.event.*;
import javax.swing.*;
import view.*;

@SuppressWarnings("serial")
public class MenuBarCoord extends JMenuBar {

	public MenuBarCoord() {
		JMenuBar menuBar = new JMenuBar();
		add(menuBar);

		JMenu mnNewMenu = new JMenu("Gabarito");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Listar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelListarGabaritos p = new PainelListarGabaritos();
				FramePatec.getFrame().setTitle("Patec - Listar Gabaritos");
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cadastrar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelCadastroGabarito p = new PainelCadastroGabarito();
				FramePatec.getFrame().setTitle("Patec - Cadastrar Gabarito");
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenu mnNewMenu_1 = new JMenu("Aluno");
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelListarAlunos p = new PainelListarAlunos();
				FramePatec.getFrame().setTitle("Patec - Listar Alunos");
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Cadastrar");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelCadastroAluno p = new PainelCadastroAluno();
				FramePatec.getFrame().setTitle("Patec - Cadastrar Aluno");
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Obter Relatório");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelRelatorioAluno p = new PainelRelatorioAluno();
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenu mnNewMenu_2 = new JMenu("Disciplina");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Listar");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelListarDisciplinas p = new PainelListarDisciplinas();
				FramePatec.getFrame().setTitle("Patec - Listar Disciplinas");
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Cadastrar");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelCadastroDisciplina p = new PainelCadastroDisciplina();
				FramePatec.getFrame().setTitle("Patec - Cadastrar Disciplina");
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Obter Relatório");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelRelatorioDisciplina p = new PainelRelatorioDisciplina();
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_7);

		JMenu mnNewMenu_3 = new JMenu("Avaliação");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Listar");
		mntmNewMenuItem_8.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				PainelListarAvaliacoes p = new PainelListarAvaliacoes();
				FramePatec.getFrame().setTitle("Patec - Listar Avaliações");
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
				}
			});
		  mnNewMenu_3.add(mntmNewMenuItem_8);
		 
		  JMenuItem mntmNewMenuItem_9 = new JMenuItem("Cadastrar");
		  mntmNewMenuItem_9.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
				 PainelCadastroAvaliacao p = new PainelCadastroAvaliacao(); 
				 FramePatec.getFrame().setTitle("Patec - Cadastrar Avaliação");
				 FramePatec.getFrame().setContentPane(p);
				 FramePatec.getFrame().revalidate();
				 FramePatec.getFrame().repaint();
			  	 } 
			  });
		  mnNewMenu_3.add(mntmNewMenuItem_9);
	}

}
