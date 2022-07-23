import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ProgramMicrosoftEdge
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\hp\\eclipse-workspace\\Utkarshaa Classes March 2022\\Binary\\msedgedriver.exe");
		
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://www.Amazon.in");
        
        driver.close();
        
	}

}
