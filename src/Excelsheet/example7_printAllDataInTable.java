package Excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import graphql.language.Value;

public class example7_printAllDataInTable
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\sunil\\OneDrive\\Desktop\\Java Notes\\Selinum\\XPATH\\Sheet.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");

		int lastrowindex = sh.getLastRowNum();
		for(int i=0;i<=lastrowindex;i++)
		{
			int lastindex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastindex;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}

			System.out.println();

		}


	}
}