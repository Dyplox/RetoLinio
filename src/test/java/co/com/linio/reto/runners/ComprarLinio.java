package co.com.linio.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ComprarLinio.feature",
        glue = "co.com.linio.reto.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class ComprarLinio {
}