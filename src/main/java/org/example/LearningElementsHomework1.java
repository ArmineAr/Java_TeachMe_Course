package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningElementsHomework1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.toolsqa.com/");

        WebElement privacyButton=driver.findElement(By.id("accept-cookie-policy"));
        privacyButton.click();
     // WebElement readMoreLink= driver.findElement(By.linkText("Read More"));
   //   readMoreLink.click();
        WebElement enrollYourself= driver.findElement(By.xpath("//a[contains(text(),'Enroll')]"));
      enrollYourself.click();

        driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
        WebElement firstName= driver.findElement(By.cssSelector("[name=firstName]"));
        firstName.sendKeys("Test");
        WebElement email= driver.findElement(By.cssSelector("input#email"));
        email.sendKeys("test124a@gmail.com");
        WebElement country=driver.findElement(By.cssSelector("#country"));
      //  WebElement countrySelect=driver.findElement(By.cssSelector("//option[text()='Armenia']"));
    //  countrySelect.click();



    }
}
