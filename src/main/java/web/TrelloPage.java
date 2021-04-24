package web;

import de.p7s1.qa.sevenfacette.config.types.FacetteConfig;
import de.p7s1.qa.sevenfacette.driver.Browser;
import de.p7s1.qa.sevenfacette.driver.Page;


public class TrelloPage extends Page {

    public TrelloPage(Browser browser) {
        super(browser);
    }

    public String getUrl() {
        return FacetteConfig.INSTANCE.getWeb().getBaseUrl();
    }

    public void clickRegistrationButton() {
    }

    public void isRegistrationPageOpened() {
    }


    @Override
    public boolean isAtPage() {
        return true;
    }
}
