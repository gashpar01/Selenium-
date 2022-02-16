import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/BigHoss/Desktop/Repository GitHub/Selenium Automation/Automation Project/chromedriver.exe");
        // La linia 3 i-am spus sistemului unde sa gaseasca driver-ul
        WebDriver driver = new ChromeDriver();
        //Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
        driver.get("https://formy-project.herokuapp.com/checkbox");
        Thread.sleep(1000);
        driver.findElement(By.id("checkbox-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")).click();
        Thread.sleep(1000);
        driver.quit();

    }
}
