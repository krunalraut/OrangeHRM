package org.example;

import org.openqa.selenium.By;

public class DashBoardPage extends Util {
    private By _TextOnDashboardPage = By.xpath("//div[@class=\"box\"]/div[1]/h1[1]");

    public void verifyDashboardPage()
    {
        getTextFromElement(_TextOnDashboardPage,30);
    }
}
