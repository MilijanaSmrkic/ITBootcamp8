package Petanedelja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dodatni zadatak Selenium Pomocu jave i seleniuma otvoriti
		 * pretrazivac i otici na Youtube. Pet puta kliknuti na dugme refresh, i tek
		 * onda zatvoriti pretrazivac.
		 */
		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/?hl=sr&gl=RS");
		for (int i = 0; i <= 5; i++) {
			driver.navigate().refresh();
		}
		driver.close();

	}

}
