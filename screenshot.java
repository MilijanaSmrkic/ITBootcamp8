package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Koristeci selenijum, napravi screenshot svog okacenog domaceg zadatka na
		// drajvu.
		// Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i sliku(screenshot).

		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.joberty.rs/");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		org.apache.commons.io.FileUtils.copyFile(scrFile, new File("C:\\tmp\\screenshot.png"));

	}

}
