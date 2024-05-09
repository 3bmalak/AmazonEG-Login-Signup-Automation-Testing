package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    WebDriver driver;
    public SignIn(WebDriver driver){
        this.driver=driver;
    }
    By emailORphone=By.id("ap_email");
    By continueButton=By.id("ap_email");
    By password=By.xpath("//*[@id=\"ap_password\"]");
    By signInButton=By.xpath("//*[@id=\"ap_password\"]");
    By name=By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span");

    public void action(String phoneNumber,String password) throws InterruptedException {
        driver.findElement(this.emailORphone).sendKeys(phoneNumber);
        Thread.sleep(1000);
        driver.findElement(this.continueButton).click();
        Thread.sleep(3000);
        driver.findElement(this.password).sendKeys(password);
        Thread.sleep(1000);
        driver.findElement(this.signInButton).click();
    }

    public boolean checkifLoggedIn(){
        if(driver.findElement(name).getText()!="Hello, sign in")
            return true;
        else
            return false;
    }

}
