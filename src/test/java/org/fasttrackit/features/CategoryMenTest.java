package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.CategorySteps;
import org.fasttrackit.steps.SearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CategoryMenTest {

    @Managed(uniqueSession = true)
        private WebDriver driver;

    @Steps
        private CategorySteps categorySteps;

    @Test
        public void testValidCategory(){
            categorySteps.navigateToCategoryMen();
        }
    }

