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
public class HomePage {

//    @Autowired
//    private WebDriver webDriver;
//
//    @PostConstruct
//    public void InitiateHomePage() {
//        PageFactory.initElements(webDriver, this);
//    }
//
//    @FindBy(how = How.LINK_TEXT, using = "Login")
//    public WebElement lnkLogin;
//
//    @FindBy(how = How.LINK_TEXT, using = "Employee List")
//    public WebElement lnkEmployeeList;
//
//    public LoginPage clickLogin(){
////        lnkLogin.click();
//        System.out.println("Clicked Login Page For HOME");
//        return new LoginPage();
//    }
//
//    public void clickEmployeeList(){
//        lnkEmployeeList.click();
//    }
}
