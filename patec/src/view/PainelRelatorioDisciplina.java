package view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

//import model.Aluno;
import model.DisciplinaDAO;
import util.BD;
import util.GeraPlanilhaRelatorio;
import util.ImprimirPlanilhaRelatorio;
import view.components.BtnSair;
import view.components.BtnVoltar;
import view.components.MenuBarCoord;
import view.components.TableModelPatec;

public class PainelRelatorioDisciplina extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabelaRelatorioAluno;
	private DefaultTableModel model;
	private BD bd;
	private DisciplinaDAO dao = new DisciplinaDAO();

	/**
	 * Create the panel.
	 */
	public PainelRelatorioDisciplina(String nomeDisciplina) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 66, 100, 450, 100, 66, 0 };
		gridBagLayout.rowHeights = new int[] { 28, 0, 0, 272, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
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
		gbc_containerLabel.insets = new Insets(0, 0, 5, 5);
		gbc_containerLabel.fill = GridBagConstraints.BOTH;
		gbc_containerLabel.gridx = 2;
		gbc_containerLabel.gridy = 2;
		add(containerLabel, gbc_containerLabel);
		GridBagLayout gbl_containerLabel = new GridBagLayout();
		gbl_containerLabel.rowWeights = new double[] { 1.0 };
		gbl_containerLabel.columnWeights = new double[] { 1.0 };
		containerLabel.setLayout(gbl_containerLabel);

		JLabel lblRelatorioDisciplina = new JLabel("Relatório - " + nomeDisciplina);
		lblRelatorioDisciplina.setFont(new Font("Tahoma", Font.BOLD, 40));
		GridBagConstraints gbc_lblRelatorioDisciplina = new GridBagConstraints();
		gbc_lblRelatorioDisciplina.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblRelatorioDisciplina.gridx = 0;
		gbc_lblRelatorioDisciplina.gridy = 0;
		containerLabel.add(lblRelatorioDisciplina, gbc_lblRelatorioDisciplina);

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
			carregarTabela(nomeDisciplina);
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

		JButton btnImprimirRelatorioDisciplina = new JButton("Imprimir Relatório");
		btnImprimirRelatorioDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<Integer, Object> matrizDados = dao.GerarRelatorioDisciplina(nomeDisciplina);
				try {
					GeraPlanilhaRelatorio.planilhaRelatorioDisciplina(matrizDados,
							"spreadsheets/RelatorioDisciplina.xls");
					ImprimirPlanilhaRelatorio.imprimeRelatorio("spreadsheets/RelatorioDisciplina.xls");

				} catch (IOException e1) {
					new File("spreadsheets").mkdir();
					try {
						GeraPlanilhaRelatorio.planilhaRelatorioDisciplina(matrizDados,
								"spreadsheets/RelatorioDisciplina.xls");
						ImprimirPlanilhaRelatorio.imprimeRelatorio("spreadsheets/RelatorioDisciplina.xls");
					} catch (IOException e2) {
						e2.printStackTrace();
					}
				}
			}
		});
		GridBagConstraints gbc_btnImprimirRelatorioDisciplina = new GridBagConstraints();
		gbc_btnImprimirRelatorioDisciplina.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnImprimirRelatorioDisciplina.insets = new Insets(0, 0, 0, 5);
		gbc_btnImprimirRelatorioDisciplina.gridx = 2;
		gbc_btnImprimirRelatorioDisciplina.gridy = 4;
		add(btnImprimirRelatorioDisciplina, gbc_btnImprimirRelatorioDisciplina);
	}

	private void carregarTabela(String nomeDisciplina) {
		String sql = "SELECT ALUNO.ra AS 'RA', ALUNO.nome_aluno AS 'Nome', FOLHA_DE_RESPOSTAS.nota AS 'Nota' FROM FOLHA_DE_RESPOSTAS\r\n"
				+ "JOIN ALUNO ON FOLHA_DE_RESPOSTAS.ra = ALUNO.ra\r\n"
				+ "JOIN GABARITO_OFICIAL ON FOLHA_DE_RESPOSTAS.codigo_gabarito = GABARITO_OFICIAL.cod_gabarito\r\n"
				+ "JOIN DISCIPLINA ON GABARITO_OFICIAL.codigo_disciplina = DISCIPLINA.cod_disciplina\r\n"
				+ "WHERE DISCIPLINA.nome_disciplina = '" + nomeDisciplina + "';";
		model = TableModelPatec.getModel(bd, sql);
		tabelaRelatorioAluno.setModel(model);

	}
}
