package DataDrivenFrameWork;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	
		// TODO Auto-generated method stub
      public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo)
      
      FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet(sheetName);
		
		Row row = sheet.getRow(rowNo);
		
		Cell cell = row.getCell(cellNo);
		
		String data = cell.getStringCellValue();
		
      return data;
      
	}
      {
    	 
		
	}

}
