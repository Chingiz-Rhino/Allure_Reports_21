package qa.guru;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;


public class SelenideWithListener extends TestBase{

    @DisplayName("Проверка присутствия issue в репозитории")
    @Test
    void checkingIssue() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/");

        $(".search-input").click();
        $("#query-builder-test").setValue("Chingiz-Rhino/Allure_Reports_21").pressEnter();
        $(linkText("Chingiz-Rhino/Allure_Reports_21")).click();
        $("#issues-tab").click();
        $(withText("First Issues")).should(exist);
    }


}
