package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost/imagineris");
		driver.quit();
	}

}
