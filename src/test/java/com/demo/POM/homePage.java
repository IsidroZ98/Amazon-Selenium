package com.demo.POM;

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

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[9]/div/div/span/div/div/div[2]/div[1]/h2/a")
    public WebElement firstItemXpath;

    public void searchedItemClick(){firstItemXpath.click();}

    @FindBy(id="add-to-cart-button")
    public WebElement addtoCartButton;

    public void addtoCartButtonClick(){addtoCartButton.click();}

    @FindBy(id="nav-cart")
    public WebElement navCart;

    public void navCartClick(){navCart.click();}

    //Save product link url
    // Use product link url that is saved during searchedItemClick
    //public String productUrl;
    //public void currentProductUrl(){productUrl = driver.getCurrentUrl();}

    @FindBy(id="sc-subtotal-label-activecart")
    public WebElement cartSubTotal;

    @FindBy(name="submit.delete.8106d6ba-6996-45e1-b7bf-981c5965cfad")
    public WebElement deleteButton;

    public void removeItemfromCart(){deleteButton.click();}
}
