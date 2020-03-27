package Petanedelja;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniummetode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pomocu jave i seleniuma Otvoriti novi prozor u pretrazivacu i otici na IT
		 * Bootcamp Primeniti metode koje smo vezbali na casu (get URL i Title, navigate
		 * - refresh, to, back, forward) U kodu treba da se prozor maksimizuje, a pre
		 * zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice
		 * okruzenja, ako to ne pomaze )
		 */

		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://itbootcamp.rs/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		String PageTitle = driver.getTitle();
		System.out.println("Naziv naslova je " + PageTitle);
		driver.manage().window().setPosition(new Point(0, -1000));
		// metoda koja vraca duzinu naslova

		int PageLength = PageTitle.length();
		System.out.println("Duzina naslova je " + PageLength);
		driver.close();

	}

}
