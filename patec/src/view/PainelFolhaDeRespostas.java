package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PainelFolhaDeRespostas extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PainelFolhaDeRespostas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 90, 262, 90, 0 };
		gridBagLayout.rowHeights = new int[] { 30, 237, 30, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JPanel containerFolhaRespostas = new JPanel();
		containerFolhaRespostas.setBackground(new Color(0, 255, 0));
		GridBagConstraints gbc_containerFolhaRespostas = new GridBagConstraints();
		gbc_containerFolhaRespostas.insets = new Insets(0, 0, 0, 5);
		gbc_containerFolhaRespostas.fill = GridBagConstraints.BOTH;
		gbc_containerFolhaRespostas.gridx = 1;
		gbc_containerFolhaRespostas.gridy = 1;
		add(containerFolhaRespostas, gbc_containerFolhaRespostas);

		GridBagLayout gbl_containerFolhaRespostas = new GridBagLayout();
		gbl_containerFolhaRespostas.columnWidths = new int[] { 30, 30, 30, 30, 30, 30, 30, 30 };
		gbl_containerFolhaRespostas.rowHeights = new int[] { 30, 30, 30, 30, 30, 30, 30, 0, 30 };
		gbl_containerFolhaRespostas.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_containerFolhaRespostas.rowWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0,
				Double.MIN_VALUE };
		containerFolhaRespostas.setLayout(gbl_containerFolhaRespostas);

		JLabel lblAlternativaA = new JLabel("A");
		GridBagConstraints gbc_lblAlternativaA = new GridBagConstraints();
		gbc_lblAlternativaA.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaA.gridx = 2;
		gbc_lblAlternativaA.gridy = 1;
		containerFolhaRespostas.add(lblAlternativaA, gbc_lblAlternativaA);

		JLabel lblAlternativaB = new JLabel("B");
		GridBagConstraints gbc_lblAlternativaB = new GridBagConstraints();
		gbc_lblAlternativaB.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaB.gridx = 3;
		gbc_lblAlternativaB.gridy = 1;
		containerFolhaRespostas.add(lblAlternativaB, gbc_lblAlternativaB);

		JLabel lblAlternativaC = new JLabel("C");
		GridBagConstraints gbc_lblAlternativaC = new GridBagConstraints();
		gbc_lblAlternativaC.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaC.gridx = 4;
		gbc_lblAlternativaC.gridy = 1;
		containerFolhaRespostas.add(lblAlternativaC, gbc_lblAlternativaC);

		JLabel lblAlternativaD = new JLabel("D");
		GridBagConstraints gbc_lblAlternativaD = new GridBagConstraints();
		gbc_lblAlternativaD.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaD.gridx = 5;
		gbc_lblAlternativaD.gridy = 1;
		containerFolhaRespostas.add(lblAlternativaD, gbc_lblAlternativaD);

		JLabel lblAlternativaE = new JLabel("E");
		GridBagConstraints gbc_lblAlternativaE = new GridBagConstraints();
		gbc_lblAlternativaE.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlternativaE.gridx = 6;
		gbc_lblAlternativaE.gridy = 1;
		containerFolhaRespostas.add(lblAlternativaE, gbc_lblAlternativaE);

		JLabel lblQuestaoUm = new JLabel("1.");
		GridBagConstraints gbc_lblQuestaoUm = new GridBagConstraints();
		gbc_lblQuestaoUm.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoUm.gridx = 1;
		gbc_lblQuestaoUm.gridy = 2;
		containerFolhaRespostas.add(lblQuestaoUm, gbc_lblQuestaoUm);

		JRadioButton rdbtnQuestaoUmA = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoUmA = new GridBagConstraints();
		gbc_rdbtnQuestaoUmA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmA.gridx = 2;
		gbc_rdbtnQuestaoUmA.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoUmA, gbc_rdbtnQuestaoUmA);

		JRadioButton rdbtnQuestaoUmB = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoUmB = new GridBagConstraints();
		gbc_rdbtnQuestaoUmB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmB.gridx = 3;
		gbc_rdbtnQuestaoUmB.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoUmB, gbc_rdbtnQuestaoUmB);

		JRadioButton rdbtnQuestaoUmC = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoUmC = new GridBagConstraints();
		gbc_rdbtnQuestaoUmC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmC.gridx = 4;
		gbc_rdbtnQuestaoUmC.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoUmC, gbc_rdbtnQuestaoUmC);

		JRadioButton rdbtnQuestaoUmD = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoUmD = new GridBagConstraints();
		gbc_rdbtnQuestaoUmD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmD.gridx = 5;
		gbc_rdbtnQuestaoUmD.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoUmD, gbc_rdbtnQuestaoUmD);

		JRadioButton rdbtnQuestaoUmE = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoUmE = new GridBagConstraints();
		gbc_rdbtnQuestaoUmE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoUmE.gridx = 6;
		gbc_rdbtnQuestaoUmE.gridy = 2;
		containerFolhaRespostas.add(rdbtnQuestaoUmE, gbc_rdbtnQuestaoUmE);

		JLabel lblQuestaoDois = new JLabel("2");
		GridBagConstraints gbc_lblQuestaoDois = new GridBagConstraints();
		gbc_lblQuestaoDois.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoDois.gridx = 1;
		gbc_lblQuestaoDois.gridy = 3;
		containerFolhaRespostas.add(lblQuestaoDois, gbc_lblQuestaoDois);

		JRadioButton rdbtnQuestaoDoisA = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoDoisA = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisA.gridx = 2;
		gbc_rdbtnQuestaoDoisA.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoDoisA, gbc_rdbtnQuestaoDoisA);

		JRadioButton rdbtnQuestaoDoisB = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoDoisB = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisB.gridx = 3;
		gbc_rdbtnQuestaoDoisB.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoDoisB, gbc_rdbtnQuestaoDoisB);

		JRadioButton rdbtnQuestaoDoisC = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoDoisC = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisC.gridx = 4;
		gbc_rdbtnQuestaoDoisC.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoDoisC, gbc_rdbtnQuestaoDoisC);

		JRadioButton rdbtnQuestaoDoisD = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoDoisD = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisD.gridx = 5;
		gbc_rdbtnQuestaoDoisD.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoDoisD, gbc_rdbtnQuestaoDoisD);

		JRadioButton rdbtnQuestaoDoisE = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoDoisE = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoDoisE.gridx = 6;
		gbc_rdbtnQuestaoDoisE.gridy = 3;
		containerFolhaRespostas.add(rdbtnQuestaoDoisE, gbc_rdbtnQuestaoDoisE);

		JLabel lblQuestaoTres = new JLabel("3");
		GridBagConstraints gbc_lblQuestaoTres = new GridBagConstraints();
		gbc_lblQuestaoTres.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoTres.gridx = 1;
		gbc_lblQuestaoTres.gridy = 4;
		containerFolhaRespostas.add(lblQuestaoTres, gbc_lblQuestaoTres);

		JRadioButton rdbtnQuestaoTresA = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoTresA = new GridBagConstraints();
		gbc_rdbtnQuestaoTresA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresA.gridx = 2;
		gbc_rdbtnQuestaoTresA.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoTresA, gbc_rdbtnQuestaoTresA);

		JRadioButton rdbtnQuestaoTresB = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoTresB = new GridBagConstraints();
		gbc_rdbtnQuestaoTresB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresB.gridx = 3;
		gbc_rdbtnQuestaoTresB.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoTresB, gbc_rdbtnQuestaoTresB);

		JRadioButton rdbtnQuestaoTresC = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoTresC = new GridBagConstraints();
		gbc_rdbtnQuestaoTresC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresC.gridx = 4;
		gbc_rdbtnQuestaoTresC.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoTresC, gbc_rdbtnQuestaoTresC);

		JRadioButton rdbtnQuestaoTresD = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoTresD = new GridBagConstraints();
		gbc_rdbtnQuestaoTresD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresD.gridx = 5;
		gbc_rdbtnQuestaoTresD.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoTresD, gbc_rdbtnQuestaoTresD);

		JRadioButton rdbtnQuestaoTresE = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoTresE = new GridBagConstraints();
		gbc_rdbtnQuestaoTresE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoTresE.gridx = 6;
		gbc_rdbtnQuestaoTresE.gridy = 4;
		containerFolhaRespostas.add(rdbtnQuestaoTresE, gbc_rdbtnQuestaoTresE);

		JLabel lblQuestaoQuatro = new JLabel("4");
		GridBagConstraints gbc_lblQuestaoQuatro = new GridBagConstraints();
		gbc_lblQuestaoQuatro.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoQuatro.gridx = 1;
		gbc_lblQuestaoQuatro.gridy = 5;
		containerFolhaRespostas.add(lblQuestaoQuatro, gbc_lblQuestaoQuatro);

		JRadioButton rdbtnQuestaoQuatroA = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoQuatroA = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroA.gridx = 2;
		gbc_rdbtnQuestaoQuatroA.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroA, gbc_rdbtnQuestaoQuatroA);

		JRadioButton rdbtnQuestaoQuatroB = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoQuatroB = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroB.gridx = 3;
		gbc_rdbtnQuestaoQuatroB.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroB, gbc_rdbtnQuestaoQuatroB);

		JRadioButton rdbtnQuestaoQuatroC = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoQuatroC = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroC.gridx = 4;
		gbc_rdbtnQuestaoQuatroC.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroC, gbc_rdbtnQuestaoQuatroC);

		JRadioButton rdbtnQuestaoQuatroD = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoQuatroD = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroD.gridx = 5;
		gbc_rdbtnQuestaoQuatroD.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroD, gbc_rdbtnQuestaoQuatroD);

		JRadioButton rdbtnQuestaoQuatroE = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoQuatroE = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoQuatroE.gridx = 6;
		gbc_rdbtnQuestaoQuatroE.gridy = 5;
		containerFolhaRespostas.add(rdbtnQuestaoQuatroE, gbc_rdbtnQuestaoQuatroE);

		JLabel lblQuestaoCinco = new JLabel("5");
		GridBagConstraints gbc_lblQuestaoCinco = new GridBagConstraints();
		gbc_lblQuestaoCinco.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoCinco.gridx = 1;
		gbc_lblQuestaoCinco.gridy = 6;
		containerFolhaRespostas.add(lblQuestaoCinco, gbc_lblQuestaoCinco);

		JRadioButton rdbtnQuestaoCincoA = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoCincoA = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoA.gridx = 2;
		gbc_rdbtnQuestaoCincoA.gridy = 6;
		containerFolhaRespostas.add(rdbtnQuestaoCincoA, gbc_rdbtnQuestaoCincoA);

		JRadioButton rdbtnQuestaoCincoB = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoCincoB = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoB.gridx = 3;
		gbc_rdbtnQuestaoCincoB.gridy = 6;
		containerFolhaRespostas.add(rdbtnQuestaoCincoB, gbc_rdbtnQuestaoCincoB);

		JRadioButton rdbtnQuestaoCincoC = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoCincoC = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoC.gridx = 4;
		gbc_rdbtnQuestaoCincoC.gridy = 6;
		containerFolhaRespostas.add(rdbtnQuestaoCincoC, gbc_rdbtnQuestaoCincoC);

		JRadioButton rdbtnQuestaoCincoD = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoCincoD = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoD.gridx = 5;
		gbc_rdbtnQuestaoCincoD.gridy = 6;
		containerFolhaRespostas.add(rdbtnQuestaoCincoD, gbc_rdbtnQuestaoCincoD);

		JRadioButton rdbtnQuestaoCincoE = new JRadioButton("");
		GridBagConstraints gbc_rdbtnQuestaoCincoE = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoCincoE.gridx = 6;
		gbc_rdbtnQuestaoCincoE.gridy = 6;
		containerFolhaRespostas.add(rdbtnQuestaoCincoE, gbc_rdbtnQuestaoCincoE);

		JButton btnEntregar = new JButton("Entregar");
		btnEntregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnEntregar = new GridBagConstraints();
		gbc_btnEntregar.fill = GridBagConstraints.VERTICAL;
		gbc_btnEntregar.gridwidth = 3;
		gbc_btnEntregar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEntregar.gridx = 3;
		gbc_btnEntregar.gridy = 7;
		containerFolhaRespostas.add(btnEntregar, gbc_btnEntregar);

	}

}
