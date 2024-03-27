package com.itsolutioncompany.opeviso.run;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features", glue="com.itsolutioncompany.opeviso.steps")
public class TestRunner {
}
