package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example4_getNumericDataAsAString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{ 
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
         
		String StringValue = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(StringValue);
	}
} 
