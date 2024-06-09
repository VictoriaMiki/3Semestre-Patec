package util;

import java.awt.Desktop;
import java.io.File;

public class ImprimirPlanilhaRelatorio {
	public static void imprimeRelatorio(String excelFilePath) {
		Desktop desktop = Desktop.getDesktop();
		try {
			desktop.print(new File(excelFilePath));
		} catch (Exception e) {
		}
	}
}
