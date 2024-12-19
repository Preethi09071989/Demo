package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Hp\\eclipse-workspace\\MavenProject\\src\\test\\java\\org\\fb\\feature\\Adactin.feature",glue = "org.step.definition", publish = true, plugin = "html:target/cucumber-reports.html" )

public class Runner_class {
	public static WebDriver driver;
    @BeforeClass
	public static void Browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser Launched Successfully");
		
	}
    @AfterClass
	public static void Browserclose() {
		driver.close();
		System.out.println("Browser Closed Successfully");
	}
	}

