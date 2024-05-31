package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Avaliacao;
import model.AvaliacaoDAO;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import view.resources.BtnSair;
import view.resources.BtnVoltar;
import view.resources.DateLabelFormatter;
import view.resources.MenuBarCoord;

public class PainelCadastroAvaliacao extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfCodigoAvaliação;
	private JTextField tfAnoAvaliacao;
	private JComboBox<String> cbSemestre;
	private String[] semestres = {"1", "2"};
	private JComboBox<String> cbTipoAvaliacao;
	private String[] tipoAvaliacao = {"1ºBIM - SÁBADO", "2ºBIM - SÁBADO", "1ºBIM - SEGUNDA-FEIRA", "2ºBIM - SEGUNDA-FEIRA", "FINAL"};
	Avaliacao a = new Avaliacao();
	
	/**
	 * Create the panel.
	 */
	public PainelCadastroAvaliacao() {
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
		panel.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.ipadx = 10;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Cadastrar");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBackground(new Color(128, 255, 255));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Avaliação");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JPanel containerCadastroAvaliacao = new JPanel();
		containerCadastroAvaliacao.setBackground(new Color(240, 240, 240));
		GridBagConstraints gbc_containerCadastroAvaliacao = new GridBagConstraints();
		gbc_containerCadastroAvaliacao.insets = new Insets(0, 0, 5, 5);
		gbc_containerCadastroAvaliacao.fill = GridBagConstraints.BOTH;
		gbc_containerCadastroAvaliacao.gridx = 3;
		gbc_containerCadastroAvaliacao.gridy = 2;
		add(containerCadastroAvaliacao, gbc_containerCadastroAvaliacao);
		GridBagLayout gbl_containerCadastroAvaliacao = new GridBagLayout();
		gbl_containerCadastroAvaliacao.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0 };
		gbl_containerCadastroAvaliacao.columnWidths = new int[] { 0, 5, 0, 0, 0, 0 };
		containerCadastroAvaliacao.setLayout(gbl_containerCadastroAvaliacao);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.ipadx = 10;
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 10;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		containerCadastroAvaliacao.add(separator, gbc_separator);

		JLabel lblCodigoAvaliacao = new JLabel("Código da Avaliação:");
		lblCodigoAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblCodigoAvaliacao = new GridBagConstraints();
		gbc_lblCodigoAvaliacao.gridwidth = 2;
		gbc_lblCodigoAvaliacao.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoAvaliacao.anchor = GridBagConstraints.WEST;
		gbc_lblCodigoAvaliacao.gridx = 1;
		gbc_lblCodigoAvaliacao.gridy = 0;
		containerCadastroAvaliacao.add(lblCodigoAvaliacao, gbc_lblCodigoAvaliacao);

		tfCodigoAvaliação = new JTextField();
		tfCodigoAvaliação.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tfCodigoAvaliação = new GridBagConstraints();
		gbc_tfCodigoAvaliação.fill = GridBagConstraints.BOTH;
		gbc_tfCodigoAvaliação.gridwidth = 5;
		gbc_tfCodigoAvaliação.insets = new Insets(0, 0, 5, 0);
		gbc_tfCodigoAvaliação.gridx = 1;
		gbc_tfCodigoAvaliação.gridy = 1;
		containerCadastroAvaliacao.add(tfCodigoAvaliação, gbc_tfCodigoAvaliação);
		tfCodigoAvaliação.setColumns(10);

		JLabel lblAnoAvaliacao = new JLabel("Ano da Avaliação:");
		lblAnoAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAnoAvaliacao = new GridBagConstraints();
		gbc_lblAnoAvaliacao.gridwidth = 2;
		gbc_lblAnoAvaliacao.insets = new Insets(0, 0, 5, 5);
		gbc_lblAnoAvaliacao.anchor = GridBagConstraints.WEST;
		gbc_lblAnoAvaliacao.gridx = 1;
		gbc_lblAnoAvaliacao.gridy = 2;
		containerCadastroAvaliacao.add(lblAnoAvaliacao, gbc_lblAnoAvaliacao);

		tfAnoAvaliacao = new JTextField();
		tfAnoAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_tfAnoAvaliacao = new GridBagConstraints();
		gbc_tfAnoAvaliacao.gridwidth = 5;
		gbc_tfAnoAvaliacao.insets = new Insets(0, 0, 5, 0);
		gbc_tfAnoAvaliacao.fill = GridBagConstraints.BOTH;
		gbc_tfAnoAvaliacao.gridx = 1;
		gbc_tfAnoAvaliacao.gridy = 3;
		containerCadastroAvaliacao.add(tfAnoAvaliacao, gbc_tfAnoAvaliacao);
		tfAnoAvaliacao.setColumns(10);

		JLabel lblSemestreAvaliacao = new JLabel("Semestre:");
		lblSemestreAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblSemestreAvaliacao = new GridBagConstraints();
		gbc_lblSemestreAvaliacao.gridwidth = 2;
		gbc_lblSemestreAvaliacao.insets = new Insets(0, 0, 5, 5);
		gbc_lblSemestreAvaliacao.anchor = GridBagConstraints.WEST;
		gbc_lblSemestreAvaliacao.gridx = 1;
		gbc_lblSemestreAvaliacao.gridy = 4;
		containerCadastroAvaliacao.add(lblSemestreAvaliacao, gbc_lblSemestreAvaliacao);

		cbSemestre = new JComboBox<String>(semestres);
		cbSemestre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_cbSemestre = new GridBagConstraints();
		gbc_cbSemestre.gridwidth = 5;
		gbc_cbSemestre.insets = new Insets(0, 0, 5, 0);
		gbc_cbSemestre.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbSemestre.gridx = 1;
		gbc_cbSemestre.gridy = 5;
		containerCadastroAvaliacao.add(cbSemestre, gbc_cbSemestre);

		JLabel lblTipoAvaliacao = new JLabel("Tipo da Avaliação:");
		lblTipoAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTipoAvaliacao = new GridBagConstraints();
		gbc_lblTipoAvaliacao.gridwidth = 2;
		gbc_lblTipoAvaliacao.anchor = GridBagConstraints.WEST;
		gbc_lblTipoAvaliacao.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoAvaliacao.gridx = 1;
		gbc_lblTipoAvaliacao.gridy = 6;
		containerCadastroAvaliacao.add(lblTipoAvaliacao, gbc_lblTipoAvaliacao);

		cbTipoAvaliacao = new JComboBox<String>(tipoAvaliacao);
		cbTipoAvaliacao.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_cbTipoAvaliacao = new GridBagConstraints();
		gbc_cbTipoAvaliacao.gridwidth = 5;
		gbc_cbTipoAvaliacao.insets = new Insets(0, 0, 5, 0);
		gbc_cbTipoAvaliacao.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbTipoAvaliacao.gridx = 1;
		gbc_cbTipoAvaliacao.gridy = 7;
		containerCadastroAvaliacao.add(cbTipoAvaliacao, gbc_cbTipoAvaliacao);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setCodigoAvaliacao(Integer.parseInt(tfCodigoAvaliação.getText()));
				a.setAnoAvaliacao(Integer.parseInt(tfAnoAvaliacao.getText()));
				a.setSemestreAvaliacao(Integer.parseInt(cbSemestre.getSelectedItem().toString()));
				a.setTipoAvaliacao(cbTipoAvaliacao.getSelectedItem().toString());
				AvaliacaoDAO dao = new AvaliacaoDAO();
				dao.gravar(a);
				JOptionPane.showMessageDialog(null, "Avaliação cadastrada com sucesso!", "Cadastro concluído", JOptionPane.INFORMATION_MESSAGE);
				PainelListarAvaliacoes p = new PainelListarAvaliacoes();
				FramePatec.getFrame().setContentPane(p);
				FramePatec.getFrame().revalidate();
				FramePatec.getFrame().repaint();
			}
		});
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.gridwidth = 5;
		gbc_btnCadastrar.gridx = 1;
		gbc_btnCadastrar.gridy = 9;
		containerCadastroAvaliacao.add(btnCadastrar, gbc_btnCadastrar);
	}

}


