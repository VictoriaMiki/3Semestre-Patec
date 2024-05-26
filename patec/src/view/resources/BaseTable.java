package view.resources;

import javax.swing.table.AbstractTableModel;

public class BaseTable extends AbstractTableModel {
	private String[] columnNames = null;
	private Object[][] data = null;
	
	public BaseTable(String[] columnNames, Object[][] data) {
		super();
		this.columnNames = columnNames;
		this.data = data;
	}
	
	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return data.length;
	}

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Object getValueAt(int row, int col) {
		return data[row][col];
	}
}
