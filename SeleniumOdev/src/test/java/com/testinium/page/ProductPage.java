package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


public class ProductPage {
    Methods methods;
    Random rand = new Random();
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKey(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("faceted-search-group-6"));

        methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);

        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.waitBySeconds(1);
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.top.login>ul>li>a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//span[text()='Favorilerim']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("img[alt='kitapyurdu.com']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));

        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector("div[class='sort']>select[onchange='location = this.value;']"),"Yüksek Oylama");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//span[text()='Tüm Kitaplar']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[text()='Hobi']"));

        selectRandomProduct();
        methods.click(By.xpath("//a[@id='button-cart']"));
        methods.waitBySeconds(2);


        //listemelerden favori

        methods.scrollWithAction(By.xpath(("//a[@class = 'common-sprite' and contains(text(), 'Listelerim')]")));
        methods.waitBySeconds(2);
        methods.click(By.linkText("Favorilerim"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='product-list']/div[@class='product-cr'][3]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(2);
        //sepete gidilir
        methods.click(By.cssSelector("#cart > div.heading")); //sepet açma
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart")); //sepete gitme
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//input[@name='quantity']")).clear(); //valueyu siler
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@name='quantity']"), "2"); //
        methods.waitBySeconds(2);
        methods.click(By.xpath("//i[@title='Güncelle']")); //günceller
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("div[class='right']>a[class='button red']")); //satın alma
        methods.waitBySeconds(2);
//        methods.sendKeys(By.id("address-firstname-companyname"),"Mehmet Cem");
//        methods.waitBySeconds(2);
//        methods.sendKeys(By.id("address-lastname-title"),"Bilgin");
//        methods.waitBySeconds(2);
//        methods.selectByText(By.cssSelector("#address-zone-id"),"Hatay" );
//        methods.waitBySeconds(2);
//        methods.selectByText(By.cssSelector("#address-county-id"),"Antakya" );
//        methods.waitBySeconds(2);
//        methods.sendKeys(By.id("address-address-text"),"Testinium şirketi ");
//        methods.waitBySeconds(2);
//        methods.sendKeys(By.id("address-telephone"),"5393020418");
//        methods.waitBySeconds(2)
        methods.click(By.xpath("//button[@class='button']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//button[@class='button']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("input[id='credit-card-owner']"), "Mehmet Cem Bilgin");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("input[id='credit_card_number_1']"), "1769475869403247");
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector("select[id='credit-card-expire-date-month']"),"09");
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector("select[id='credit-card-expire-date-year']"),"2024");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("input[id='credit-card-security-code']"), "333");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("label[id='credit-card-is-3ds-label']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("label[id='register-credit-card-label']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("button[id='button-checkout-continue']"));
        methods.waitBySeconds(2);
        String text = methods.getText(By.cssSelector("span[class='error']"));

        methods.click(By.cssSelector("#logo > a > img"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
        methods.click(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));














    }

    public void selectRandomProduct() {
        List<WebElement> productList = methods.findElements(By.cssSelector(".pr-img-link"));
        // List<WebElement> productList = methods.findAllElements(By.cssSelector(".add-to-cart"));
        int randNum = rand.nextInt(productList.size()); //0 - productList.size()
        productList.get(randNum).click();
    }





}