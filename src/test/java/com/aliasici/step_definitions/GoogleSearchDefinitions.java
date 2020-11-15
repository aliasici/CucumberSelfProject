package com.aliasici.step_definitions;

import com.aliasici.utilities.ConfigurationReader;
import com.aliasici.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
      //  WebElement googleHome = Driver.getDriver().findElement(By.className("ddlv-a"));
        //expected
        String expectedInTitle = "Google";
        //actual
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() throws InterruptedException {
        System.out.println("enter keyword");
        Driver.getDriver().findElement(By.name("q")).sendKeys("apple watch");
        Thread.sleep(2000);

    }

    @When("hits enter")
    public void hits_enter() {
        System.out.println("hit search button");
        Driver.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("see whatever enter");
        Driver.getDriver().getTitle().contains("Apple Watch");


    }

}
