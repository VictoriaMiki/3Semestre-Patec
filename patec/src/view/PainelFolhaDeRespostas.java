package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PainelFolhaDeRespostas extends JPanel {

	private static final long serialVersionUID = 1L;
	private final ButtonGroup grupoQuestaoUm = new ButtonGroup();
	private final ButtonGroup grupoQuestaoDois = new ButtonGroup();
	private final ButtonGroup grupoQuestaoTres = new ButtonGroup();
	private final ButtonGroup grupoQuestaoQuatro = new ButtonGroup();
	private final ButtonGroup grupoQuestaoCinco = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public PainelFolhaDeRespostas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[]{0, 265, 0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0};
		gridBagLayout.columnWidths = new int[]{0, 0, 160, 0};
		setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.ipadx = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Folha de");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Respostas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JPanel containerFolhaRespostas = new JPanel();
		containerFolhaRespostas.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_containerFolhaRespostas = new GridBagConstraints();
		gbc_containerFolhaRespostas.insets = new Insets(0, 0, 5, 5);
		gbc_containerFolhaRespostas.fill = GridBagConstraints.BOTH;
		gbc_containerFolhaRespostas.gridx = 2;
		gbc_containerFolhaRespostas.gridy = 1;
		add(containerFolhaRespostas, gbc_containerFolhaRespostas);

		GridBagLayout gbl_containerFolhaRespostas = new GridBagLayout();
		gbl_containerFolhaRespostas.columnWidths = new int[] { 10, 30, 30, 30, 30, 30, 30, 30 };
		gbl_containerFolhaRespostas.rowHeights = new int[] { 30, 30, 30, 30, 30, 30, 0, 0, 30 };
		gbl_containerFolhaRespostas.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_containerFolhaRespostas.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		containerFolhaRespostas.setLayout(gbl_containerFolhaRespostas);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 8;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		containerFolhaRespostas.add(separator, gbc_separator);

		JLabel lblAlternativaA = new JLabel("A");
		GridBagConstraints gbc_lblAlternativaA = new GridBagConstraints();
		gbc_lblAlternativaA.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaA.gridx = 2;
		gbc_lblAlternativaA.gridy = 0;
		containerFolhaRespostas.add(lblAlternativaA, gbc_lblAlternativaA);

		JLabel lblAlternativaB = new JLabel("B");
		GridBagConstraints gbc_lblAlternativaB = new GridBagConstraints();
		gbc_lblAlternativaB.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaB.gridx = 3;
		gbc_lblAlternativaB.gridy = 0;
		containerFolhaRespostas.add(lblAlternativaB, gbc_lblAlternativaB);

		JLabel lblAlternativaC = new JLabel("C");
		GridBagConstraints gbc_lblAlternativaC = new GridBagConstraints();
		gbc_lblAlternativaC.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaC.gridx = 4;
		gbc_lblAlternativaC.gridy = 0;
		containerFolhaRespostas.add(lblAlternativaC, gbc_lblAlternativaC);

		JLabel lblAlternativaD = new JLabel("D");
		GridBagConstraints gbc_lblAlternativaD = new GridBagConstraints();
		gbc_lblAlternativaD.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaD.gridx = 5;
		gbc_lblAlternativaD.gridy = 0;
		containerFolhaRespostas.add(lblAlternativaD, gbc_lblAlternativaD);

		JLabel lblAlternativaE = new JLabel("E");
		GridBagConstraints gbc_lblAlternativaE = new GridBagConstraints();
		gbc_lblAlternativaE.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlternativaE.gridx = 6;
		gbc_lblAlternativaE.gridy = 0;
		containerFolhaRespostas.add(lblAlternativaE, gbc_lblAlternativaE);

		JLabel lblQuestaoUm = new JLabel("1.");
		GridBagConstraints gbc_lblQuestaoUm = new GridBagConstraints();
		gbc_lblQuestaoUm.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoUm.gridx = 1;
		gbc_lblQuestaoUm.gridy = 1;
		containerFolhaRespostas.add(lblQuestaoUm, gbc_lblQuestaoUm);

		JRadioButton rdbtnQuestaoUmA = new JRadioButton("");
		grupoQuestaoUm.add(rdbtnQuestaoUmA);
		GridBagConstraints gbc_rdbtnQuestaoUmA = new GridBagConstraints();
		gbc_rdbtnQuestaoUmA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmA.gridx = 2;
		gbc_rdbtnQuestaoUmA.gridy = 1;
		containerFolhaRespostas.add(rdbtnQuestaoUmA, gbc_rdbtnQuestaoUmA);

		JRadioButton rdbtnQuestaoUmB = new JRadioButton("");
		grupoQuestaoUm.add(rdbtnQuestaoUmB);
		GridBagConstraints gbc_rdbtnQuestaoUmB = new GridBagConstraints();
		gbc_rdbtnQuestaoUmB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmB.gridx = 3;
		gbc_rdbtnQuestaoUmB.gridy = 1;
		containerFolhaRespostas.add(rdbtnQuestaoUmB, gbc_rdbtnQuestaoUmB);

		JRadioButton rdbtnQuestaoUmC = new JRadioButton("");
		grupoQuestaoUm.add(rdbtnQuestaoUmC);
		GridBagConstraints gbc_rdbtnQuestaoUmC = new GridBagConstraints();
		gbc_rdbtnQuestaoUmC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmC.gridx = 4;
		gbc_rdbtnQuestaoUmC.gridy = 1;
		containerFolhaRespostas.add(rdbtnQuestaoUmC, gbc_rdbtnQuestaoUmC);

		JRadioButton rdbtnQuestaoUmD = new JRadioButton("");
		grupoQuestaoUm.add(rdbtnQuestaoUmD);
		GridBagConstraints gbc_rdbtnQuestaoUmD = new GridBagConstraints();
		gbc_rdbtnQuestaoUmD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmD.gridx = 5;
		gbc_rdbtnQuestaoUmD.gridy = 1;
		containerFolhaRespostas.add(rdbtnQuestaoUmD, gbc_rdbtnQuestaoUmD);

		JRadioButton rdbtnQuestaoUmE = new JRadioButton("");
		grupoQuestaoUm.add(rdbtnQuestaoUmE);
		GridBagConstraints gbc_rdbtnQuestaoUmE = new GridBagConstraints();
		gbc_rdbtnQuestaoUmE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoUmE.gridx = 6;
		gbc_rdbtnQuestaoUmE.gridy = 1;
		containerFolhaRespostas.add(rdbtnQuestaoUmE, gbc_rdbtnQuestaoUmE);

		JLabel lblQuestaoDois = new JLabel("2.");
		GridBagConstraints gbc_lblQuestaoDois = new GridBagConstraints();
		gbc_lblQuestaoDois.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoDois.gridx = 1;
		gbc_lblQuestaoDois.gridy = 2;
		containerFolhaRespostas.add(lblQuestaoDois, gbc_lblQuestaoDois);

		JRadioButton rdbtnQuestaoDoisA = new JRadioButton("");
		grupoQuestaoDois.add(rdbtnQuestaoDoisA);
		GridBagConstraints gbc_rdbtnQuestaoDoisA = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisA.gridx = 2;
		gbc_rdbtnQuestaoDoisA.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoDoisA, gbc_rdbtnQuestaoDoisA);

		JRadioButton rdbtnQuestaoDoisB = new JRadioButton("");
		grupoQuestaoDois.add(rdbtnQuestaoDoisB);
		GridBagConstraints gbc_rdbtnQuestaoDoisB = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisB.gridx = 3;
		gbc_rdbtnQuestaoDoisB.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoDoisB, gbc_rdbtnQuestaoDoisB);

		JRadioButton rdbtnQuestaoDoisC = new JRadioButton("");
		grupoQuestaoDois.add(rdbtnQuestaoDoisC);
		GridBagConstraints gbc_rdbtnQuestaoDoisC = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisC.gridx = 4;
		gbc_rdbtnQuestaoDoisC.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoDoisC, gbc_rdbtnQuestaoDoisC);

		JRadioButton rdbtnQuestaoDoisD = new JRadioButton("");
		grupoQuestaoDois.add(rdbtnQuestaoDoisD);
		GridBagConstraints gbc_rdbtnQuestaoDoisD = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisD.gridx = 5;
		gbc_rdbtnQuestaoDoisD.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoDoisD, gbc_rdbtnQuestaoDoisD);

		JRadioButton rdbtnQuestaoDoisE = new JRadioButton("");
		grupoQuestaoDois.add(rdbtnQuestaoDoisE);
		GridBagConstraints gbc_rdbtnQuestaoDoisE = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoDoisE.gridx = 6;
		gbc_rdbtnQuestaoDoisE.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoDoisE, gbc_rdbtnQuestaoDoisE);

		JLabel lblQuestaoTres = new JLabel("3.");
		GridBagConstraints gbc_lblQuestaoTres = new GridBagConstraints();
		gbc_lblQuestaoTres.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoTres.gridx = 1;
		gbc_lblQuestaoTres.gridy = 3;
		containerFolhaRespostas.add(lblQuestaoTres, gbc_lblQuestaoTres);

		JRadioButton rdbtnQuestaoTresA = new JRadioButton("");
		grupoQuestaoTres.add(rdbtnQuestaoTresA);
		GridBagConstraints gbc_rdbtnQuestaoTresA = new GridBagConstraints();
		gbc_rdbtnQuestaoTresA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresA.gridx = 2;
		gbc_rdbtnQuestaoTresA.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoTresA, gbc_rdbtnQuestaoTresA);

		JRadioButton rdbtnQuestaoTresB = new JRadioButton("");
		grupoQuestaoTres.add(rdbtnQuestaoTresB);
		GridBagConstraints gbc_rdbtnQuestaoTresB = new GridBagConstraints();
		gbc_rdbtnQuestaoTresB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresB.gridx = 3;
		gbc_rdbtnQuestaoTresB.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoTresB, gbc_rdbtnQuestaoTresB);

		JRadioButton rdbtnQuestaoTresC = new JRadioButton("");
		grupoQuestaoTres.add(rdbtnQuestaoTresC);
		GridBagConstraints gbc_rdbtnQuestaoTresC = new GridBagConstraints();
		gbc_rdbtnQuestaoTresC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresC.gridx = 4;
		gbc_rdbtnQuestaoTresC.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoTresC, gbc_rdbtnQuestaoTresC);

		JRadioButton rdbtnQuestaoTresD = new JRadioButton("");
		grupoQuestaoTres.add(rdbtnQuestaoTresD);
		GridBagConstraints gbc_rdbtnQuestaoTresD = new GridBagConstraints();
		gbc_rdbtnQuestaoTresD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresD.gridx = 5;
		gbc_rdbtnQuestaoTresD.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoTresD, gbc_rdbtnQuestaoTresD);

		JRadioButton rdbtnQuestaoTresE = new JRadioButton("");
		grupoQuestaoTres.add(rdbtnQuestaoTresE);
		GridBagConstraints gbc_rdbtnQuestaoTresE = new GridBagConstraints();
		gbc_rdbtnQuestaoTresE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoTresE.gridx = 6;
		gbc_rdbtnQuestaoTresE.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoTresE, gbc_rdbtnQuestaoTresE);

		JLabel lblQuestaoQuatro = new JLabel("4.");
		GridBagConstraints gbc_lblQuestaoQuatro = new GridBagConstraints();
		gbc_lblQuestaoQuatro.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoQuatro.gridx = 1;
		gbc_lblQuestaoQuatro.gridy = 4;
		containerFolhaRespostas.add(lblQuestaoQuatro, gbc_lblQuestaoQuatro);

		JRadioButton rdbtnQuestaoQuatroA = new JRadioButton("");
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroA);
		GridBagConstraints gbc_rdbtnQuestaoQuatroA = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroA.gridx = 2;
		gbc_rdbtnQuestaoQuatroA.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroA, gbc_rdbtnQuestaoQuatroA);

		JRadioButton rdbtnQuestaoQuatroB = new JRadioButton("");
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroB);
		GridBagConstraints gbc_rdbtnQuestaoQuatroB = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroB.gridx = 3;
		gbc_rdbtnQuestaoQuatroB.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroB, gbc_rdbtnQuestaoQuatroB);

		JRadioButton rdbtnQuestaoQuatroC = new JRadioButton("");
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroC);
		GridBagConstraints gbc_rdbtnQuestaoQuatroC = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroC.gridx = 4;
		gbc_rdbtnQuestaoQuatroC.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroC, gbc_rdbtnQuestaoQuatroC);

		JRadioButton rdbtnQuestaoQuatroD = new JRadioButton("");
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroD);
		GridBagConstraints gbc_rdbtnQuestaoQuatroD = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroD.gridx = 5;
		gbc_rdbtnQuestaoQuatroD.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroD, gbc_rdbtnQuestaoQuatroD);

		JRadioButton rdbtnQuestaoQuatroE = new JRadioButton("");
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroE);
		GridBagConstraints gbc_rdbtnQuestaoQuatroE = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoQuatroE.gridx = 6;
		gbc_rdbtnQuestaoQuatroE.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroE, gbc_rdbtnQuestaoQuatroE);

		JLabel lblQuestaoCinco = new JLabel("5.");
		GridBagConstraints gbc_lblQuestaoCinco = new GridBagConstraints();
		gbc_lblQuestaoCinco.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoCinco.gridx = 1;
		gbc_lblQuestaoCinco.gridy = 5;
		containerFolhaRespostas.add(lblQuestaoCinco, gbc_lblQuestaoCinco);

		JRadioButton rdbtnQuestaoCincoA = new JRadioButton("");
		grupoQuestaoCinco.add(rdbtnQuestaoCincoA);
		GridBagConstraints gbc_rdbtnQuestaoCincoA = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoA.gridx = 2;
		gbc_rdbtnQuestaoCincoA.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoCincoA, gbc_rdbtnQuestaoCincoA);

		JRadioButton rdbtnQuestaoCincoB = new JRadioButton("");
		grupoQuestaoCinco.add(rdbtnQuestaoCincoB);
		GridBagConstraints gbc_rdbtnQuestaoCincoB = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoB.gridx = 3;
		gbc_rdbtnQuestaoCincoB.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoCincoB, gbc_rdbtnQuestaoCincoB);

		JRadioButton rdbtnQuestaoCincoC = new JRadioButton("");
		grupoQuestaoCinco.add(rdbtnQuestaoCincoC);
		GridBagConstraints gbc_rdbtnQuestaoCincoC = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoC.gridx = 4;
		gbc_rdbtnQuestaoCincoC.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoCincoC, gbc_rdbtnQuestaoCincoC);

		JRadioButton rdbtnQuestaoCincoD = new JRadioButton("");
		grupoQuestaoCinco.add(rdbtnQuestaoCincoD);
		GridBagConstraints gbc_rdbtnQuestaoCincoD = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoD.gridx = 5;
		gbc_rdbtnQuestaoCincoD.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoCincoD, gbc_rdbtnQuestaoCincoD);

		JRadioButton rdbtnQuestaoCincoE = new JRadioButton("");
		grupoQuestaoCinco.add(rdbtnQuestaoCincoE);
		GridBagConstraints gbc_rdbtnQuestaoCincoE = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoCincoE.gridx = 6;
		gbc_rdbtnQuestaoCincoE.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoCincoE, gbc_rdbtnQuestaoCincoE);
		
				JButton btnEntregar = new JButton("Entregar");
				btnEntregar.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						PainelMenuAluno p = new PainelMenuAluno();
						FramePatec.frame.setContentPane(p);
						FramePatec.frame.revalidate();
						FramePatec.frame.repaint();
					}
				});
				btnEntregar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						PainelMenuAluno p = new PainelMenuAluno();
						FramePatec.frame.setContentPane(p);
						FramePatec.frame.revalidate();
						FramePatec.frame.repaint();
					}
				});
				GridBagConstraints gbc_btnEntregar = new GridBagConstraints();
				gbc_btnEntregar.fill = GridBagConstraints.VERTICAL;
				gbc_btnEntregar.gridwidth = 8;
				gbc_btnEntregar.gridx = 1;
				gbc_btnEntregar.gridy = 7;
				containerFolhaRespostas.add(btnEntregar, gbc_btnEntregar);

	}

}
