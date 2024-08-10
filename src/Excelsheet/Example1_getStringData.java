package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	//navigate to excel path
		
	FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
	
	// //open excel 
	// Workbook book = WorkbookFactory.create(file); 
	//className.methodname(); 
	//
	// //navigate to specific sheet in a excel
	// Sheet sh = book.getSheet("Sheet1");
	//
	// //navigate to specific row in a sheet
	// Row rw = sh.getRow(0);
	//
	// //navigate to specific col in a row
	// Cell cl = rw.getCell(2);
	//
	// //get String data
	// String data = cl.getStringCellValue();
	// System.out.println(data);
	
	
	
}
}
