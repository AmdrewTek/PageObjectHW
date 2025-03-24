package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestPreset {

    @BeforeAll
    static void beforeAll() {
        //Configuration.browser = "Edge";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x2000";
        Configuration.baseUrl = "https://demoqa.com";
    }

}
