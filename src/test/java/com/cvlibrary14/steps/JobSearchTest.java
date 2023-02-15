package com.cvlibrary14.steps;

import com.cvlibrary14.pages.HomePage;
import com.cvlibrary14.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static com.cvlibrary14.browserfactory.ManageBrowser.driver;

public class JobSearchTest {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Accept cookie$")
    public void iClickOnAcceptCookie() {
        driver.switchTo().frame("gdpr-consent-notice");
        new HomePage().clickOnAccept();
        driver.switchTo().defaultContent();
    }

    @And("^I click on more options$")
    public void iClickOnMoreOptions() {
        new HomePage().clickOnMoreoptions();
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new HomePage().clickOnSearchButton();
    }

    @Then("^I should navigate to \"([^\"]*)\" page$")
    public void iShouldNavigateToPage(String Result) {
        switch (Result) {
            case "Permanent Tester jobs in Harrow on the Hill":
                String actualMessage = new ResultPage().verifyResultText();
                String expectedMessage = "Permanent Tester jobs in Harrow on the Hill";
                Assert.assertEquals(actualMessage,expectedMessage);
                break;
            case "Permanent Developer jobs in Leicester":
                String actualMessage1 = new ResultPage().verifyResultText();
                String expectedMessage1 = "Permanent Developer jobs in Leicester";
                Assert.assertEquals(actualMessage1,expectedMessage1);
                break;
            case "Permanent Solderer jobs in Birmingham":
                String actualMessage2 = new ResultPage().verifyResultText();
                String expectedMessage2 = "Permanent Solderer jobs in Birmingham";
                Assert.assertEquals(actualMessage2,expectedMessage2);
                break;
            case "Permanent Quality Assurance jobs in Kent":
                String actualMessage3 = new ResultPage().verifyResultText();
                String expectedMessage3 = "Permanent Quality Assurance jobs in Kent";
                Assert.assertEquals(actualMessage3,expectedMessage3);
                break;
            case "Permanent Scrum Master jobs in Wellingborough":
                String actualMessage4 = new ResultPage().verifyResultText();
                String expectedMessage4 = "Permanent Scrum Master jobs in Wellingborough";
                Assert.assertEquals(actualMessage4,expectedMessage4);
                break;
            case "Part Time Support Advisor jobs in Manchester":
                String actualMessage5 = new ResultPage().verifyResultText();
                String expectedMessage5 = "Part Time Support Advisor jobs in Manchester";
                Assert.assertEquals(actualMessage5,expectedMessage5);
                break;
            case "Permanent Pharmacist jobs in Glasgow":
                String actualMessage6 = new ResultPage().verifyResultText();
                String expectedMessage6 = "Permanent Pharmacist jobs in Glasgow";
                Assert.assertEquals(actualMessage6,expectedMessage6);
                break;
        }
    }


    @And("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter location\"([^\"]*)\"$")
    public void iEnterLocation(String location){
        new HomePage().enterLocaion(location);
    }

    @And("^I select distance\"([^\"]*)\"$")
    public void iSelectDistance(String distance){
        switch (distance) {
            case "up to 5 miles":
                new HomePage().selectDistance(5);
                break;
            case "up to 7 miles":
                new HomePage().selectDistance(7);
                break;
            case "up to 10 miles":
                new HomePage().selectDistance(10);
                break;
            case "up to 15 miles":
                new HomePage().selectDistance(15);
                break;
        }
    }

    @And("^I enter min Salary\"([^\"]*)\"$")
    public void iEnterMinSalary(String MinimumSalary){
        new HomePage().enterMinSalary(MinimumSalary);
    }

    @And("^I enter max salary\"([^\"]*)\"$")
    public void iEnterMaxSalary(String MaximumSalary) {
        new HomePage().enterMaxSalary(MaximumSalary);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType ){
        new HomePage().selectsalaryTypeDropDown(salaryType);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType){
        new HomePage().selectJobTypeDropDown(jobType);
    }


}