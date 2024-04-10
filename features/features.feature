Feature: finding hosptials

  Scenario: Get doctor details and surgeries
    Given practo website is open and working
    When set location as chennai
    And set specialist as dentist
    And sort the patient stories
    And sort the experience
    And sort the fees and availability
    And sort one of the relevance
    Then print first five doctor details
    And click on surgeries
    Then print list of surgeries

  Scenario: validate demo form with invalid details
    Given practo website is open and working
    When taking demo form is open
    And set details for all fields
    Then check whether the submit button disabled or not

  Scenario: validate demo form with valid details
    Given practo website is open and working
    When taking demo form is opened
    And set valid details for all fields
    Then check whether the submit button enabled or not
    And check thank you message displayed
