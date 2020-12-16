Feature: Registration
  As a user I want to register into facebook website
  @regression
  Scenario Outline: User should be able to enter registration details and successfully click on sign up button
    Given I am on home page
    And I click on accept cookies
    And I click on create new account link
    And I enter first name "Kaveer"
    And I enter surname "Aryan"
    And I enter email address "<email address>"
    And I re enter email address "<re enter email address>"
    And I enter passWord "Hellofacebook11"
    And I enter Day "12"
    And I enter Month "Decemeber"
    And I enter Year "1985"
    And I select Male option
    Then I should be able to click on sign up button
    Examples:
      |  email address          | re enter email address |
      | abcd123@gmail.com       |  abcd123@gmail.com     |
      | kaveer3737@gmail.com    |  kaveer3737@gmail.com  |
      | xyz123@gmail.com        |  xyz123@gmail.com      |
      | kaveer3787@gmail.com    |  kaveer3787@gmail.com  |




