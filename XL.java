package genric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

public class XL {
public static String getCeLLValue(String path,String sheet,int r,int c)
{
	String v=" ";
	try {
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
	}
	catch(Exception e){}
	return v;
}


public static int getRowCount(String path,String sheet)
{
	int vc=0;
	try {
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		vc=wb.getSheet(sheet).getLastRowNum();
	}
	catch(Exception e){}
	return vc;
}
}