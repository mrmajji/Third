import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirdClass {

	@Test
	public void method1() {
		
		System.out.println("GIT JENKINS intergration successful");
		
		WebDriver dr = new FirefoxDriver();
		
		dr.get("https://www.google.com");
		dr.close();
		
		System.out.println("Commited to git");
}
	
}