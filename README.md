This is a API Test Automation framework for Sky 

Tools Used
Rest-assured 3.1.1
Cucumber 1.2.5
TestNG 6.10
Apache Maven 
Java 

**In TestRunner file**
tags used to run only group of scenarios or group of features
 if no tags specified it will run all the features
 
Command Line Execution:

Go to the root folder of the project in terminal and type 
“mvn clean”   -- to clean previous execution files
"mvn test"    -- to execute tests only 
"mvn verify"  -- to execute tests and generate reports

Reporting
maven-cucumber-reporting plugin used to generate the reports. 
Reports are in _/target/cucumber-reports/report.html_ directory after a successful run.

