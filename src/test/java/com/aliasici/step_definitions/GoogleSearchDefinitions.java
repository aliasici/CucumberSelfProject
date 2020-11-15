package com.aliasici.step_definitions;

import com.aliasici.utilities.ConfigurationReader;
import com.aliasici.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchDefinitions {


    @Given("browser is open")
    public void browser_is_open() {
        // https://www.google.com/
       Driver.getDriver().get("https://www.google.com");

    }

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("on google");
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        String search = ConfigurationReader.getProperty("searchValue");

        searchBox.sendKeys("apple watch" + Keys.ENTER);

    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("enter keyword");

    }

    @When("hits enter")
    public void hits_enter() {
        System.out.println("hit search button");

    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("see whatever enter");

    }

}
