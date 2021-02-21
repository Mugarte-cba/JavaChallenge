package ChallengeJava;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

  public static void main(String[] args) {
    WebDriver driver;
    System.setProperty(
      "webdriver.chrome.driver",
      "/Users/ugartemiguel/Desktop/UPC/Work/Test/Java/ChallengeJava/drivers/chromedriver"
    );
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    // driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.navigate().to("https://apprater.net/add/");
    driver
      .findElement(By.name("user-submitted-name"))
      .sendKeys("Miguel Ugarte");
    driver
      .findElement(By.name("user-submitted-email"))
      .sendKeys("miguel-ugarte@prueba.com");
    driver.findElement(By.name("user-submitted-title")).sendKeys("Image Title");
    driver
      .findElement(By.name("user-submitted-url[]"))
      .sendKeys("https://unsplash.com/photos/TxXuh_hAFd8");
    driver
      .findElement(By.name("user-submitted-content"))
      .sendKeys("My product is good");
    // driver.findElement(By.xpath("//*[@id=\"user-submitted-post\"]")).click();
  }
}
