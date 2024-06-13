package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import net.sourceforge.jdatepicker.impl.*;
import view.components.*;

public class PainelCadastroGabarito extends JPanel {

	private static final long serialVersionUID = 1L;

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
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
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
		gbl_containerGabarito.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_containerGabarito.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_containerGabarito.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_containerGabarito.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0 };
		containerGabarito.setLayout(gbl_containerGabarito);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 9;
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
		// JDatePickerImpl tftDataAvaliacao = new JDatePickerImpl(datePanel);
		tftDataAvaliacao.getJFormattedTextField().setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tftDataAvalicao = new GridBagConstraints();
		gbc_tftDataAvalicao.gridwidth = 6;
		gbc_tftDataAvalicao.insets = new Insets(0, 0, 5, 0);
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

		BaseGabaritoOficial bgo = new BaseGabaritoOficial();
		GridBagConstraints gbc_bgo = new GridBagConstraints();
		gbc_bgo.fill = GridBagConstraints.BOTH;
		gbc_bgo.insets = new Insets(0, 0, 5, 0);
		gbc_bgo.gridwidth = 6;
		gbc_bgo.gridx = 1;
		gbc_bgo.gridy = 6;
		containerGabarito.add(bgo, gbc_bgo);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Character.isAlphabetic(bgo.go.getQuestao1()) || !Character.isAlphabetic(bgo.go.getQuestao2())
						|| !Character.isAlphabetic(bgo.go.getQuestao3()) || !Character.isAlphabetic(bgo.go.getQuestao4())
						|| !Character.isAlphabetic(bgo.go.getQuestao5())) {
					JOptionPane.showMessageDialog(null, "Há questões sem alternativas válidas.");
				} else {
					PainelMenuCoordenador p = new PainelMenuCoordenador();
					FramePatec.frame.setContentPane(p);
					FramePatec.frame.revalidate();
					FramePatec.frame.repaint();
				}
			}
		});
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.fill = GridBagConstraints.VERTICAL;
		gbc_btnSalvar.gridwidth = 6;
		gbc_btnSalvar.gridx = 1;
		gbc_btnSalvar.gridy = 8;
		containerGabarito.add(btnSalvar, gbc_btnSalvar);

	}

}