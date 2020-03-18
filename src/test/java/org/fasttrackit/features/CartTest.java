package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CartSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CartTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void testValidCategory(){
        cartSteps.navigateToCart();
    }
}
