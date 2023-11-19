package introduction;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");

	}

}
