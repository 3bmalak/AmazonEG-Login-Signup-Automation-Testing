import Navigatetor.Navigatetor;
import Pages.SignIn;
import Pages.SignUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Home {
    WebDriver driver;
    Navigatetor navigatetor;
    SignUp signUp;
    SignIn signIn;

    @BeforeClass()
    public void setupDriver(){
        driver=new EdgeDriver();
        navigatetor=new Navigatetor(driver);
        driver.get("https://www.amazon.eg/");
    }

    @Test(priority =0)
    public void openSignupScreen() throws InterruptedException {
        Thread.sleep(3000);
        navigatetor.toSignUp();
    }

    @Test(priority = 1,dataProvider = "signupData")
    public void signup(String name,String phoneNumber,String password1,String password2,int index) throws InterruptedException {
       signUp=new SignUp(driver);
        navigatetor=new Navigatetor(driver);

       signUp.action(name,phoneNumber,password1,password2);
       Thread.sleep(5000);
       if (signUp.alreadyLoggedInCheck()&&index!=2){
           navigatetor.reSignup();
       }
       if (index==2)
           navigatetor.toSignIn();

    }

    @Test(priority = 2,dataProvider = "signinData")
    public void signin(String phoneNumber,String password) throws InterruptedException {
    signIn=new SignIn(driver);
    signIn.action(phoneNumber,password);
    Thread.sleep(2000);
    if(signIn.checkifLoggedIn()){
        navigatetor.logout();
        navigatetor.toAcount();
    }


    }
    @AfterClass
    public void closeDriver(){
        driver.close();
    }
}
