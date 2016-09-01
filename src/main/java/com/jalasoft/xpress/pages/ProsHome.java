package com.jalasoft.xpress.pages;

import com.jalasoft.xpress.framework.util.CommonMethods;
import com.jalasoft.xpress.framework.util.PropertiesInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.jalasoft.xpress.framework.util.CommonMethods.*;

/**
 * Created by Mijhail Villarroel on 9/1/2016.
 */
public class ProsHome extends BasePage {

    @FindBy(xpath = "//a[@class='tight-button button success radius']")
    private WebElement signInLink;

    public ProsHome() {
        driver.get(PropertiesInfo.getInstance().getUrl());
    }

    public Login clickSingInLink() {
        clickWebElement(signInLink);
        return new Login();
    }
}
