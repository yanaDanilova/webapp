Feature: See all the files uploaded by a particular user

Scenario: List all the files by user from FUA
  Given I have a user id
  When I send the user id to fetch all files by user id
  Then I get HTTP status 200
  And I get a list of records containing File name, location, and description from the database table based on user id
