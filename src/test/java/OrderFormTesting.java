import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderFormTesting {

    private WebDriver driver;


    @BeforeAll
    static void setUpAll(){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
    }


    @Test
    void test(){
        driver.get("http://localhost:9999");
        System.out.println();
    }




    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();

    }


    @AfterEach
    void tearDown(){
        driver.quit();
        driver=null;
    }
}
