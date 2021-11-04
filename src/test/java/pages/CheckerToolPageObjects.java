package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static framework.base.DriverContext.driver;

public class CheckerToolPageObjects {
    private By clickAcceptCookiesBtn = By.id("nhsuk-cookie-banner__link_accept_analytics");
    private By clickStartBtn = By.id("next-button");
    private By clickWalesRadioBtn = By.id("radio-wales");
    private By enterDOBday = By.id("dob-day");
    private By enterDOBmonth = By.id("dob-month");
    private By enterDOByear = By.id("dob-year");
    private By clickNextBtn = By.id("next-button");
    private By clickPartnerQuestionRadioBtn = By.id("radio-yes");
    private By clickBenefitQuestionRadioBtn = By.id("radio-no");
    private By clickPregnancyQuestionRadioBtn = By.id("radio-no");
    private By clickInjuryQuestionRadioBtn = By.id("radio-no");
    private By clickDiabetesQuestionRadioBtn = By.id("radio-no");
    private By clickGlaucomaQuestionRadioBtn = By.id("radio-no");
    private By clickCareHomeQuestionRadioBtn = By.id("radio-no");
    private By clickInvestmentQuestionRadioBtn = By.id("radio-yes");


    public void setClickAcceptCookiesBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickAcceptCookiesBtn)).click();
        //driver.findElement(clickAcceptCookiesBtn).click();
    }
    public void setClickStartBtnBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickStartBtn)).click();
        //driver.findElement(clickStartBtn).click();
    }
    public void setClickWalesRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickWalesRadioBtn)).click();
        //driver.findElement(clickWalesRadioBtn).click();
    }
    public void setEnterDOBmonth(){
        driver.findElement(enterDOBmonth).sendKeys("08");
    }
    public void setEnterDOBday(){
        driver.findElement(enterDOBday).sendKeys("27");
    }
    public void setEnterDOByear(){
        driver.findElement(enterDOByear).sendKeys("1986");
    }
    public void setClickNextBtn(){
        driver.findElement(clickNextBtn).click();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
    }
    public void setClickPartnerQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickPartnerQuestionRadioBtn)).click();
        //driver.findElement(clickPartnerQuestionRadioBtn).click();
    }
    public void setClickBenefitQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickBenefitQuestionRadioBtn)).click();
        //driver.findElement(clickBenefitQuestionRadioBtn).click();
    }
    public void setClickPregnancyQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickPregnancyQuestionRadioBtn)).click();
        //driver.findElement(clickPregnancyQuestionRadioBtn).click();
    }
    public void setClickInjuryQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickInjuryQuestionRadioBtn)).click();
        //driver.findElement(clickInjuryQuestionRadioBtn).click();
    }
    public void setClickDiabetesQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickDiabetesQuestionRadioBtn)).click();
        //driver.findElement(clickDiabetesQuestionRadioBtn).click();
    }
    public void setClickGlaucomaQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickGlaucomaQuestionRadioBtn)).click();
        //driver.findElement(clickGlaucomaQuestionRadioBtn).click();
    }
    public void setClickCareHomeQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickCareHomeQuestionRadioBtn)).click();
        //driver.findElement(clickCareHomeQuestionRadioBtn).click();
    }
    public void setClickInvestmentQuestionRadioBtn(){
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(clickInvestmentQuestionRadioBtn)).click();
        //driver.findElement(clickInvestmentQuestionRadioBtn).click();
    }









}
