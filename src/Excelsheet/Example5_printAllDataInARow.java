package Excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example5_printAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
		
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		 int lastCellIndex = sh.getRow(0).getLastCellNum()-1; 
		 
		 for(int i =0;i<=lastCellIndex;i++)
		 {
			 String value = sh.getRow(0).getCell(i).getStringCellValue();
			 System.out.println(value);
		 }
		 
	}
}
