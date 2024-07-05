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

    public void searchItemOnSearchBar(String searchItem)
    {
        searchBar.sendKeys(searchItem);
    }
    @FindBy(id="nav-search-submit-button")
    public WebElement searchBarSubmitButton;

    public void searchBarSubmitButton()
    {
        searchBarSubmitButton.click();
    }
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/span/div/div/h2")
    public WebElement resultsXpath;


}
