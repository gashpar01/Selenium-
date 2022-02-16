import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/BigHoss/Desktop/Repository GitHub/Selenium Automation/Automation Project/chromedriver.exe");
   // La linia 3 i-am spus sistemului unde sa gaseasca driver-ul
        WebDriver driver = new ChromeDriver();
        //Aici am creat un nou obiect al clasei chrome driver care se numeste driver si care are tipul de date webdriver.
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        //Aici am deschis linkul din paranteze
        driver.findElement(By.id("autocomplete"));
        //Aici identificam prin intermediul id-ul elementul textbox in care se poate pune id-ul
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        //Elementul este salvat intr-o variabila autocomplete
        autocomplete.sendKeys("strada lalelelor nr 5");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/table/tr/td[2]/button")).click();

    /* O variabila este o adresa de memorie la care sunt stocate informatii
    O functie reprezinta un set de instructiuni grupate sub un singur nume
    O clasa reprizinta un tipar care defineste atributele pe care trebuie sa le aibe un obiect si actiunile pe care poate sa le faca
    Un obiect este o instanta a unei clase adica o reprezentare reala creata pe baza tiparului definita in clasa
    Un tip de data este o proprietate a unei variabile sau functii care specifica ce informatie poate fi stocata in variabila sau returnata de catre functie
    Putem spune ca o functie returneaza ceva atunci cand trimite rezultatul actiunii pe care o face catre exterior
     */
    }
}
