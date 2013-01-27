package org.andidev.webdriverextension.page;

import org.andidev.webdriverextension.HtmlTag;
import org.andidev.webdriverextension.PageObject;
import static org.andidev.webdriverextension.WebDriverAssert.*;
import org.andidev.webdriverextension.annotation.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@Page
public class HomePage extends PageObject {

    @FindBy(css = "nav a.examples")
    HtmlTag examples;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        getDriver().get("http://andidev.github.com/webdriver-extension/index.html");
    }

    @Override
    public void assertIsOpen() throws Error {
        assertIsDisplayed(examples);
    }
}