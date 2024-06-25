package com.revature.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage {
    private WebDriver driver;
    private final String pageURL = "https://www.amazon.com/";

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //open home page
    public void openPage(){
        driver.get(pageURL);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBar;

}
