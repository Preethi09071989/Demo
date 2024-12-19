package org.step.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.Runner_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin {
    public static WebDriver driver = Runner_class.driver;
    
	
	@Given("Login Page")
	public void login_page() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		System.out.println("Login Page Launched");
		
	    
	}

	@Given("I have already registered with this application")
	public void i_have_already_registered_with_this_application(){
	    System.out.println("I have already registered with this application");
	    	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		
		driver.findElement(By.id("username")).sendKeys("PREETHI89");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("login")).click();
	}

	@Then("My profile page should open after successful login")
	public void my_profile_page_should_open_after_successful_login() {
		System.out.println("My profile page should open after successful login");
	}

	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("PREETHI8");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("login")).click();
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String string) {
		System.out.println("Login unsuccessful due to " + string);
	    
	}




}
