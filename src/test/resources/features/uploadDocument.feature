Feature: Upload Documents

Scenario: Upload a file into the FUA
  Given I have an image file
  When I upload the image file in FUA
  Then I get HTTP Status code 201
  And the uploaded file is saved SUCCESSFULLY into the storage space of FUA
  And a new record containing the file information is created as a new row in the database table


