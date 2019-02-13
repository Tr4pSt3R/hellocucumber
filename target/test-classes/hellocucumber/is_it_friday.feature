Feature: Is it Friday, yet?!
  Everyday's got to be a Friday

  Scenario Outline: Looking forward to Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<message>"

    Examples:
      | day    | message       |
      | Friday | It's Friyay!  |
      | Sunday | No, it's not! |
