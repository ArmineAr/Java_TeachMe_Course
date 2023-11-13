package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandler {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.sugarcrm.com/");
        String handel=driver.getWindowHandle();
    }
}
