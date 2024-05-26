package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import net.sourceforge.jdatepicker.impl.*;
import view.resources.*;

public class PainelCadastroGabarito extends JPanel {

	private static final long serialVersionUID = 1L;
	private final ButtonGroup grupoQuestaoUm = new ButtonGroup();
	private final ButtonGroup grupoQuestaoDois = new ButtonGroup();
	private final ButtonGroup grupoQuestaoTres = new ButtonGroup();
	private final ButtonGroup grupoQuestaoQuatro = new ButtonGroup();
	private final ButtonGroup grupoQuestaoCinco = new ButtonGroup();

	private GabaritoOficial go = new GabaritoOficial();

	/**
	 * Create the panel.
	 */
	public PainelCadastroGabarito() {

		String[] tipoAvaliacao = { "-- selecione um tipo --", "1°BIM - SÁBADO", "1°BIM - SEGUNDA", "2°BIM - SÁBADO",
				"2°BIM - SEGUNDA", "FINAL" };
		String[] disciplina = { "-- selecione uma disciplina --" };

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 66, 0, 100, 150, 0, 66, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 230, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		MenuBarCoord bdf = new MenuBarCoord();
		GridBagConstraints gbc_bdf = new GridBagConstraints();
		gbc_bdf.gridwidth = 6;
		gbc_bdf.anchor = GridBagConstraints.NORTH;
		gbc_bdf.fill = GridBagConstraints.HORIZONTAL;
		gbc_bdf.insets = new Insets(0, 0, 5, 0);
		gbc_bdf.gridx = 0;
		gbc_bdf.gridy = 0;
		add(bdf, gbc_bdf);

		BtnVoltar btnVoltar = new BtnVoltar("Voltar");
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 1;
		add(btnVoltar, gbc_btnVoltar);

		BtnSair btnSair = new BtnSair("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 5, 0);
		gbc_btnSair.gridx = 5;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.ipadx = 10;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Gabarito");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JPanel containerGabarito = new JPanel();
		containerGabarito.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_containerGabarito = new GridBagConstraints();
		gbc_containerGabarito.insets = new Insets(0, 0, 0, 5);
		gbc_containerGabarito.fill = GridBagConstraints.BOTH;
		gbc_containerGabarito.gridx = 3;
		gbc_containerGabarito.gridy = 2;
		add(containerGabarito, gbc_containerGabarito);
		GridBagLayout gbl_containerGabarito = new GridBagLayout();
		gbl_containerGabarito.columnWidths = new int[] { 10, 30, 30, 30, 30, 30, 30, 30 };
		gbl_containerGabarito.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 30, 30, 30, 30, 30, 30, 30, 0, 30 };
		gbl_containerGabarito.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_containerGabarito.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, 0.0, Double.MIN_VALUE };
		containerGabarito.setLayout(gbl_containerGabarito);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 14;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		containerGabarito.add(separator, gbc_separator);

		JLabel lblDiaAvaliacao = new JLabel("Dia da avaliação:");
		lblDiaAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDiaAvaliacao = new GridBagConstraints();
		gbc_lblDiaAvaliacao.anchor = GridBagConstraints.WEST;
		gbc_lblDiaAvaliacao.gridwidth = 6;
		gbc_lblDiaAvaliacao.insets = new Insets(0, 0, 5, 0);
		gbc_lblDiaAvaliacao.gridx = 1;
		gbc_lblDiaAvaliacao.gridy = 0;
		containerGabarito.add(lblDiaAvaliacao, gbc_lblDiaAvaliacao);

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl tftDataAvaliacao = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		//JDatePickerImpl tftDataAvaliacao = new JDatePickerImpl(datePanel);
		tftDataAvaliacao.getJFormattedTextField().setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tftDataAvalicao = new GridBagConstraints();
		gbc_tftDataAvalicao.gridwidth = 6;
		gbc_tftDataAvalicao.insets = new Insets(0, 0, 5, 5);
		gbc_tftDataAvalicao.fill = GridBagConstraints.BOTH;
		gbc_tftDataAvalicao.gridx = 1;
		gbc_tftDataAvalicao.gridy = 1;
		containerGabarito.add(tftDataAvaliacao, gbc_tftDataAvalicao);

		JLabel lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblDisciplina = new GridBagConstraints();
		gbc_lblDisciplina.anchor = GridBagConstraints.WEST;
		gbc_lblDisciplina.gridwidth = 6;
		gbc_lblDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_lblDisciplina.gridx = 1;
		gbc_lblDisciplina.gridy = 2;
		containerGabarito.add(lblDisciplina, gbc_lblDisciplina);

		JComboBox cbDisciplina = new JComboBox(disciplina);
		cbDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_cbDisciplina = new GridBagConstraints();
		gbc_cbDisciplina.fill = GridBagConstraints.BOTH;
		gbc_cbDisciplina.gridwidth = 6;
		gbc_cbDisciplina.insets = new Insets(0, 0, 5, 0);
		gbc_cbDisciplina.gridx = 1;
		gbc_cbDisciplina.gridy = 3;
		containerGabarito.add(cbDisciplina, gbc_cbDisciplina);

		JLabel lblTipoAvaliacao = new JLabel("Tipo da avaliação:");
		lblTipoAvaliacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblTipoAvaliacao = new GridBagConstraints();
		gbc_lblTipoAvaliacao.anchor = GridBagConstraints.WEST;
		gbc_lblTipoAvaliacao.gridwidth = 6;
		gbc_lblTipoAvaliacao.insets = new Insets(0, 0, 5, 0);
		gbc_lblTipoAvaliacao.gridx = 1;
		gbc_lblTipoAvaliacao.gridy = 4;
		containerGabarito.add(lblTipoAvaliacao, gbc_lblTipoAvaliacao);

		JComboBox cbTipoAvaliacao = new JComboBox(tipoAvaliacao);
		cbTipoAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_cbTipoAvaliacao = new GridBagConstraints();
		gbc_cbTipoAvaliacao.fill = GridBagConstraints.BOTH;
		gbc_cbTipoAvaliacao.gridwidth = 6;
		gbc_cbTipoAvaliacao.insets = new Insets(0, 0, 5, 0);
		gbc_cbTipoAvaliacao.gridx = 1;
		gbc_cbTipoAvaliacao.gridy = 5;
		containerGabarito.add(cbTipoAvaliacao, gbc_cbTipoAvaliacao);

		JLabel lblAlternativaA = new JLabel("A");
		GridBagConstraints gbc_lblAlternativaA = new GridBagConstraints();
		gbc_lblAlternativaA.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaA.gridx = 2;
		gbc_lblAlternativaA.gridy = 7;
		containerGabarito.add(lblAlternativaA, gbc_lblAlternativaA);

		JLabel lblAlternativaB = new JLabel("B");
		GridBagConstraints gbc_lblAlternativaB = new GridBagConstraints();
		gbc_lblAlternativaB.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaB.gridx = 3;
		gbc_lblAlternativaB.gridy = 7;
		containerGabarito.add(lblAlternativaB, gbc_lblAlternativaB);

		JLabel lblAlternativaC = new JLabel("C");
		GridBagConstraints gbc_lblAlternativaC = new GridBagConstraints();
		gbc_lblAlternativaC.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaC.gridx = 4;
		gbc_lblAlternativaC.gridy = 7;
		containerGabarito.add(lblAlternativaC, gbc_lblAlternativaC);

		JLabel lblAlternativaD = new JLabel("D");
		GridBagConstraints gbc_lblAlternativaD = new GridBagConstraints();
		gbc_lblAlternativaD.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlternativaD.gridx = 5;
		gbc_lblAlternativaD.gridy = 7;
		containerGabarito.add(lblAlternativaD, gbc_lblAlternativaD);

		JLabel lblAlternativaE = new JLabel("E");
		GridBagConstraints gbc_lblAlternativaE = new GridBagConstraints();
		gbc_lblAlternativaE.insets = new Insets(0, 0, 5, 0);
		gbc_lblAlternativaE.gridx = 6;
		gbc_lblAlternativaE.gridy = 7;
		containerGabarito.add(lblAlternativaE, gbc_lblAlternativaE);

		JLabel lblQuestaoUm = new JLabel("1.");
		GridBagConstraints gbc_lblQuestaoUm = new GridBagConstraints();
		gbc_lblQuestaoUm.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoUm.gridx = 1;
		gbc_lblQuestaoUm.gridy = 8;
		containerGabarito.add(lblQuestaoUm, gbc_lblQuestaoUm);

		JRadioButton rdbtnQuestaoUmA = new JRadioButton("");
		rdbtnQuestaoUmA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao1('A');
			}
		});
		grupoQuestaoUm.add(rdbtnQuestaoUmA);
		GridBagConstraints gbc_rdbtnQuestaoUmA = new GridBagConstraints();
		gbc_rdbtnQuestaoUmA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmA.gridx = 2;
		gbc_rdbtnQuestaoUmA.gridy = 8;
		containerGabarito.add(rdbtnQuestaoUmA, gbc_rdbtnQuestaoUmA);

		JRadioButton rdbtnQuestaoUmB = new JRadioButton("");
		rdbtnQuestaoUmB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao1('B');
			}
		});
		grupoQuestaoUm.add(rdbtnQuestaoUmB);
		GridBagConstraints gbc_rdbtnQuestaoUmB = new GridBagConstraints();
		gbc_rdbtnQuestaoUmB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmB.gridx = 3;
		gbc_rdbtnQuestaoUmB.gridy = 8;
		containerGabarito.add(rdbtnQuestaoUmB, gbc_rdbtnQuestaoUmB);

		JRadioButton rdbtnQuestaoUmC = new JRadioButton("");
		rdbtnQuestaoUmC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao1('C');
			}
		});
		grupoQuestaoUm.add(rdbtnQuestaoUmC);
		GridBagConstraints gbc_rdbtnQuestaoUmC = new GridBagConstraints();
		gbc_rdbtnQuestaoUmC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmC.gridx = 4;
		gbc_rdbtnQuestaoUmC.gridy = 8;
		containerGabarito.add(rdbtnQuestaoUmC, gbc_rdbtnQuestaoUmC);

		JRadioButton rdbtnQuestaoUmD = new JRadioButton("");
		rdbtnQuestaoUmD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao1('D');
			}
		});
		grupoQuestaoUm.add(rdbtnQuestaoUmD);
		GridBagConstraints gbc_rdbtnQuestaoUmD = new GridBagConstraints();
		gbc_rdbtnQuestaoUmD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoUmD.gridx = 5;
		gbc_rdbtnQuestaoUmD.gridy = 8;
		containerGabarito.add(rdbtnQuestaoUmD, gbc_rdbtnQuestaoUmD);

		JRadioButton rdbtnQuestaoUmE = new JRadioButton("");
		rdbtnQuestaoUmE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao1('E');
			}
		});
		grupoQuestaoUm.add(rdbtnQuestaoUmE);
		GridBagConstraints gbc_rdbtnQuestaoUmE = new GridBagConstraints();
		gbc_rdbtnQuestaoUmE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoUmE.gridx = 6;
		gbc_rdbtnQuestaoUmE.gridy = 8;
		containerGabarito.add(rdbtnQuestaoUmE, gbc_rdbtnQuestaoUmE);

		JLabel lblQuestaoDois = new JLabel("2.");
		GridBagConstraints gbc_lblQuestaoDois = new GridBagConstraints();
		gbc_lblQuestaoDois.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoDois.gridx = 1;
		gbc_lblQuestaoDois.gridy = 9;
		containerGabarito.add(lblQuestaoDois, gbc_lblQuestaoDois);

		JRadioButton rdbtnQuestaoDoisA = new JRadioButton("");
		rdbtnQuestaoDoisA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao2('A');
			}
		});
		grupoQuestaoDois.add(rdbtnQuestaoDoisA);
		GridBagConstraints gbc_rdbtnQuestaoDoisA = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisA.gridx = 2;
		gbc_rdbtnQuestaoDoisA.gridy = 9;
		containerGabarito.add(rdbtnQuestaoDoisA, gbc_rdbtnQuestaoDoisA);

		JRadioButton rdbtnQuestaoDoisB = new JRadioButton("");
		rdbtnQuestaoDoisB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao2('B');
			}
		});
		grupoQuestaoDois.add(rdbtnQuestaoDoisB);
		GridBagConstraints gbc_rdbtnQuestaoDoisB = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisB.gridx = 3;
		gbc_rdbtnQuestaoDoisB.gridy = 9;
		containerGabarito.add(rdbtnQuestaoDoisB, gbc_rdbtnQuestaoDoisB);

		JRadioButton rdbtnQuestaoDoisC = new JRadioButton("");
		rdbtnQuestaoDoisC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao2('C');
			}
		});
		grupoQuestaoDois.add(rdbtnQuestaoDoisC);
		GridBagConstraints gbc_rdbtnQuestaoDoisC = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisC.gridx = 4;
		gbc_rdbtnQuestaoDoisC.gridy = 9;
		containerGabarito.add(rdbtnQuestaoDoisC, gbc_rdbtnQuestaoDoisC);

		JRadioButton rdbtnQuestaoDoisD = new JRadioButton("");
		rdbtnQuestaoDoisD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao2('D');
			}
		});
		grupoQuestaoDois.add(rdbtnQuestaoDoisD);
		GridBagConstraints gbc_rdbtnQuestaoDoisD = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoDoisD.gridx = 5;
		gbc_rdbtnQuestaoDoisD.gridy = 9;
		containerGabarito.add(rdbtnQuestaoDoisD, gbc_rdbtnQuestaoDoisD);

		JRadioButton rdbtnQuestaoDoisE = new JRadioButton("");
		rdbtnQuestaoDoisE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao2('E');
			}
		});
		grupoQuestaoDois.add(rdbtnQuestaoDoisE);
		GridBagConstraints gbc_rdbtnQuestaoDoisE = new GridBagConstraints();
		gbc_rdbtnQuestaoDoisE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoDoisE.gridx = 6;
		gbc_rdbtnQuestaoDoisE.gridy = 9;
		containerGabarito.add(rdbtnQuestaoDoisE, gbc_rdbtnQuestaoDoisE);

		JLabel lblQuestaoTres = new JLabel("3.");
		GridBagConstraints gbc_lblQuestaoTres = new GridBagConstraints();
		gbc_lblQuestaoTres.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoTres.gridx = 1;
		gbc_lblQuestaoTres.gridy = 10;
		containerGabarito.add(lblQuestaoTres, gbc_lblQuestaoTres);

		JRadioButton rdbtnQuestaoTresA = new JRadioButton("");
		rdbtnQuestaoTresA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao3('A');
			}
		});
		grupoQuestaoTres.add(rdbtnQuestaoTresA);
		GridBagConstraints gbc_rdbtnQuestaoTresA = new GridBagConstraints();
		gbc_rdbtnQuestaoTresA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresA.gridx = 2;
		gbc_rdbtnQuestaoTresA.gridy = 10;
		containerGabarito.add(rdbtnQuestaoTresA, gbc_rdbtnQuestaoTresA);

		JRadioButton rdbtnQuestaoTresB = new JRadioButton("");
		rdbtnQuestaoTresB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao3('B');
			}
		});
		grupoQuestaoTres.add(rdbtnQuestaoTresB);
		GridBagConstraints gbc_rdbtnQuestaoTresB = new GridBagConstraints();
		gbc_rdbtnQuestaoTresB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresB.gridx = 3;
		gbc_rdbtnQuestaoTresB.gridy = 10;
		containerGabarito.add(rdbtnQuestaoTresB, gbc_rdbtnQuestaoTresB);

		JRadioButton rdbtnQuestaoTresC = new JRadioButton("");
		rdbtnQuestaoTresC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao3('C');
			}
		});
		grupoQuestaoTres.add(rdbtnQuestaoTresC);
		GridBagConstraints gbc_rdbtnQuestaoTresC = new GridBagConstraints();
		gbc_rdbtnQuestaoTresC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresC.gridx = 4;
		gbc_rdbtnQuestaoTresC.gridy = 10;
		containerGabarito.add(rdbtnQuestaoTresC, gbc_rdbtnQuestaoTresC);

		JRadioButton rdbtnQuestaoTresD = new JRadioButton("");
		rdbtnQuestaoTresD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao3('D');
			}
		});
		grupoQuestaoTres.add(rdbtnQuestaoTresD);
		GridBagConstraints gbc_rdbtnQuestaoTresD = new GridBagConstraints();
		gbc_rdbtnQuestaoTresD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoTresD.gridx = 5;
		gbc_rdbtnQuestaoTresD.gridy = 10;
		containerGabarito.add(rdbtnQuestaoTresD, gbc_rdbtnQuestaoTresD);

		JRadioButton rdbtnQuestaoTresE = new JRadioButton("");
		rdbtnQuestaoTresE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao3('E');
			}
		});
		grupoQuestaoTres.add(rdbtnQuestaoTresE);
		GridBagConstraints gbc_rdbtnQuestaoTresE = new GridBagConstraints();
		gbc_rdbtnQuestaoTresE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoTresE.gridx = 6;
		gbc_rdbtnQuestaoTresE.gridy = 10;
		containerGabarito.add(rdbtnQuestaoTresE, gbc_rdbtnQuestaoTresE);

		JLabel lblQuestaoQuatro = new JLabel("4.");
		GridBagConstraints gbc_lblQuestaoQuatro = new GridBagConstraints();
		gbc_lblQuestaoQuatro.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoQuatro.gridx = 1;
		gbc_lblQuestaoQuatro.gridy = 11;
		containerGabarito.add(lblQuestaoQuatro, gbc_lblQuestaoQuatro);

		JRadioButton rdbtnQuestaoQuatroA = new JRadioButton("");
		rdbtnQuestaoQuatroA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao4('A');
			}
		});
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroA);
		GridBagConstraints gbc_rdbtnQuestaoQuatroA = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroA.gridx = 2;
		gbc_rdbtnQuestaoQuatroA.gridy = 11;
		containerGabarito.add(rdbtnQuestaoQuatroA, gbc_rdbtnQuestaoQuatroA);

		JRadioButton rdbtnQuestaoQuatroB = new JRadioButton("");
		rdbtnQuestaoQuatroB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao4('B');
			}
		});
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroB);
		GridBagConstraints gbc_rdbtnQuestaoQuatroB = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroB.gridx = 3;
		gbc_rdbtnQuestaoQuatroB.gridy = 11;
		containerGabarito.add(rdbtnQuestaoQuatroB, gbc_rdbtnQuestaoQuatroB);

		JRadioButton rdbtnQuestaoQuatroC = new JRadioButton("");
		rdbtnQuestaoQuatroC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao4('C');
			}
		});
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroC);
		GridBagConstraints gbc_rdbtnQuestaoQuatroC = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroC.gridx = 4;
		gbc_rdbtnQuestaoQuatroC.gridy = 11;
		containerGabarito.add(rdbtnQuestaoQuatroC, gbc_rdbtnQuestaoQuatroC);

		JRadioButton rdbtnQuestaoQuatroD = new JRadioButton("");
		rdbtnQuestaoQuatroD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao4('D');
			}
		});
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroD);
		GridBagConstraints gbc_rdbtnQuestaoQuatroD = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoQuatroD.gridx = 5;
		gbc_rdbtnQuestaoQuatroD.gridy = 11;
		containerGabarito.add(rdbtnQuestaoQuatroD, gbc_rdbtnQuestaoQuatroD);

		JRadioButton rdbtnQuestaoQuatroE = new JRadioButton("");
		rdbtnQuestaoQuatroE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao4('E');
			}
		});
		grupoQuestaoQuatro.add(rdbtnQuestaoQuatroE);
		GridBagConstraints gbc_rdbtnQuestaoQuatroE = new GridBagConstraints();
		gbc_rdbtnQuestaoQuatroE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoQuatroE.gridx = 6;
		gbc_rdbtnQuestaoQuatroE.gridy = 11;
		containerGabarito.add(rdbtnQuestaoQuatroE, gbc_rdbtnQuestaoQuatroE);

		JLabel lblQuestaoCinco = new JLabel("5.");
		GridBagConstraints gbc_lblQuestaoCinco = new GridBagConstraints();
		gbc_lblQuestaoCinco.insets = new Insets(0, 0, 5, 5);
		gbc_lblQuestaoCinco.gridx = 1;
		gbc_lblQuestaoCinco.gridy = 12;
		containerGabarito.add(lblQuestaoCinco, gbc_lblQuestaoCinco);

		JRadioButton rdbtnQuestaoCincoA = new JRadioButton("");
		rdbtnQuestaoCincoA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao5('A');
			}
		});
		grupoQuestaoCinco.add(rdbtnQuestaoCincoA);
		GridBagConstraints gbc_rdbtnQuestaoCincoA = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoA.gridx = 2;
		gbc_rdbtnQuestaoCincoA.gridy = 12;
		containerGabarito.add(rdbtnQuestaoCincoA, gbc_rdbtnQuestaoCincoA);

		JRadioButton rdbtnQuestaoCincoB = new JRadioButton("");
		rdbtnQuestaoCincoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao5('B');
			}
		});
		grupoQuestaoCinco.add(rdbtnQuestaoCincoB);
		GridBagConstraints gbc_rdbtnQuestaoCincoB = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoB.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoB.gridx = 3;
		gbc_rdbtnQuestaoCincoB.gridy = 12;
		containerGabarito.add(rdbtnQuestaoCincoB, gbc_rdbtnQuestaoCincoB);

		JRadioButton rdbtnQuestaoCincoC = new JRadioButton("");
		rdbtnQuestaoCincoC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao5('C');
			}
		});
		grupoQuestaoCinco.add(rdbtnQuestaoCincoC);
		GridBagConstraints gbc_rdbtnQuestaoCincoC = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoC.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoC.gridx = 4;
		gbc_rdbtnQuestaoCincoC.gridy = 12;
		containerGabarito.add(rdbtnQuestaoCincoC, gbc_rdbtnQuestaoCincoC);

		JRadioButton rdbtnQuestaoCincoD = new JRadioButton("");
		rdbtnQuestaoCincoD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao5('D');
			}
		});
		grupoQuestaoCinco.add(rdbtnQuestaoCincoD);
		GridBagConstraints gbc_rdbtnQuestaoCincoD = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoD.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnQuestaoCincoD.gridx = 5;
		gbc_rdbtnQuestaoCincoD.gridy = 12;
		containerGabarito.add(rdbtnQuestaoCincoD, gbc_rdbtnQuestaoCincoD);

		JRadioButton rdbtnQuestaoCincoE = new JRadioButton("");
		rdbtnQuestaoCincoE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				go.setQuestao5('E');
			}
		});
		grupoQuestaoCinco.add(rdbtnQuestaoCincoE);
		GridBagConstraints gbc_rdbtnQuestaoCincoE = new GridBagConstraints();
		gbc_rdbtnQuestaoCincoE.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnQuestaoCincoE.gridx = 6;
		gbc_rdbtnQuestaoCincoE.gridy = 12;
		containerGabarito.add(rdbtnQuestaoCincoE, gbc_rdbtnQuestaoCincoE);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Character.isAlphabetic(go.getQuestao1()) || !Character.isAlphabetic(go.getQuestao2())
						|| !Character.isAlphabetic(go.getQuestao3()) || !Character.isAlphabetic(go.getQuestao4())
						|| !Character.isAlphabetic(go.getQuestao5())) {
					JOptionPane.showMessageDialog(null, "Há questões sem alternativas válidas.");
				} else {
					System.out.println(tftDataAvaliacao.getJFormattedTextField().getText().isBlank());
					PainelMenuCoordenador p = new PainelMenuCoordenador();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				}
			}
		});
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.fill = GridBagConstraints.VERTICAL;
		gbc_btnSalvar.gridwidth = 3;
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 3;
		gbc_btnSalvar.gridy = 13;
		containerGabarito.add(btnSalvar, gbc_btnSalvar);

	}

}
