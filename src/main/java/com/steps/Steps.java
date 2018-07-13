package com.steps;

import com.login.TestLogin;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {
    WebDriver driver;

    @当("^打开163邮箱网站$")
    public void openUrl() {
        //System.out.println("打开163邮箱网站");
        driver = new FirefoxDriver();
        driver.get("http://mail.163.com");
    }

    @并且("^在账号框输入\"([^\"]*)\"$")
    public void inputAccount(String account) {
        System.out.println("在账号框输入"+account);
    }

    @并且("^在密码框输入\"([^\"]*)\"$")
    public void inputPwd(String pwd) {
        System.out.println("在密码框输入"+pwd);
    }

    @当("^点击登录按钮$")
    public void clickLoginButton() {
        System.out.println("点击登录按钮");
    }

    @那么("^登录成功$")
    public void loginSuccess() {
        System.out.println("登录成功");
        driver.quit();
    }


    @当("^用\"([^\"]*)\"账号和密码\"([^\"]*)\"登录$")
    public void login(String user, String pwd) throws Throwable {
//        driver.switchTo().frame("x-URS-iframe");
//        driver.findElement(By.name("email")).sendKeys(user);
//        driver.findElement(By.name("password")).sendKeys(pwd);
//        driver.findElement(By.id("dologin")).click();
        TestLogin.login(driver,user,pwd);
    }
}
