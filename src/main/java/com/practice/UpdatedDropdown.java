package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);



    for (int i=1; i < 5; i++) {

        driver.findElement(By.id("hrefIncAdt")).click();


    }
    driver.findElement(By.id("btnclosepaxoption")).click();
    String itemsCount = driver.findElement(By.id("divpaxinfo")).getText();
    Assert.assertEquals(itemsCount,"5 Adult");


    }
}

