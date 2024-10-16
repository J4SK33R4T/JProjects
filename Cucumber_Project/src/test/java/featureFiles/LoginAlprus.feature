Feature: Login Scenario.
  Scenario: Test Login Functionality with Valid Credentials.
    Given User should have Valid Username and Password
    Then User enter URL of Application
    And Enter Valid Username
    And Enter Valid Password
    When User click Login Button
    Then User is on HomePage

  Scenario: Test Login Functionality with Invalid Username and Valid Password
    Given User should have Invalid Username and Valid Password
    Then User enter URL of Application
    And Enter Invalid Username
    And Enter Valid Password
    When User click Login Button
    And User is not Logged In to Application

  Scenario:  Test Login Functionality with Valid Username and Invalid Password
    Given User should have Valid Username and Invalid Password
    Then User enter URL of Application
    And Enter Valid Username
    And Enter Invalid Password
    When User click Login Button
    And User is not Logged In to Application
