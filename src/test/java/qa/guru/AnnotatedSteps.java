package qa.guru;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AnnotatedSteps {

    private static final String REPOSITORY = "Chingiz-Rhino/Allure_Reports_21";
    private static final String ISSUE = "First Issues";

    @Test
    public void annotatedTest(){
        StepsTest stepsTest = new StepsTest();

        stepsTest.openWebPage();
        stepsTest.searchRepo(REPOSITORY);
        stepsTest.openRepo(REPOSITORY);
        stepsTest.clickIssueTab();
        stepsTest.findIssue(ISSUE);

    }

}
