package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LoginPage extends Form {

    public LoginPage() {
        super(By.id("login_button_container"), "Page Login SauceDemo");
    }
    private final ITextBox usernameField = getElementFactory().getTextBox(By.id("user-name"), "Username Field");
    private final ITextBox passwordField = getElementFactory().getTextBox(By.id("password"), "Password Field");
    private final IButton loginButton = getElementFactory().getButton(By.id("login-button"), "Login Button");
    private final ILabel errorMessage = getElementFactory().getLabel(By.xpath("//*[@data-test= 'error']"), "Error Message Login");

    public void typeUsername(String username) {
        usernameField.clearAndType(username);
    }

    public void typePassword(String password) {
        passwordField.clearAndType(password);
    }

    public void clearUsername() {
        usernameField.clear();
    }

    public void clearPassword() {
        passwordField.clear();
    }

    public void clickLogin() {
        loginButton.clickAndWait();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
