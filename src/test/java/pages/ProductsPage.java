package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.awt.*;

public class ProductsPage extends Form {

    public ProductsPage() {
        super(By.id("page_wrapper"), "Products Main Page");
    }
    private final ILabel logo = getElementFactory().getLabel(By.className("app_logo"), "Logo");

    public String getTitleLogo() {
       return logo.getText();
    }
}
