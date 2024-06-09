package util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;

public class GeraPlanilhaRelatorio {
	public static void planilhaRelatorioAluno(Map<Integer, Object> matrizDados, String excelFilePath)
			throws IOException {
		Workbook workbook = new HSSFWorkbook();

		Sheet sheet = workbook.createSheet();
		sheet.setColumnWidth(1, 10 * 256);
		sheet.setColumnWidth(2, 3 * 256);

		int rowCount = 0;

		for (int i = 0; i < matrizDados.size(); i++) {
			Row row = sheet.createRow(++rowCount);
			gravarDadosRelatorioAluno((ArrayList<Object>) matrizDados.get(i), row, sheet);
		}

		try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
			workbook.write(outputStream);
		}

		workbook.close();
	}

	private static void gravarDadosRelatorioAluno(ArrayList<Object> dados, Row linha, Sheet sheet) {
		for (int i = 0; i < 2; i++) {
			Cell celula = linha.createCell(i + 1);

			if (i == 0) {
				celula.setCellValue((String) dados.get(0));
			} else {
				int nota = (int) dados.get(1);
				celula.setCellValue(nota);
			}

			CellRangeAddress region = new CellRangeAddress(celula.getRowIndex(), celula.getRowIndex(),
					celula.getColumnIndex(), celula.getColumnIndex());
			RegionUtil.setBorderTop(BorderStyle.THIN, region, sheet);
			RegionUtil.setBorderBottom(BorderStyle.THIN, region, sheet);
			RegionUtil.setBorderLeft(BorderStyle.THIN, region, sheet);
			RegionUtil.setBorderRight(BorderStyle.THIN, region, sheet);

		}

	}

	public static void planilhaRelatorioDisciplina(Map<Integer, Object> matrizDados, String excelFilePath)
			throws IOException {
		Workbook workbook = new HSSFWorkbook();

		Sheet sheet = workbook.createSheet();
		sheet.setColumnWidth(1, 15 * 256);
		sheet.setColumnWidth(2, 50 * 256);
		sheet.setColumnWidth(3, 3 * 256);

		int rowCount = 0;

		for (int i = 0; i < matrizDados.size(); i++) {
			Row row = sheet.createRow(++rowCount);
			//System.out.println(row.getRowNum());
			gravarDadosRelatorioDisciplina((ArrayList<Object>) matrizDados.get(i), row, sheet);
		}

		try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
			workbook.write(outputStream);
		}

		workbook.close();
	}

	private static void gravarDadosRelatorioDisciplina(ArrayList<Object> dados, Row linha, Sheet sheet) {
		for (int i = 0; i < 3; i++) {
			Cell celula = linha.createCell(i + 1);

			if (i == 0) {
				celula.setCellValue((String) dados.get(0));
			} else if (i == 1) {
				celula.setCellValue((String) dados.get(1));
			} else {
				int nota = (int) dados.get(2);
				celula.setCellValue(nota);
			}

			CellRangeAddress region = new CellRangeAddress(celula.getRowIndex(), celula.getRowIndex(),
					celula.getColumnIndex(), celula.getColumnIndex());
			RegionUtil.setBorderTop(BorderStyle.THIN, region, sheet);
			RegionUtil.setBorderBottom(BorderStyle.THIN, region, sheet);
			RegionUtil.setBorderLeft(BorderStyle.THIN, region, sheet);
			RegionUtil.setBorderRight(BorderStyle.THIN, region, sheet);

		}

	}

}
