package com.demo;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.POM.homePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",

        glue = "com.demo.steps",
        plugin = {
                "pretty"
        }
)

public class TestDriver {
    public static WebDriver driver;
    public static homePage homePage;
    @BeforeClass
    public static void setup()
    {
        //File chromedriver = new File("src/main/resources/chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());
       setupDriver();
       driver = new ChromeDriver();
       homePage = new homePage(driver);


    }
    public static void setupDriver()
    {
        WebDriverManager.chromedriver().setup();
    }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
