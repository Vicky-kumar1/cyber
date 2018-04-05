package genric;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AL {
	public static String getPhoto(WebDriver driver,String Folder,String name)
	{
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		String dt=new Date().toString().replaceAll(":","-");
		String path=Folder+name+dt+".png";
		File destFile=new File(path);
		try {
			FileUtils.copyFile(srcFile,destFile);
		}
		catch(Exception e) {}
		return path;
	}


public static String getproperty(String path,String key)
{
	String v=" ";
	try {
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		v=p.getProperty(key);
	}
	catch(Exception t) {}
	
	return v;
}
	
}