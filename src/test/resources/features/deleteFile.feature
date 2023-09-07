Feature: Delete Documents

Scenario: Delete a file from FUA
  Given I have a file Id
  When I send the id for delete in FUA
  Then I get HTTP status 200
  And the file associated with the file id is deleted SUCCESSFULLY from the storage space of FUA
  And the associated row containing the record of this file is deleted from the database table
