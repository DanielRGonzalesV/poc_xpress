package com.jalasoft.express.cucumber.stepdefinition.login;

import com.jalasoft.xpress.framework.util.Environment;

import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by Mijhail Villarroel on 9/1/2016.
 */
public class LoginAssert {
    private static final Environment PROPERTIES_INFO = Environment.getInstance();

    private LoginStepDef projectsStepdefs;

    public LoginAssert(LoginStepDef projectsStepdefs) {
        this.projectsStepdefs = projectsStepdefs;
    }

    @Then("^I expect the userName is displayed$")
    public void iExpectTheUserNameIsDisplayed() {
        String expectUserName = PROPERTIES_INFO.getUser();
        Assert.assertEquals(expectUserName.toUpperCase(),projectsStepdefs.getDashboard().getTopHeader().getUserNameText().toUpperCase());
}
}
