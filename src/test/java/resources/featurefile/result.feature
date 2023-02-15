Feature: Result Test

  Scenario Outline: verify Job Search Result Using Different DataSet
    Given I am on Homepage
    When I click on Accept cookie
    And I enter job title "<jobTitle>"
    And I enter location"<location>"
    And I select distance"<distance>"
    And I click on more options
    And I enter min Salary"<MinimumSalary>"
    And I enter max salary"<MaximumSalary>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on search button
    Then I should navigate to "<Result>" page
    Examples:
      | jobTitle          | location       | distance       | MinimumSalary | MaximumSalary | salaryType | jobType   | Result                                        |
      | Tester            | Harrow         | up to 5 miles  | 30000         | 500000        | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill   |
      | developer         | Leicester      | up to 7 miles  | 40000         | 700000        | Per annum  | Permanent | Permanent Developer jobs in Leicester         |
      | Solderer          | Birmingham     | up to 10 miles | 2000          | 4000          | Per month  | Permanent | Permanent Solderer jobs in Birmingham         |
      | Quality Assurance | Kent           | up to 15 miles | 30000         | 500000        | Per annum  | Permanent | Permanent Quality Assurance jobs in Kent      |
      | Scrum Master      | wellingborough | up to 5 miles  | 60000         | 900000        | Per annum  | Permanent | Permanent Scrum Master jobs in Wellingborough |
      | Support advisor   | manchester     | up to 7 miles  | 20000         | 400000        | Per annum  | Part Time | Part Time Support Advisor jobs in Manchester  |
      | Pharmacist        | glasgow        | up to 10 miles | 2000          | 5000          | Per month  | Permanent | Permanent Pharmacist jobs in Glasgow          |
