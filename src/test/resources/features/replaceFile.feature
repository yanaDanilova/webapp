Feature: Replace the old file with a new file

Scenario: Replace the old file with a new file in FUA
  Given I have a new file
  And I have the id of an old file
  When I upload the image file
  And I send the OLD id for update in FUA
  Then I get HTTP status 200
  And the file associated with the file id is deleted SUCCESSFULLY from the storage space of FUA
  And the uploaded file is saved SUCCESSFULLY into the storage space of FUA
  And the existing record containing the file information of the old file is updated with the new information in the database table
