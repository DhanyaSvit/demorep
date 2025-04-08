package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpagetest {
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("COOKWARE");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
