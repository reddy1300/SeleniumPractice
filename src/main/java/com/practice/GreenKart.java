package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class GreenKart {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Expected Array
        String[] productList = {"Cucumber", "Brocolli", "Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        int j=0;
        for (int i=0; i<products.size();i++){
            String[] name = products.get(i).getText().split("-");
            String formatetdName = name[0].trim();
            List itemsNeeded = Arrays.asList(productList);
            //check whether name you extracted is present in your array or not
            //convert array into arraylist for easy search

            if (itemsNeeded.contains(formatetdName)){
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j==3){
                    break;
                }
            }
        }

    }
}
