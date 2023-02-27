package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void andreiSolntsevShouldBeFirstContributor() {

        // открыть страницу репозитория selenide
        open("https://github.com/selenide/selenide");
        // подвести мышку к первому автору из блока contributors
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();
        // проверка: во всплывающем окне есть текст Andrei Solntsev
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));


        sleep(5000);

    }
}
