import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  ProgramChromeNewVersions
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Utkarsha Classes Selenium March 2022\\Binary\\chromedriver 103.0.5060.53.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.flipkart.com");
        
        driver.close();
	}
}
