Feature: Form automation
  As a user I want to fill my form
  also I submit it

  Scenario Outline: Form filling and submition
    Given user navigates to the app url
    Then user  fills first name with value "<firstname>"
    Then  user fills last name with value "<lastName>"
    Then  user fills gender this
    Then  user fills date of birth with value "<01.04.1999>"
    Then  user fills address
    Then  user fills email with value "<test@yahoo.com>"
    Then  user fills password with value "<durak13>"
    Then  user fills company
    Then  user fills Role
    When user fills Job
    When user fills CheckboxOne
    When user fills CheckboxTwo
    When user fills Comments
    When user submit form
    When user check form is submitted
    When user reload page

    Examples:
      | firstname | lastName  |01.04.1999|test@yahoo.com|durak13|
      | Ivan      | Ivanov    |02.11.2001|test2@gmail.com|durak12|
      | Iryna     | Petrova   |03.07.1985|test3@gmail.com|durak11|
      | Anya      | Titov     |04.05.2003|test4@gmail.com|durak10|




