import PageObject.PracticePage;
import main.app.NewDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Checkbox extends NewDriver {
    @Test
    public void checkboxCheck() throws IOException {
        driver = create();
        driver.get("http://www.qaclickacademy.com/practice.php");
        PracticePage pp = new PracticePage();

        Assert.assertEquals(pp.getCheckboxTitle(driver).getText(), "Checkbox Example");
        selectCheckboxOne(pp);
        Assert.assertTrue(pp.getCheckboxOne(driver).isSelected());
        selectCheckboxTwo(pp);
        Assert.assertTrue(pp.getCheckboxTwo(driver).isSelected());
        selectCheckboxThree(pp);
        Assert.assertTrue(pp.getCheckboxThree(driver).isSelected());
        selectCheckboxOne(pp);

        Assert.assertFalse(pp.getCheckboxOne(driver).isSelected());
        selectCheckboxTwo(pp);
        Assert.assertFalse(pp.getCheckboxTwo(driver).isSelected());
        selectCheckboxThree(pp);
        Assert.assertFalse(pp.getCheckboxThree(driver).isSelected());
    }

    private void selectCheckboxOne(PracticePage pp) {
        pp.getCheckboxOne(driver).click();
    }
    private void selectCheckboxTwo(PracticePage pp) {
        pp.getCheckboxTwo(driver).click();
    }
    private void selectCheckboxThree(PracticePage pp) {
        pp.getCheckboxThree(driver).click();
    }
}
