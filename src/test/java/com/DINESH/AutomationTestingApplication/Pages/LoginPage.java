package com.DINESH.AutomationTestingApplication.Pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage {

//    @Autowired
//    private WebDriver webDriver;
//
//    @PostConstruct
//    public void InitiateLoginPage() {
//        PageFactory.initElements(webDriver, this);
//    }
//
//    @FindBy(how = How.NAME, using = "UserName")
//    public WebElement txtUserName;
//    @FindBy(how = How.NAME, using = "Password")
//    public WebElement txtPassword;
//    @FindBy(how = How.CSS, using = ".btn-default")
//    public WebElement btnLogin;
//
//    public void Login(String userName, String password){
////        txtUserName.sendKeys(userName);
////        txtPassword.sendKeys(password);
//        System.out.println(String.format("%s UserName & %s PassWord",userName, password));
//    }
//
//    public HomePage clickLogin(){
//        System.out.println("Click Login in Login Page");
//        return new HomePage();
//    }
}
