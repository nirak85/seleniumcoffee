
Feature: user need to fill the practice form

  Scenario: Valid user should be able to fill the practice form

    Given User should be able to fill the form as a valid user
    When User entered Firstname "Leticia" Lastname "Martins"
    And User complete all the text field and enterd date "06-04-2021"
    Then User should be in next page

  Scenario: Valid user should be able to fill the practice form

    Given User should be able to fill the form as a valid user
    When User entered Firstname "Mathew" Lastname "Gartham"
    And User complete all the text field and enterd date "04-04-2021"
    Then User should be in next page

  Scenario: Valid user should be able to fill the practice form

    Given User should be able to fill the form as a valid user
    When User entered Firstname "Leo" Lastname "Wilson"
    And User complete all the text field and enterd date "06-22-2021"
    Then User should be in next page