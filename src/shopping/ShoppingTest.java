package shopping;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Mouse;
import utilities.Utility;

public class ShoppingTest extends Utility {
    String BaseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersFabrikationsPlush() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
//        1.2 Mouse hover on the “Bestseller”  link and click
        mouseHoverClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
//        1.3 Verify the text “Bestsellers”
        String ActMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        messageValidation("Bestsellers",ActMsg);
//        1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverOnly(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
        //1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]"));
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]/div[3]/div[1]/a[1]"));

        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String ActMsg1 = getTextFromElement(By.xpath("//li[@class='info']"));
        messageValidation("Product has been added to your cart",ActMsg1);
        //1.7 click on x sign and close
        clickOnElement(By.xpath("//a[@title='Close']"));

        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@title='Your cart']"));
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]"));
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]/div[3]/div[1]/a[1]"));

        //1.9 Verify the text “Your shopping cart - 1 item”
        String ActMsg2 = getTextFromElement(By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]"));
        messageValidation("Your shopping cart - 1 item",ActMsg2);

        //1.10 verify the subtotal
        String ActMsg3 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]"));
        messageValidation("$14.99",ActMsg3);

        //1.11 Verify the total
        String ActMsg4 = getTextFromElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[4]"));
        messageValidation("$20.75",ActMsg4);

        //1.12 Click on “Go to checkout” button
        clickOnElement(By.xpath("//button[contains(@class,'regular-button regular-main-button checkout')]"));
        // 1.13 Verify the text “Log in to your account”
        String ActMsg5 = getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        messageValidation("Log in to your account",ActMsg5);

        //1.14 Enter Email address
        sendTextToElement(By.xpath("//input[@id='email']"), "kag35@gmail.com");

        //1.15 Click on “Continue” Button
        clickOnElement(By.xpath("//span[contains(text(),'Continue')]"));
        //1.16 Verify the text “Secure Checkout”
        String ActMsg6 = getTextFromElement(By.xpath("//h1[normalize-space()='Secure Checkout']"));
        messageValidation("Secure Checkout",ActMsg6);


        //1.17 Fill all the mandatory fields
        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"), "Krishna");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"),"Patel");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"), "150 Ealing Road");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"), "London");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='shippingaddress-country-code']"),"United Kingdom");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"),"Watford");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"),"KR12 2PA");
        sendTextToElement(By.xpath("//input[@id='shippingaddress-phone']"),"07788665544");
        sendTextToElement(By.xpath("//input[@id='email']"),"kag35@gmail.com");

        //1.18 Check the check box “Create an account for later use”
        String ActMsg7 = getTextFromElement(By.xpath("//input[@id='create_profile']"));
        messageValidation("Create an account for later use",ActMsg7);

        //1.19 Enter the password
        sendTextToElement(By.xpath("//input[@id='password']"),"abc123");
        //1.20 Select the Delivery Method to “Local Shipping”
        clickOnElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/ul[1]/li[2]/div[1]/label[1]"));
        //1.21 Select Payment Method “COD”
        clickOnElement(By.xpath("//input[@id='pmethod6']"));

        //1.22 Verify the total
        String ActMsg8 = getTextFromElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/span[2]"));
        messageValidation("$21.77",ActMsg8);
        //1.23 Click on “Place Order” Button
        clickOnElement(By.xpath("//span[contains(text(),'Place order: $21.77')]"));

        //1.24 Verify the text “Thank you for your order”
        String ActMsg9 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        messageValidation("Thank you for your order",ActMsg9);

    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
//        1.1 Mouse hover on the “Hot deals” link
        mouseHoverOnly(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]"));
//        1.2 Mouse hover on the “Bestseller”  link and click
        mouseHoverClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]"));
//        1.3 Verify the text “Bestsellers”
        String ActMsg10 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        messageValidation("Bestsellers",ActMsg10);

//        1.4 Mouse hover on “Sort By” and select “Name A-Z”
        mouseHoverOnly(By.xpath("//span[contains(text(),'Sort by:')]"));
        mouseHoverClick(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
//        1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        Thread.sleep(3000);
        mouseHoverOnly(By.xpath("//a[contains(text(),'Vinyl Idolz: Ghostbusters')]"));
        mouseHoverClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[8]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]"));


//        1.6 Verify the message “Product has been added to your cart” display in  green bar
        String ActMsg11 = getTextFromElement(By.xpath("//li[contains(text(),'Product has been added to your cart')]"));
        messageValidation("Product has been added to your cart",ActMsg11);
//        1.7 Click on X sign to close the message
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]"));

//        1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//div[@title='Your cart']"));
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

//        1.9 Verify the text “Your shopping cart - 1 item”
        String ActMsg12 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        messageValidation("Your shopping cart - 1 item",ActMsg12);
//        1.10 Click on “Empty your cart” link
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));

//        1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        Thread.sleep(2000);
        String ActMsg13 = AlertgetText();
        messageValidation("Are you sure you want to clear your cart?",ActMsg13);

//        1.12 Click “Ok” on alert
          switchToAccept();

//        1.13 Verify the message “Item(s) deleted from your cart”
        String ActMsg14 = getTextFromElement(By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]"));
        messageValidation("Item(s) deleted from your cart", ActMsg14);

//        1.15 Verify the text “Your cart is empty”
        String ActMsg15 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        messageValidation("Your cart is empty",ActMsg15);
    }
    @After
    public void closedown(){ closeBrowser();
    }

}
