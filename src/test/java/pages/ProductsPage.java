package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;


public class ProductsPage extends Form {

    public ProductsPage() {
        super(By.id("page_wrapper"), "Products Main Page");
    }
    private final ILabel logoDashboard = getElementFactory().getLabel(By.className("app_logo"), "Logo Dashboard Header");

    public String getTitleLogo() {
       return logoDashboard.getText();
    }
}
