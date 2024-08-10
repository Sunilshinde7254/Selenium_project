package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eexample1_getBooleanDatax3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
		System.out.println(value);
	}
	
}
