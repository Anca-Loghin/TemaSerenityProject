package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.Homepage;

public class CartSteps {
    private Homepage homepage;

    @Step
    public void navigateToCart(){
        homepage.open();
        homepage.clickCart();
    }

}
