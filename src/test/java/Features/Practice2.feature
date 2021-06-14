@sanity
Feature: User should be able to login Tutorial Site

  Scenario Outline: user should  able to go to next page;

    Given  User wants to go to login site
    When  user enter "<firstname>" and "<lastname>"
    And fill up all the credential and pass "<date>"
    And  fill up other forms
    Then  user should able to go next page
    Examples:
      |firstname||lastname|      |date|

      |john||smith|              |04/05/2021|
      |niraj||shakya|            |08/11/1999|

  Scenario Outline: user should  able to go to next page;

    Given  User wants to go to login site
    When  user enter "<firstname>" and "<lastname>"
    And fill up all the credential and pass "<date>"
    And  fill up other forms
    Then  user should able to go next page
    Examples:
      |firstname||lastname|      |date|

      |john||smith|              |04/05/2021|
      |niraj||shakya|            |08/11/1999|

  Scenario Outline: user should  able to go to next page;

    Given  User wants to go to login site
    When  user enter "<firstname>" and "<lastname>"
    And fill up all the credential and pass "<date>"
    And  fill up other forms
    Then  user should able to go next page
    Examples:
      |firstname||lastname|      |date|

      |john||smith|              |04/05/2021|
      |niraj||shakya|            |08/11/1999|

