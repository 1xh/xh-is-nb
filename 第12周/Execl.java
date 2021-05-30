package week13;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;



public class Execl {

	public static void main(String[] args) {
		try {
			File file = new File("G:/java/student.xls");
			Workbook workbook = Workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(0);
			int c = sheet.getColumns();
			int r = sheet.getRows();
			for (int i = 1; i < r; i++) {
				for (int j = 0; j < c; j++) {
					Cell cell = sheet.getCell(j, i);
					String s = cell.getContents();
					System.out.println(s);
				}
				System.out.println();
			}
			workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
