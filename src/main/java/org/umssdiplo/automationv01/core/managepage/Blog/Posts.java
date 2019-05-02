package org.umssdiplo.automationv01.core.managepage.Blog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Posts extends BasePage {

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[11]/a")
    private WebElement buttonBlog;
    @FindBy(xpath = "//*[@id=\"Blog\"]/li[1]/a")
    private WebElement buttonPosts;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/button")
    private WebElement buttonAddPosts;
    @FindBy(name = "title")
    private WebElement imputPosts;
    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]")
    private WebElement imputTxt;
    @FindBy(name = "status")
    private WebElement selectStatus;
    @FindBy(name = "category")
    private WebElement selectCategory;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/form/div/div[2]/button")
    private WebElement buttonSubmitPosts;

    public void ClickMenuBlog(){
        CommonEvents.clickButton(buttonBlog);
    }

    public void ClickSubMenuPosts(){
        CommonEvents.clickButton(buttonPosts);
    }
    public void ClickButtonAddPosts(){
        CommonEvents.clickButton(buttonAddPosts);
    }
    public  Posts InsertTitlePosts(String title_Posts){
        CommonEvents.setInputField(imputPosts, title_Posts);
        return this;
    }
    public Posts InsertText(String text_Area){
        CommonEvents.setInputField(imputTxt, text_Area);
        return this;
    }
    public Posts SelectStatus(String status){
        CommonEvents.selectOption(selectStatus, status);
        return this;
    }
    public Posts SelectCategory(String category){
        CommonEvents.selectOption(selectCategory, category);
        return this;
    }
    public void ClickSumbitPosts(){
        CommonEvents.clickButton(buttonSubmitPosts);
    }
}
