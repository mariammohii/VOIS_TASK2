import page.scrollHelper;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class OpenSite {
    ChromeDriver driver = new ChromeDriver();

    @BeforeTest
    public void openBrowser() throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Driver\\chromedriver.exe");
        //Set Browser resolution
        driver.manage().window().setSize(new Dimension(1024, 768));
        //Open amazon site
        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");

    }

    @Test
    public void ValidData() throws InterruptedException {
        // Navigate to the page
        scrollHelper.scrollDown(driver);

        // Wait for the slideshow element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        //select leaving from
        driver.findElement(By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")).sendKeys("CHIKKAMAGALURU");
        driver.findElement(By.xpath("//*[@id=\"fromCity_chosen\"]/a/span")).click();
        
        //select going to 
        driver.findElement(By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"frmSearch\"]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]")).sendKeys("BENGALURU");
        driver.findElement(By.xpath("//*[@id=\"toCity_chosen\"]/a/span")).click(); 
        
        //select date
        driver.findElement(By.xpath("//*[@id=\"imgDepartDate\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[2]/a")).click();
        
        //click search
        driver.findElement(By.xpath("//*[@id=\"submitSearch\"]")).click();
        
        //select seat 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[5]/div[7]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[8]")).click();
        
        //select Boarding point
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div")).click();
        
        //select Dropping point
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div")).click();
        
        //provide passenger details button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
        
        //input mobile number
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[2]/input[2]")).sendKeys("6789125987");
        
        //input email
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[3]/input[2]")).sendKeys("mariam.m.mohi@gmail.com");
        
        //click proceed
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[2]")).click();
        
        //input name
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[2]/input[2]")).sendKeys("mariam");
        
        //select gender
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Female");
        
        //select age
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[4]/input[2]")).sendKeys("23");
        
        //select concession
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[5]/input")).sendKeys("GENERAL PUBLIC");
        
        //id card
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[6]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("PAN");
        
        //id card number
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[7]/input[2]")).sendKeys("12345678901");
        
        //click checkout
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[2]")).click();
        
        //agree for terms
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div")).click();
        
        //click proceed to pay 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[2]/div/div/div[2]/div[2]/div[2]")).click();    
       
    }
    
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}