import PageObject.PracticePage;
import main.app.NewDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Dropdown extends NewDriver {
    @Test
    public void dropDownCheck() throws IOException {
        String[] options = {"Option1", "Option2", "Option3"};
        driver = create();
        driver.get("http://www.qaclickacademy.com/practice.php");
        PracticePage pp = new PracticePage();
        Assert.assertEquals(pp.getDropdownTitle(driver).getText(),"Dropdown Example");

        Select select = new Select(pp.getDropdownSelect(driver));
        for (String option : options) {
            selectOption(select, option);
            Assert.assertEquals(selectedOption(select),option);
        }
    }

    private void selectOption(Select select, String option) {
        select.selectByVisibleText(option);
    }

    private String selectedOption(Select select) {
        return select.getFirstSelectedOption().getText();
    }
}
