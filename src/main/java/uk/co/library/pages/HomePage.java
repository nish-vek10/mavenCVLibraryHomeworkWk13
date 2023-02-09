package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement job;

    @FindBy(xpath = "//input[@id='location']")
    WebElement enterLocation;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    //Enter Job Title
    public void enterJobTitle(String jobTitle) {
        sendTextToElement(job, jobTitle); //call method from Utility class
    }

    //Enter Location
    public void enterLocation(String location) {
        sendTextToElement(enterLocation, location); //call method from Utility class
    }

    //Select Distance from Dropdown Menu
    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distanceDropDown, distance); //call method from Utility class
    }

    //Click on More Search Options
    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearchOptionsLink); //call method from Utility class
        log.info("Clicking on More Search Options: " + moreSearchOptionsLink.toString());
    }

    //Enter the value of Minimum Salary
    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary); //call method from Utility class
    }

    //Enter the value of Maximum Salary
    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary); //call method from Utility class
    }

    //Select a value from Dropdown Menu
    public void selectSalaryType(String salaryType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType); //call method from Utility class
    }

    //Select Job Type from Dropdown Menu
    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType); //call method from Utility class
    }

    //Click on Find Jobs Button
    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn); //call method from Utility class
    }
}