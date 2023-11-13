package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      //  WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        try {
            URL url = new URL("https://www.google.com");
            driver.navigate().to(url);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(1800);
        driver.navigate().back();
        Thread.sleep(1800);
        driver.navigate().forward();
        driver.navigate().refresh();
       System.out.println(driver.getTitle()); 
        driver.quit();

    }
}