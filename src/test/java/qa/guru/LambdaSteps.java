package qa.guru;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LambdaSteps {

    private static final String REPOSITORY = "Chingiz-Rhino/Allure_Reports_21";
    private static final String ISSUE = "First Issues";
    @DisplayName("Проверка присутствия issue в репозитории")
    @Test
    void lambdaStepTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://github.com/");
        });
        step("Ищем репозиторий" + REPOSITORY, () -> {
            $(".search-input").click();
            $("#query-builder-test").setValue(REPOSITORY).pressEnter();
        });
        step("Переходим по ссылке " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();
        });
        step("Открываем вкладку Issues", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие Issue с именем " + ISSUE, () -> {
            $(withText(ISSUE)).should(exist);
        });

    }
}
