package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.CheckerToolPageObjects;
import pages.LandingPage;

public class NHScheckerToolSteps {

    LandingPage landingpage = new LandingPage();
    CheckerToolPageObjects checkertool = new CheckerToolPageObjects();

    @Given("Welsh user is on the NHS {string} page")
    public void welshUserIsOnTheNHSPage(String arg0) {
        landingpage.launchBaseUrl();
        checkertool.setClickAcceptCookiesBtn();


    }

    @When("They put their individual circumstances into the checker tool")
    public void theyPutTheirIndividualCircumstancesIntoTheCheckerTool() {
        checkertool.setClickStartBtnBtn();
        checkertool.setClickWalesRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setEnterDOBday();
        checkertool.setEnterDOBmonth();
        checkertool.setEnterDOByear();
        checkertool.setClickNextBtn();
        checkertool.setClickPartnerQuestionRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setClickBenefitQuestionRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setClickPregnancyQuestionRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setClickInjuryQuestionRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setClickDiabetesQuestionRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setClickGlaucomaQuestionRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setClickCareHomeQuestionRadioBtn();
        checkertool.setClickNextBtn();
        checkertool.setClickInvestmentQuestionRadioBtn();
        checkertool.setClickNextBtn();







    }
}
