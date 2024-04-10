package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SurgeriesPage extends BasePage {

	public SurgeriesPage(WebDriver driver) {
		super(driver);
		
	}
	//locating surgiers link from home page
	//*[@id="container"]/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[5]/a/div[1]
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[5]/a/div[1]")
	WebElement surgriesIcon;
	
	//locating surgeries link 
	@FindBy(xpath="//*[@id='container']/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div[5]/a/div[1]")
	public WebElement surgeries;
	
	//locating forcorporates
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/div[1]/div/div[3]/div/div[3]/div[1]/span/span[2]")
	public WebElement forcoperates;
	
	
	//locating healthwellness
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/div[1]/div/div[3]/div/div[3]/div[1]/span/div/div[1]/a")
	public WebElement healthwellness;
	
	
	@FindBy(xpath="//*[@id=\"surgeries\"]/div/div[1]/div/div/div/div/p")
	List<WebElement> listofSurgeries;
	
	//locating popular Surgeries
	@FindBy(xpath="//*[@id=\"surgeries\"]/div/div[1]/div/h1")
	public WebElement popularSurgeries;

    public void surgiersClick() {
    	surgriesIcon.click();
    }
    
    public void printSurgiers() {
    	for(WebElement ele:listofSurgeries) {
    		System.out.println(ele.getText());
    	}
    }
    
    public void openForm() throws InterruptedException {
    	forcoperates.click();
    	Thread.sleep(2000);
    	healthwellness.click();
    }
}
