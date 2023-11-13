package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        By by=By.name("login-button");
       // By by1=By.id("login-button"); OR
        By by1=By.cssSelector("#login-button");
        By by2=By.className("submit-button");
        // By by4=By.tagName("input"); OR
        //By by4=By.cssSelector("input#login-button"); OR
        // By by4=By.cssSelector(".submit-button"); OR
        By by4=By.cssSelector("input#login-button.btn_action.submit-button");
        By by5=By.linkText("Pets and Animals");
        By by6=By.partialLinkText("Fashion");
        By by7=By.cssSelector("[data-test=password]");



        //  WebElement loginButton = driver.findElement(By.id("login-button")); OR
      //  WebElement loginButton = driver.findElement(by);

      WebElement username=driver.findElement(by4);
      username.sendKeys("standard_user");
      WebElement password=driver.findElement(by7);
    password.sendKeys("secret_sauce");

    Thread.sleep(3000);

    WebElement loginButton = driver.findElement(by2);

    loginButton.click();

        Thread.sleep(3000);

//        driver.get("https://www.list.am/en/");
//
//        WebElement pets=driver.findElement(by5);
//        pets.click();
//        System.out.println(driver.getCurrentUrl());
//
//        driver.navigate().back();
//        WebElement fasion= driver.findElement(by6);
//        fasion.click();
//        System.out.println(driver.getCurrentUrl());


        // driver.close();

    }
}
