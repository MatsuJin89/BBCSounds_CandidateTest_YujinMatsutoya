Feature: Sounds Homepage Tests

  Background:
    Given I open the BBC Sounds Homepage

  Scenario: Radio 1 and Radio 2 logos are displayed in the Listen Live module of the Sounds Homepage
    When I select the 'Listen' logo
    Then I am on the BBC Sounds Homepage
    And I can see the Radio 1 logo
    And I can see the Radio 2 logo
