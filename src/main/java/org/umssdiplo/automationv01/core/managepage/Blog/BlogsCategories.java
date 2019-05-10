package org.umssdiplo.automationv01.core.managepage.Blog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class BlogsCategories extends BasePage {

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[11]/a")
    private WebElement botonBlog;
    @FindBy(xpath = "//*[@id=\"Blog\"]/li[2]/a")
    private WebElement clickBlogCategories;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[1]/button")
    private WebElement clickButtonAdd;
    @FindBy(name = "name")
    private WebElement clickImputCategoriesname;
    @FindBy(name = "status")
    private WebElement selectStatusBlogCategories;
    @FindBy(xpath = "//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[2]/div[8]/div/input")
    private WebElement clickNameInSpanish;
    @FindBy(xpath = "//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]")
    private WebElement buttonAddFormBlogCategories;
    @FindBy(xpath = "//*[@id=\"Blog\"]/li[2]/a")
    private WebElement subMenuBlogsCategories;

    public void ClickMenuBlog() {
        CommonEvents.scrollComponent(botonBlog, webDriver);
        CommonEvents.clickButton(botonBlog);
    }

    public void clickButtonBlogsCategories() {
        CommonEvents.clickButton(clickBlogCategories);
    }

    public void clickButtonAddBlogCategories() {
        CommonEvents.clickButton(clickButtonAdd);
    }

    public BlogsCategories imputCategoriesNameBlog(String categories_Name) {
        CommonEvents.setInputField(clickImputCategoriesname, categories_Name);
        return this;
    }

    public BlogsCategories selectStatusBlogCategories(String status) {
        CommonEvents.selectOption(selectStatusBlogCategories, status);
        return this;
    }

    public BlogsCategories imputNameInSpanich(String name_in_Spanich) {
        CommonEvents.setInputField(clickNameInSpanish, name_in_Spanich);
        return this;
    }

    public void clickAddFormBlogCategories() {
        CommonEvents.clickButton(buttonAddFormBlogCategories);
    }

    public void clickSubMenuBlogCategories() {
        CommonEvents.clickButton(subMenuBlogsCategories);
    }
}
