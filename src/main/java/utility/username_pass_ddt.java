package utility;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class username_pass_ddt {
	
	public static String pass_string;
	public static String un_num;
	public String getDataFromExcelSheet(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSeleniumMaven\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		//String val1= book.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return un;
	}
	
	public String getDataFromExcelSheetphnno(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSeleniumMaven\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String number= NumberToTextConverter.toText(book.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue());
		return number;
	}
	
	public void getDataFromExcelSheet1(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewSeleniumMaven\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Cell num= book.getSheet(sheetname).getRow(row).getCell(cell);
		if(num != null && num.getCellType() == CellType.NUMERIC) {
			un_num= NumberToTextConverter.toText(book.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue());
		}
		else {
			pass_string= book.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		}
	}
}