import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProgramFirefox
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecho.driver","C:\\Users\\hp\\eclipse-workspace\\Utkarshaa Classes March 2022\\Binary\\geckodriver.exe");
		
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://www.shopee.com");
        
        driver.close();
        }
}
