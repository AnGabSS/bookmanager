# language: en
Feature: User registration
  As an API user
  I want to register a new user
  So that the record is saved correctly in the system

  Scenario: Successful user registration
    Given I have the following user data:
      | field    | value            |
      | name     | Jean Luc Gordard    |
      | email    | gordad@example.com |
      | password | alphaville123         |
      | type     | ADMIN            |
    When I create a UserResponse object for the registered user
    Then the UserResponse object should contain the following details:
      | field | value            |
      | id    | 1                |
      | name  | Jean Luc Gordard    |
      | email | gordad@example.com |
      | type  | ADMIN            |