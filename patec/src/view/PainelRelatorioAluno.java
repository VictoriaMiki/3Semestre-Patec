package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.Aluno;
import model.AlunoDAO;
import util.BD;
import view.components.*;

public class PainelRelatorioAluno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabelaRelatorioAluno;
	private DefaultTableModel model;
	private BD bd;
	private AlunoDAO dao = new AlunoDAO();

	/**
	 * Create the panel.
	 */
	public PainelRelatorioAluno(Aluno a) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 66, 0, 450, 0, 66, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 0, 272, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		MenuBarCoord mbc = new MenuBarCoord();
		GridBagConstraints gbc_mbc = new GridBagConstraints();
		gbc_mbc.gridwidth = 5;
		gbc_mbc.anchor = GridBagConstraints.NORTH;
		gbc_mbc.fill = GridBagConstraints.HORIZONTAL;
		gbc_mbc.insets = new Insets(0, 0, 5, 0);
		gbc_mbc.gridx = 0;
		gbc_mbc.gridy = 0;
		add(mbc, gbc_mbc);

		BtnVoltar btnVoltar = new BtnVoltar("Voltar");
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 5);
		gbc_btnVoltar.gridx = 0;
		gbc_btnVoltar.gridy = 1;
		add(btnVoltar, gbc_btnVoltar);

		BtnSair btnSair = new BtnSair("Sair");
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 5, 0);
		gbc_btnSair.gridx = 4;
		gbc_btnSair.gridy = 1;
		add(btnSair, gbc_btnSair);

		JPanel containerLabel = new JPanel();
		GridBagConstraints gbc_containerLabel = new GridBagConstraints();
		gbc_containerLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_containerLabel.anchor = GridBagConstraints.SOUTH;
		gbc_containerLabel.insets = new Insets(0, 0, 5, 5);
		gbc_containerLabel.gridx = 2;
		gbc_containerLabel.gridy = 2;
		add(containerLabel, gbc_containerLabel);
		GridBagLayout gbl_containerLabel = new GridBagLayout();
		gbl_containerLabel.rowWeights = new double[] { 0.0 };
		gbl_containerLabel.columnWeights = new double[] { 1.0, 0.0, 1.0 };
		containerLabel.setLayout(gbl_containerLabel);

		JLabel lblRelatorioAluno = new JLabel("Relatório");
		lblRelatorioAluno.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblRelatorioAluno = new GridBagConstraints();
		gbc_lblRelatorioAluno.insets = new Insets(0, 0, 0, 5);
		gbc_lblRelatorioAluno.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblRelatorioAluno.gridx = 0;
		gbc_lblRelatorioAluno.gridy = 0;
		containerLabel.add(lblRelatorioAluno, gbc_lblRelatorioAluno);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.VERTICAL;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 0;
		containerLabel.add(separator, gbc_separator);

		JPanel containerDadosAluno = new JPanel();
		GridBagConstraints gbc_containerDadosAluno = new GridBagConstraints();
		gbc_containerDadosAluno.anchor = GridBagConstraints.WEST;
		gbc_containerDadosAluno.gridx = 2;
		gbc_containerDadosAluno.gridy = 0;
		containerLabel.add(containerDadosAluno, gbc_containerDadosAluno);
		GridBagLayout gbl_containerDadosAluno = new GridBagLayout();
		gbl_containerDadosAluno.columnWidths = new int[] { 0, 0 };
		gbl_containerDadosAluno.rowHeights = new int[] { 0, 0, 0 };
		gbl_containerDadosAluno.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_containerDadosAluno.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		containerDadosAluno.setLayout(gbl_containerDadosAluno);

		JLabel lblNomeAluno = new JLabel("Nome: " + a.getNomeAluno());
		lblNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNomeAluno = new GridBagConstraints();
		gbc_lblNomeAluno.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNomeAluno.insets = new Insets(0, 0, 5, 0);
		gbc_lblNomeAluno.gridx = 0;
		gbc_lblNomeAluno.gridy = 0;
		containerDadosAluno.add(lblNomeAluno, gbc_lblNomeAluno);

		JLabel lblRaAluno = new JLabel("RA: " + a.getRa());
		lblRaAluno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblRaAluno = new GridBagConstraints();
		gbc_lblRaAluno.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblRaAluno.gridx = 0;
		gbc_lblRaAluno.gridy = 1;
		containerDadosAluno.add(lblRaAluno, gbc_lblRaAluno);

		JScrollPane containerListaAlunos = new JScrollPane();
		GridBagConstraints gbc_containerListaAlunos = new GridBagConstraints();
		gbc_containerListaAlunos.insets = new Insets(0, 0, 5, 5);
		gbc_containerListaAlunos.fill = GridBagConstraints.BOTH;
		gbc_containerListaAlunos.gridx = 2;
		gbc_containerListaAlunos.gridy = 3;
		add(containerListaAlunos, gbc_containerListaAlunos);

		tabelaRelatorioAluno = new JTable();
		bd = new BD();
		if (bd.getConnection()) {
			carregarTabela(a.getRa());
		} else {
			JOptionPane.showMessageDialog(null, "Falha na Conexão");
			PainelMenuCoordenador p = new PainelMenuCoordenador();
			FramePatec.getFrame().setContentPane(p);
			FramePatec.getFrame().revalidate();
			FramePatec.getFrame().repaint();
		}
		tabelaRelatorioAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		containerListaAlunos.setViewportView(tabelaRelatorioAluno);
		tabelaRelatorioAluno.setFillsViewportHeight(true);
	}

	private void carregarTabela(String ra) {
		String sql = "SELECT GABARITO_OFICIAL.codigo_disciplina AS 'Cód. Disciplina', FOLHA_DE_RESPOSTAS.nota AS 'Nota Obtida' FROM FOLHA_DE_RESPOSTAS\r\n"
				+ "JOIN GABARITO_OFICIAL ON FOLHA_DE_RESPOSTAS.codigo_gabarito = GABARITO_OFICIAL.cod_gabarito\r\n"
				+ "WHERE FOLHA_DE_RESPOSTAS.ra = '" + ra + "';";
		model = TableModelPatec.getModel(bd, sql);
		tabelaRelatorioAluno.setModel(model);

	}
}
