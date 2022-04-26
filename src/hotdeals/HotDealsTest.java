package hotdeals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotDealsTest extends Utility {
    String BaseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }

    /*●	Create the package hotdeals
●	Create the class HotDealsTest
	1 - verifySaleProductsArrangeAlphabetically()
		1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Sale”  link and click
		1.3 Verify the text “Sale”
		1.4 Mouse hover on “Sort By” and select “Name A-Z”
		1.5 Verify that the product arrange alphabetically*/
     @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
         //1.1 Mouse hover on the “Hot deals” link
         Thread.sleep(3000);
         mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
         //1.2 Mouse hover on the “Sale”  link and click
         Thread.sleep(3000);
         mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));

         //1.3 Verify the text “Sale”
         String actMsg = getTextFromElement((By.xpath("//h1[@id='page-title']")));
         System.out.println(actMsg);
         messageValidation("Sale",actMsg );
         //1.4 Mouse hover on “Sort By” and select “Name A-Z”
         mouseHoverOnly(By.xpath("//span[contains(text(),'Sort by:')]"));
         mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));
         //1.5 Verify that the product arrange alphabetically
         String ActMsg1 = getTextFromElement(By.xpath("//span[contains(text(),'Name A - Z')]"));
         System.out.println("Actual Message is :" +ActMsg1);
         messageValidation("Name A - Z", ActMsg1);
         }

         /*2 - verifySaleProductsPriceArrangeLowToHigh()
		2.1 Mouse hover on the “Hot deals” link
		2.2 Mouse hover on the “Sale”  link and click
		2.3 Verify the text “Sale”
		2.4 Mouse hover on “Sort By” and select “Price Low-High”
		2.5 Verify that the product’s price arrange Low to High*/
          @Test
         public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
             //2.1 Mouse hover on the “Hot deals” link
              Thread.sleep(3000);
              mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
             //2.2 Mouse hover on the “Sale”  link and click
              Thread.sleep(3000);
             mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
             //2.3 Verify the text “Sale”
             String actMsg = getTextFromElement((By.xpath("//h1[@id='page-title']")));
             System.out.println(actMsg);
             messageValidation("Sale",actMsg );
             //2.4 Mouse hover on “Sort By” and select “Price Low-High”
             mouseHoverOnly(By.xpath("//span[contains(text(),'Sort by:')]"));
             mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
             //2.5 Verify that the product’s price arrange Low to High
              String ActMsg2 = getTextFromElement(By.xpath("//span[contains(text(),'Price Low - High')]"));
              System.out.println("Actual Message is :" +ActMsg2);
              messageValidation("Price Low - High", ActMsg2);
         }
         /*3 - verifySaleProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Sale”  link and click
		3.3 Verify the text “Sale”
		3.4 Mouse hover on “Sort By” and select “Rates”
		3.5 Verify that the product’s arrange Rates*/
    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        Thread.sleep(3000);
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        //3.2 Mouse hover on the “Sale”  link and click
        //Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));

        //3.3 Verify the text “Sale”
        String actMsg = getTextFromElement((By.xpath("//h1[@id='page-title']")));
        System.out.println(actMsg);
        messageValidation("Sale",actMsg );
        //3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHoverOnly(By.xpath("//span[contains(text(),'Sort by:')]"));
        Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]"));
        //3.5 Verify that the product’s arrange Rates
        String ActMsg2 = getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
        System.out.println("Actual Message is :" +ActMsg2);
        messageValidation("Rates", ActMsg2);
    }
    /*4 - verifyBestSellersProductsArrangeByZToA()
		1.1 Mouse hover on the “Hot deals” link
		1.2 Mouse hover on the “Bestsellers”  link and click
		1.3 Verify the text “Bestsellers”
		1.4 Mouse hover on “Sort By” and select “Name Z-A”
		1.5 Verify that the product arrange by Z to A*/
    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        //4.1 Mouse hover on the “Hot deals” link
        Thread.sleep(3000);
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        //4.2 Mouse hover on the “Bestsellers”  link and click
        Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        //4.3Verify the text “Bestsellers”
        String actMsg = getTextFromElement((By.xpath("//h1[@id='page-title']")));
        System.out.println(actMsg);
        messageValidation("Bestsellers",actMsg );
        //4.4 Mouse hover on “Sort By” and select “Name Z-A”
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"));
        //4.5 Verify that the product arrange by Z to A
        String ActMsg2 = getTextFromElement(By.xpath("//span[contains(text(),'Name Z - A')]"));
        System.out.println("Actual Message is :" +ActMsg2);
        messageValidation("Name Z - A", ActMsg2);
    }
    /*5 - verifyBestSellersProductsPriceArrangeHighToLow()
		2.1 Mouse hover on the “Hot deals” link
		2.2 Mouse hover on the “Bestsellers” link and click
		2.3 Verify the text “Bestsellers”
		2.4 Mouse hover on “Sort By” and select “Price High-Low”
		2.5 Verify that the product’s price arrange High to Low*/
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        Thread.sleep(3000);
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        //2.2 Mouse hover on the “Bestsellers”  link and click
        Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        //2.3Verify the text “Bestsellers”
        String actMsg = getTextFromElement((By.xpath("//h1[@id='page-title']")));
        System.out.println(actMsg);
        messageValidation("Bestsellers",actMsg );
        //2.4 Mouse hover on “Sort By” and select “Price High-Low”
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]"));
        //2.5 Verify that the product’s price arrange High to Low
        String ActMsg1 = getTextFromElement(By.xpath("//span[contains(text(),'Price High - Low')]"));
        System.out.println("Actual Message is :" +ActMsg1);
        messageValidation("Price High - Low", ActMsg1);
    }
    /*6 - verifyBestSellersProductsArrangeByRates()
		3.1 Mouse hover on the “Hot deals” link
		3.2 Mouse hover on the “Bestsellers”  link and click
		3.3 Verify the text “Bestsellers”
		3.4 Mouse hover on “Sort By” and select “Rates”
		3.5 Verify that the product’s arrange Rates*/
    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {

        //3.1 Mouse hover on the “Hot deals” link
        Thread.sleep(3000);
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
        //3.2 Mouse hover on the “Bestsellers”  link and click
        //Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
        //3.3Verify the text “Bestsellers”
        String actMsg = getTextFromElement((By.xpath("//h1[@id='page-title']")));
        System.out.println(actMsg);
        messageValidation("Bestsellers", actMsg);
        //3.4 Mouse hover on “Sort By” and select “Rates”
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]"));
        Thread.sleep(3000);
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]"));
        //3.5 Verify that the product arrange by Z to A
        String ActMsg = getTextFromElement(By.xpath("//span[contains(text(),'Rates')]"));
        System.out.println("Actual Message is :" +ActMsg);
        messageValidation("Rates", ActMsg);
    }

    @After
    public void closedown()
    {

        closeBrowser();
    }

}
