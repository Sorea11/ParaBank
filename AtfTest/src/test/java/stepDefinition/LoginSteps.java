package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver = null;

    @Given("user navigate to ui")
    public void navigateToUi() {
        System.out.println("User Navigates to ui");
        System.setProperty("webdriver.chrome.driver", "D:/sorin/AtfTest/AtfTest/src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.6pm.com/");
    }

    @When("user introduce the pass and login")
    public void insertPasswordAndLogin() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[3]/div/div/div/a/span")).click();
        System.out.println("apasa pe butonul omulet sa intre");
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[1]/div[3]/div[1]/ul/li[1]/a")).click();
        boolean sighIn = driver.getPageSource().contains("Sign-In");
        if (sighIn)
            System.out.println("sunteti pe pagina de logare");
        else
            System.out.println("NU sunteti pe pagina de logare ");
//introduci mail
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("email");
        //introduci parola
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("parola");

    }

    @And("user click the submit button")
    public void user_click_the_submit_button() {
        System.out.println("User is ok");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }

    @Then("user is redirect to home page")
    public void user_is_redirect_to_home_page() {
        System.out.println("User is redirect to home");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        driver.quit();
    }


}
