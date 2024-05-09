package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class SignUp {
    WebDriver driver;
    public SignUp(WebDriver driver){
        this.driver=driver;
    }


    By name=By.name("customerName");
    By phoneNumber=By.className("auth-require-phone-validation");
    By password1=By.className("//*[@id=\"ap_password\"]");
    By password2=By.className("//*[@id=\"ap_password_check\"]");
    By verifyPhone=By.id("continue");
    By afterVerification=By.xpath("//*[@id=\"auth-cookie-warning-message\"]/div/h4");

    public void action(String name,String phoneNumber,String password1,String password2) throws InterruptedException {
        driver.findElement(this.name).sendKeys(name);
        Thread.sleep(1000);
        driver.findElement(this.phoneNumber).sendKeys(phoneNumber);
        Thread.sleep(1000);
        driver.findElement(this.password1).sendKeys(password1);
        Thread.sleep(1000);
        driver.findElement(this.password2).sendKeys(password2);
        Thread.sleep(1000);
        driver.findElement(this.verifyPhone).click();
        Thread.sleep(15000);

    }
    public boolean alreadyLoggedInCheck(){
        if (!Objects.equals(driver.findElement(afterVerification).getText(), "Mobile number already in use"))
            return true;
        else
            return false;
    }




}
