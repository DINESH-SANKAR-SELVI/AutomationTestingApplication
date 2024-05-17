package com.DINESH.AutomationTestingApplication;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutomationTestingApplicationTests {

	@Autowired
	public WebDriver webDriver;

	@Value("${application.URL}")
	private String ApplicationLocation;

//	@Autowired
//	private MainPage mainPage;

	@Test
	void performTest(){
		webDriver.get(ApplicationLocation);
		System.out.println(webDriver.getTitle());

		WebElement searchBox = webDriver.findElement(By.name("q"));
		searchBox.sendKeys("OpenAI ChatGPT");
		searchBox.sendKeys(Keys.RETURN);

		// Optionally, wait for results and validate the results
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Validate the title of the page
		String pageTitle = webDriver.getTitle();
		assert pageTitle.contains("OpenAI ChatGPT");

		// Close the browser
		webDriver.quit();

//		mainPage.performLogin();
	}

}
