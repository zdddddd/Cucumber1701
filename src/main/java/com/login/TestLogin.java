package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestLogin {

    public static void login(WebDriver driver,String user,String pwd){
        driver.switchTo().frame("x-URS-iframe");
        driver.findElement(By.name("email")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.id("dologin")).click();
    }
}
