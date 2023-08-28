package qa.guru;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class StepsTest {

    @Step("Открываем главную страницу")
    public void openWebPage(){
        open("https://github.com/");
    }
    @Step("Ищем репозиторий {repo}")
    public void searchRepo(String repo){
        $(".search-input").click();
        $("#query-builder-test").setValue(repo).pressEnter();
    }
    @Step("Переходим по ссылке {repo}")
    public void openRepo(String repo){
        $(linkText(repo)).click();
    }
    @Step("Открываем вкладку Issues")
    public void clickIssueTab(){
        $("#issues-tab").click();
    }
    @Step("Проверяем наличие Issue с именем {issue}")
    public void findIssue(String issue){
        $(withText(issue)).should(exist);
    }
}
