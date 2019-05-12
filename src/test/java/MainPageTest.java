import PageObject.HomePage;
import main.app.NewDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class MainPageTest extends NewDriver {
    @Test
    public void openMainMenu() throws IOException {
        driver = create();
        driver.get("http://www.qaclickacademy.com");
        HomePage hp=new HomePage();
        driver.findElement(hp.practicePageLink).click();
    }
}
