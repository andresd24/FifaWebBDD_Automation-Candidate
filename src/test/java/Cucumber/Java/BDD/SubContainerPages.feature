Feature: Fifa 2020 web app different sub pages content
  The content of each of the main subsections that are loaded by the NavBar

  Scenario: Validate the title of the Teams Subsection
  
    Given The user opens a Browser and navigates to the Fifa 2020 app root URL
		Then Validate that the Welcome Page loads correctly
    When The user clicks on Teams option of the Navigaion Bar
		And The user closes the browser session
     
     
Scenario:  Validate button that Appears After Delay    
    Given The user opens a Browser and navigates to the Fifa 2020 app root URL
		Then Validate that the Welcome Page loads correctly
		When The user navigates to the Store page from the NavBar
# implement challenge 2
		When The user presses delayed button and waits 20 seconds the text to appear
 		And The user closes the browser session