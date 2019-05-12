import PageObject.PracticePage;
import main.app.NewDriver;
import main.app.Wait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SugestionClass extends NewDriver {
    @Test
    private void suggesstionClassCheck() throws IOException {
        driver = create();
        driver.get("http://www.qaclickacademy.com/practice.php");
        PracticePage pp = new PracticePage();
        String shortCountryOne = "Pola";
        String longCountryOne = "Poland";
        String shortCountryTwo = "Fra";
        String longCountryTwo = "France";
        String shortCountryThree = "Ice";
        String longCountryThree = "Iceland";

        isTitleCorrect(pp);

        checkInput(shortCountryOne,longCountryOne,pp);
        checkInput(shortCountryTwo,longCountryTwo,pp);
        checkInput(shortCountryThree,longCountryThree,pp);
    }

    private void isTitleCorrect(PracticePage pp) {
        Assert.assertEquals(pp.getSuggestionClassLegend(driver).getText(), "Suggession Class Example");
    }

    private void inputData(String country, PracticePage pp) {
        pp.getSuggestionInput(driver).sendKeys(country);
        Wait.exe(3);
        pp.getSuggestionInput(driver).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    }

    private String jsCheck() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.getElementById('autocomplete').value;";
        return (String) js.executeScript(script);
    }

    private void clearInput(PracticePage pp) {
        pp.getSuggestionInput(driver).clear();
    }
    private void checkInput(String shortCountry,String longCountry,PracticePage pp){
        inputData(shortCountry, pp);
        String text = jsCheck();
        clearInput(pp);
        Assert.assertEquals(text, longCountry);
    }

}
