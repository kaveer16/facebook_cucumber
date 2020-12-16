Feature: HomePage
  As a user I want to click on click on create new account link

  @smoke
  Scenario: User should navigate to sign up page
    Given I am on home page
    And I click on accept cookies
    When I click on create new account link
    Then I should navigate to sign up page successfully

  @sanity
  Scenario: User should not login without entering Email ID
    Given I am on home page
    And I click on accept cookies
    And I enter password "Hellofacebook11"
    When I click on login button
    Then I should see error message
