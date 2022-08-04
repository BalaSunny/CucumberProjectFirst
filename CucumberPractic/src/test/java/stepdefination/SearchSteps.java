package stepdefination;

import implementation.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	Product product;
	
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1 I am on search page");
	    
	}

	@When("I search peoduct with namr {string} and price {int}")
	public void i_search_peoduct_with_namr_and_price(String productName, Integer price) {
		System.out.println("Step 2 I am search with product Name"+ productName + "price:"+price );
		
		product = new Product(productName,price);
	    
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String produceName) {
		System.out.println("Step 3 I search peoduce name:"+ produceName);
		
	   
	}

	
	
	

}
