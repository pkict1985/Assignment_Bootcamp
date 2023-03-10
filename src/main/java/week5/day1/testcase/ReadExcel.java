package week5.day1.testcase;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcel(String excelFileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wbook=new XSSFWorkbook("data/"+ excelFileName +".xlsx");
		XSSFSheet sheet=wbook.getSheetAt(0);
		//header row will be omied with the getLastrownum
		int rowCount=sheet.getLastRowNum();
		System.out.println("row" + rowCount);
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("col"+ columnCount);
		System.out.println(sheet.getRow(1).getCell(1));
		
		String[][] data=new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columnCount;j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
		}
		wbook.close();
		return data;
	}

}
