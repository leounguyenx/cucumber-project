# cucumber-project

v1.0: This version is about to test login to an app with valid credential using Cucumber, Selenium WebDriver (Java), TestNG. It also generates the test report in HTML format.

Very first steps to start implement BDD with Cucumber
1) Setup
   Add mvn dependencies to pom.xml including: Cucumber.java, Cucumber.TestNG, TestNG, Selenium WebDriver
2) Create Feature folder:
   The structure in this version following: Feature -> Scenario -> Given,When,And,Then
   We will manage all the feature files in this folder
   File type: .feature (Eg: login.feature)
In order to execute these feature files, we need to define the implementation steps
3) Create Step Definitions folder:
   We will create a java class to implement all the steps of this login feature using Selenium WebDriver
4) Generate the Test Report:
   To generate the test report, create a folder name TestRunner then import the io.cucumber.testng.CucumberOptions
   To let the program run correctly, we define an annotation below:
   @CucumberOptions(tags = "",
        features = {"src/test/java/resources/features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/report/htmlreport.html"})
   *In this version, I haven't used the tags yet, so let skip it for now
   "features" is for where it gets the feature files to run -> I will use the "features" folder, so all the feature files will be reported
   "glue" is for where it gets the feature files's implementation
   "plugin" is for where we want to save and it will create an HTML file report after finishing tests.

   v1.1: This version is about to improve test by applying parameterization and data-driven

   Context: In v1.0, I have applied a fixed data for username and password, but in real-life case, we have to test the same test scenario multiple times with different sets of data.
   1) Data-driven
   So, Cucumber will help us with Examples tables in the "Scenario Outline" or by fetching data from external sources. But in this version, we only focus on Examples tables
   The Examples table provides multiple sets of data, and the scenario runs once each row in the table
   <See in the login.feature file>

   2) Parameterization
      In login.feature file, in order to use the dynamic data from Examples table, we define the placeholders and pass the dynamic data into step definitions, reducing the redundancy and enhance the flexibily of the data.
      Eg: "<username>", "<password>"

      We also need to modify the implementation to passing the value to the input field when program runs
      
   
   
