import org.openqa.selenium.WebDriver;


public class ProgramInternetExplorerDemo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.Internet Explorer.driver","C:\\Users\\hp\\eclipse-workspace\\Utkarshaa Classes March 2022\\Binary\\IEDriverServer.exe");
		
        WebDriver driver = (WebDriver) new ProgramInternetExplorerDemo();
        
        driver.get("https://www.youtube.com");
        driver.close(); 
	}
}
