package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsPractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().fullscreen();
        driver.findElement(By.id("inputUsername")).sendKeys("NagendraReddy");
        driver.findElement(By.name("inputPassword")).sendKeys("nagendra123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();

    }
}
