package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
    private WebDriver driver;
    //radioButton Elements
    private By radioButtonContainer = By.id("radio-btn-example");
    private By radioButtonLegend= By.xpath("//div[@id='radio-btn-example']/fieldset/legend");
    private By radioButtonOne=By.xpath("//input[@value='radio1']");
    private By radioButtonTwo= By.xpath("//input[@value='radio2']");
    private By radioButtonThree=By.xpath("//input[@value='radio3']");


    public WebElement getRadioButtonContainer(WebDriver driver){
        return driver.findElement(radioButtonContainer);
    }
    public WebElement getRadioButtonLegend(WebDriver driver){
        return driver.findElement(radioButtonLegend);
    }
    public WebElement getRadioButtonOne(WebDriver driver){
        return driver.findElement(radioButtonOne);
    }
    public WebElement getRadioButtonTwo(WebDriver driver){
        return driver.findElement(radioButtonTwo);
    }
    public WebElement getRadioButtonThree(WebDriver driver){
        return driver.findElement(radioButtonThree);
    }


    //SuggestionClass elements
    private By suggestionClassContainer =By.id("select-class-example");
    private By suggestionClassLegend =By.xpath("//div[@id='select-class-example']/fieldset/legend");
    private By suggestionClassInput =By.id("autocomplete");

    public WebElement getSuggestionClassContainer(WebDriver driver){
        return driver.findElement(suggestionClassContainer);
    }
    public WebElement getSuggestionClassLegend(WebDriver driver){
        return driver.findElement(suggestionClassLegend);
    }
    public WebElement getSuggestionInput(WebDriver driver){
        return driver.findElement(suggestionClassInput);
    }

    //Dropdown Elements
    private By dropdownTitle=By.xpath("//div[@class='cen-right-align']");
    private By dropdownSelect=By.id("dropdown-class-example");

    public WebElement getDropdownSelect(WebDriver driver){
        return driver.findElement(dropdownSelect);
    }
    public WebElement getDropdownTitle(WebDriver driver){
        return driver.findElement(dropdownTitle);
    }

    //Checkbox Elements
    private By checkboxTitle=By.xpath("//div[@id='checkbox-example']/fieldset/legend");
    private By checkboxOne=By.id("checkBoxOption1");
    private By checkboxTwo=By.id("checkBoxOption2");
    private By checkboxThree=By.id("checkBoxOption3");

    public WebElement getCheckboxTitle(WebDriver driver){
        return driver.findElement(checkboxTitle);
    }
    public WebElement getCheckboxOne(WebDriver driver){
        return driver.findElement(checkboxOne);
    }
    public WebElement getCheckboxTwo(WebDriver driver){
        return driver.findElement(checkboxTwo);
    }
    public WebElement getCheckboxThree(WebDriver driver){
        return driver.findElement(checkboxThree);
    }

}
