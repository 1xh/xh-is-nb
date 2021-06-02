package Driver;

import java.io.File;

import Vo.Student2;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Week12_1 {
	public static void main(String[] args) {
		try{
			//Excel读出
			File file1 = new File("D:/Programming Files/Java_Program/Week_Nine/Student.xls");
			Workbook wk1 = Workbook.getWorkbook(file1);
			Sheet st1 = wk1.getSheet(0);
			
			//Excel写入
			File file2 = new File("./stuCouGrade.xls");  //保存在当前目录，准确的说是eclipse的工作区目录
			WritableWorkbook wk2 = Workbook.createWorkbook(file2);
			WritableSheet sheet1 = wk2.createSheet("Sheet1", 0);
			sheet1.addCell(new Label(0, 0, "输出结果："));
			
			for(int i=1; i<st1.getRows(); i++) {  //行--row
				for(int j=0; j<st1.getColumns(); j++) {  //列--col
					Cell c = st1.getCell(j,i);
					System.out.print(c.getContents()+"\t");
				}
				System.out.println();
			}
			
			for(int i=1; i<3; i++) {
				for(int j=0; j<2; j++) {
					sheet1.addCell(new Label(j, i, "hello"));
				}
			}
				
			wk1.close();
			wk2.write();
			wk2.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
