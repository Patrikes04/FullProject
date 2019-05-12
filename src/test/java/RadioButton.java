import PageObject.PracticePage;
import main.app.NewDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class RadioButton extends NewDriver {

    @Test
    private void radioButtonCheck() throws IOException {
        driver=create();
        driver.get("http://www.qaclickacademy.com/practice.php");
        PracticePage pp = new PracticePage();

        checkText(pp);
        clickButtonOne(pp);
        Assert.assertTrue(pp.getRadioButtonOne(driver).isSelected());

        clickButtonTwo(pp);
        Assert.assertTrue(pp.getRadioButtonTwo(driver).isSelected());

        clickButtonThree(pp);
        Assert.assertTrue(pp.getRadioButtonThree(driver).isSelected());
    }

    private void checkText(PracticePage pp){
        Assert.assertEquals(pp.getRadioButtonLegend(driver).getText(),"Radio Button Example");
        pp.getRadioButtonOne(driver).click();
    }

    private void clickButtonOne(PracticePage pp){
        pp.getRadioButtonOne(driver).click();
    }
    private void clickButtonTwo(PracticePage pp){
        pp.getRadioButtonTwo(driver).click();
    }
    private void clickButtonThree(PracticePage pp){
        pp.getRadioButtonThree(driver).click();
    }

}
