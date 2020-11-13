package utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

@Test
public class screenshot {

	private static final DateFormat sdfFolder = new SimpleDateFormat("yyyy-MM-dd");
	private static final DateFormat sdfFile = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
	

	public static String capture(WebDriver driver) throws IOException {
		Date date = new Date();
		String dateNameFolder = sdfFolder.format(date);
		String dateNameFile = sdfFile.format(date);
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../Report/Failure_Screenshot"+dateNameFolder+"/Error_"+dateNameFile+".jpg");
		String errFlPath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errFlPath;
	}

}

