Feature: Successful display of result page for different individual circumstances

  Background:
  Given Welsh user is on the NHS "checker tool" page

  Scenario: User successfully enters details to display results page
    When They put their individual circumstances into the checker tool
    Then They get a result of whether they can get help with health costs or not