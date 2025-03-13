package tests;

import io.cucumber.java.en.*;

public class Login {
	
	
	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
	    
			System.out.println(">>User Navigated to Login Page >>");
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String emailAddressText) {
	   
		System.out.println(">>User enters_valid_email_address >>");

	}

	@And("User enters valid password {string}")
	public void user_enters_valid_password(String passwordText) {
	    
		System.out.println(">>User _enters_valid_password >>");
		
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		
		System.out.println(">>User clicks_on_login_button >>");
	   
	}

	@Then("User should Login successfully")
	public void user_should_login_successfully() {
		
		System.out.println("User_should_login_successfully");

	}
	
	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidEmail) {
		
		System.out.println(" user_enters_invalid_email_addres");

	    
	}

	@When("User enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPassword) {
		
		System.out.println("user_enters_invalid_password");
	    
	}

	
	@Then("User should get a proper error message")
	public void user_should_get_a_proper_error_message() {
		
		System.out.println("user_should_get_a_proper_error_message");
	   
	}

	@When("User don't enter any credentials")
	public void user_don_t_enter_any_credentials() {
		
		System.out.println("user_don_t_enter_any_credentials");
	   
	}

}
