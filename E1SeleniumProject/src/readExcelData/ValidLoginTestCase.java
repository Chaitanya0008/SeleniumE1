package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String usnData = cell.getStringCellValue();
		
		FileInputStream fis1 = new FileInputStream("./data/testData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis);
		Sheet sheet1 = wb.getSheet("validcreds");
		Row row1 = sheet.getRow(1);
		Cell cell1 = row.getCell(1);
		String pwdData = cell.getStringCellValue();
		
		WebDriver driver = new EdgeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bluestone.com/");
		
		
		FileOutputStream fos = new FileOutputStream("./data/testData.xlsx");
		wb.write(fos);
	}

}
