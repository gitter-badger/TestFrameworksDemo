Feature: Hello World

  Scenario: Say hello
    Given I have a hello app with "Hey"
    When I ask it to say hi
    Then it should answer with "Hey World"
   
