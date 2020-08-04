Feature: login feature
  @trial
  Scenario Outline: user should Login successfully with valid credentials
    Given user is on login page
    When user enter "<username>"
    And user enter password "<password>"
    And click on login button
    Then user should login successfully
    Examples:
      | username | password |
      |Admin    | admin123   |

  @test
    Scenario Outline: user should not able to login with invalid credentials
      Given user is on login page
      When user enter "<username>"
      And user enter password "<password>"
      And click on login button
      Then user should see "<this message>"

      Examples:
        | username | password | this message             |
        | krunal   | hdgdd    | Invalid credentials      |
        |          | hbcdvg   | Username cannot be empty |
        | krunal   |          | Password cannot be empty |