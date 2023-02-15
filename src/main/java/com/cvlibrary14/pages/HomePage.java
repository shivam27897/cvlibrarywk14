package com.cvlibrary14.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cvlibrary14.utility.Helper;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class HomePage extends Helper {

    private static final Logger log = LogManager.getLogManager().getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "keywords")
    WebElement jobTitle;
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement accept;
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @FindBy(id = "distance")
    WebElement distanceDropDown;
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;


    public void enterJobTitle(String title){
        sendTextToElement(jobTitle,title);
    }
    public void clickOnAccept(){
        clickOnElement(accept);
    }
    public void enterLocaion(String postcode){
        sendTextToElement(location,postcode);
    }
    public void selectDistance(int value){
        selectByValueFromDropDown(distanceDropDown, String.valueOf(value));
    }
    public void clickOnMoreoptions(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSal){
        sendTextToElement(salaryMin,minSal);
    }
    public void enterMaxSalary(String maxSal){
        sendTextToElement(salaryMax,maxSal);
    }
    public void selectsalaryTypeDropDown(String value1){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,value1);
    }
    public void selectJobTypeDropDown(String value2){
        selectByVisibleTextFromDropDown(jobTypeDropDown,value2);
    }
    public void clickOnSearchButton(){
        clickOnElement(findJobsBtn);
    }

}
