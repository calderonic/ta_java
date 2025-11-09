package stepdefinitions;

import com.google.inject.Inject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginSteps {

    @Inject
    LoginPage loginPage;
    @Inject
    ProductsPage productsPage;

    @When("User clicks the Login button without entering any credentials")
    public void userClicksTheLoginButtonWithoutEnteringAnyCredentials() {
        loginPage.clearUsername();
        loginPage.clearPassword();
        loginPage.clickLogin();
    }

    @Then("User see an error message {string} displayed")
    public void userSeeAnErrorMessageDisplayed(String errorMessage) {
        Assert.assertTrue(loginPage.getErrorMessage().contains(errorMessage),
                "The expected error message should be displayed");
    }

    @When("User enter a valid username {string} and leaves the password empty")
    public void userEnterAValidUsernameAndLeavesThePasswordEmpty(String username) {
        loginPage.typeUsername(username);
        loginPage.clearPassword();
    }

    @And("User click the Login button")
    public void userClickTheLoginButton() {
        loginPage.clickLogin();
    }

    @When("User enter with username {string} and password {string}")
    public void userLogsInWithUsernameAndPassword(String username, String password) {
        loginPage.typeUsername(username);
        loginPage.typePassword(password);
    }

    @Then("User should be redirected to the Products page")
    public void userShouldBeRedirectedToTheProductsPage() {
        Assert.assertTrue(productsPage.state().isDisplayed(),
                "Products Page was not displayed");
    }

    @And("the page title should be {string}")
    public void thePageTitleShouldBe(String expectedTitle) {
        Assert.assertEquals(productsPage.getTitleLogo(), expectedTitle,
                "The Page title should be equals");
    }
}
