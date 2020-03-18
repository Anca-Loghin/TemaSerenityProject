package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www2.hm.com/ro_ro/index.html")
public class Homepage extends PageObject {

    @FindBy(css = "input#main-search")
    private WebElementFacade searchLink;

    @FindBy(css = "a.menu__super-link[href=\"/ro_ro/barbati.html\"]>span")
    private WebElementFacade categoryMen;

    @FindBy(css = "[href=\"/ro_ro/cart\"]")
    private WebElementFacade cartLink;

    public void clickSearch(){
        clickOn(searchLink);
    }

    public void clickCategoryMen(){
        clickOn(categoryMen);
    }

    public void clickCart(){
        clickOn(cartLink);
    }
}
