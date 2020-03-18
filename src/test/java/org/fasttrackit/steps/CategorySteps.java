package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;

public class CategorySteps {

    private Homepage homepage;

    @Step
    public void navigateToCategoryMen(){
        homepage.open();
        homepage.clickCategoryMen();
    }
}
