package qa.guru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;


public class SelenideWithListener {
    @BeforeAll
    static void beforeall() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ching\\OneDrive\\Рабочий стол\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");

    }

    @DisplayName("Проверка присутствия issue в репозитории")
    @Test
    void checkingIssue() {
        open("https://github.com/");

        $(".search-input").click();
        $("#query-builder-test").setValue("Chingiz-Rhino/Allure_Reports_21").pressEnter();
        $(linkText("Chingiz-Rhino/Allure_Reports_21")).click();
        $("#issues-tab").click();
        $(withText("First Issues")).should(exist);
    }


}
