package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;

public class SearchSteps {

    private Homepage homepage;

    @Step
    public void navigateToSearch(){
        homepage.open();
        homepage.clickSearch();
    }
}
