package com.jalasoft.xpress.pages.project;

import com.jalasoft.xpress.pages.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.jalasoft.xpress.framework.util.CommonMethods.clickWebElement;
import static com.jalasoft.xpress.framework.util.CommonMethods.isElementPresent;
import static com.jalasoft.xpress.framework.util.CommonMethods.setWebElement;

/**
 * Created by henrry salinas on 9/1/2016.
 */
public class EditProjectUsersForm extends BasePage {
    
    @FindBy(xpath = "//button[contains(@title,'Add selected items')]")
    private WebElement addUserBtn;
    
    @FindBy(xpath = "//button[contains(@title,'Add all')]")
    private WebElement addAllUsersBtn;
    
    @FindBy(xpath = "//button[contains(@title,'Remove all')]")
    private WebElement removeAllUsersBtn;
    
    @FindBy(xpath = "//button[contains(@title,'Remove selected items')]")
    private WebElement removeUserBtn;
    
    @FindBy(xpath = "//td[contains(@class,'available-users-list')]//input")
    private WebElement txtAvailableUser;
    
    @FindBy(xpath = "//div[contains(@class,'dialog-footer')]//a[@class='dialog-ok-button' and contains(.,'Associate')]")
    private WebElement associateAllBtn;
    
    public EditProjectUsersForm clickOnAddItemBtn() {
        clickWebElement(addUserBtn);
        return this;
    }
    
    public EditProjectUsersForm clickOnAssociateAllBtn() {
        clickWebElement(associateAllBtn);
        return this;
    }
    
    public EditProjectUsersForm setTxtAvailableUser(String userName) {
        setWebElement(txtAvailableUser, userName);
        return this;
    }
    
    public EditProjectUsersForm clickUserAvailableRow(String userName) {
        final String xpath = String.format("//span[contains(.,'%s')]/..", userName);
        WebElement rowUser = driver.findElement(By.xpath(xpath));
        clickWebElement(rowUser);
        return this;
    }
    
    public boolean userIsAdded(String userName) {
        final String xpath = String.format("//td[contains(.,'%s')]/ancestor::fieldset[contains(.,'Current users')]", userName);
        WebElement userInTableAdded = driver.findElement(By.xpath(xpath));
        return isElementPresent(userInTableAdded);
    }
}
