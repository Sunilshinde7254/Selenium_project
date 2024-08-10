package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example6_printAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex = sh.getLastRowNum();
		for(int i=0; i<=lastRowIndex; i++)
		{
		String value = sh.getRow(i).getCell(2).getStringCellValue();
		System.out.println(value);
		}
		
		 
	}
}
