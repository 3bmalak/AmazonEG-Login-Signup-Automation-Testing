package Navigatetor;

import Pages.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;

import static java.lang.Thread.sleep;

public class Navigatetor {
    WebDriver driver;
    public Navigatetor(WebDriver driver){
        this.driver=driver;
    }

    By account=By.className("nav-line-1-container");
    By signUp=By.id("createAccountSubmit");
    By signIn=By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]/div[2]/div[1]/a");
    By resignUp=By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[2]/div[4]/div/a");
    By logout=By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[2]/a[11]/span");

    public void toAcount() throws InterruptedException {

        driver.findElement(account).click();
        Thread.sleep(3000);
    }

    public void toSignUp() throws InterruptedException {
        toAcount();
        driver.findElement(signUp).click();
        sleep(3000);
    }


    public void toSignIn() throws InterruptedException {
        driver.findElement(signIn).click();
        sleep(3000);
    }

    public void logout() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(account)).perform();
        sleep(1000);
        driver.findElement(logout).click();
        sleep(3000);
    }

    public void reSignup() throws InterruptedException {
        driver.findElement(resignUp).click();
        sleep(3000);
    }


}
