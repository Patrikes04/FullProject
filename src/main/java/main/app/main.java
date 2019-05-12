package main.app;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        NewDriver newDriver=new NewDriver();
        try {
            WebDriver driver=newDriver.create();
            driver.get("https://www.wp.pl");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}