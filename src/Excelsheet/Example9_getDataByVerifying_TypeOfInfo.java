package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example9_getDataByVerifying_TypeOfInfo 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		Cell cl = sh.getRow(2).getCell(0);
		CellType s2 = cl.getCellType();


		if(s2==CellType.STRING)
		{
		String value = cl.getStringCellValue();
		System.out.println(value);
		}
		else if(s2==CellType.NUMERIC)
		{
		double value = cl.getNumericCellValue();
		System.out.println(value);
		} 
		else if(s2==CellType.BOOLEAN)
		{
		boolean value = cl.getBooleanCellValue();
		System.out.println(value);
		}
	}
}
