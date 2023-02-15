package com.cvlibrary14.pages;

import com.cvlibrary14.utility.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ResultPage extends Helper {


    @FindBy(xpath = "//div[@class='search-header__left']//h1")
    WebElement resultText;

    public String verifyResultText(){
        return getTextFromElement(resultText);
    }

}
