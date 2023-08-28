package qa.guru;

import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeall() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ching\\OneDrive\\Рабочий стол\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");

    }
}
