Feature: Launch and application and click on Link

  Scenario: Launching eBay and click on Motors using Chrome
    Given user launches 'chrome' browser
    When user navigates using URL 'http://www.ebay.com/'
    Then user clicks on the link 'Motors'
	And user closes all the open browsers
	
  Scenario: Launching eBay and click on Motors using Firefox
    Given user launches 'firefox' browser
    When user navigates using URL 'http://www.ebay.com/'
    Then user clicks on the link 'Motors'
	And user closes all the open browsers