package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {

    String BaseUrl = "https://mobile.x-cart.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }

    /*●	Create class TopMenuTest
	1 - verifyUserShouldNavigateToShippingPageSuccessfully()
		1.1 Click on the “Shipping” link
		1.2 Verify the text “Shipping”*/
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        //Click on the “Shipping” link
        clickOnElement(By.linkText("Shipping"));
       //Verify the text “Shipping”
        String ActMsg = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        System.out.println("Actual Message is :" +ActMsg);
        messageValidation("Shipping",ActMsg);//Message Validation

        /*2 - verifyUserShouldNavigateToNewPageSuccessfully()
		2.1 Click on the “New!” link
		2.2 Verify the text “New arrivals”*/
        clickOnElement(By.linkText("New!"));//Click on the “New!” link
        String ActMsg1 = getTextFromElement(By.id("page-title"));
        System.out.println("Actual Message is :" +ActMsg1);
        messageValidation("New arrivals",ActMsg1);//Message Validation

        /*3 - verifyUserShouldNavigateToComingsoonPageSuccessfully()
		3.1 Click on the “Coming soon” link
		3.2 Verify the text “Coming soon”*/
        clickOnElement(By.linkText("Coming soon"));//Click on the “Coming soon” link
        String ActMsg2 = getTextFromElement(By.id("page-title"));
        System.out.println("Actual Message is :" +ActMsg2);
        messageValidation("Coming soon",ActMsg2);//Message Validation

        /*4 - verifyUserShouldNavigateToContactUsPageSuccessfully()
		4.1 Click on the “Contact us” link
		4.2 Verify the text “Contact us”*/
        clickOnElement(By.linkText("Contact us"));//Click on the “Contact us” link
        String ActMsg3 = getTextFromElement(By.id("page-title"));
        System.out.println("Actual Message is :" +ActMsg3);
        messageValidation("Contact us",ActMsg3);//Message Validation
    }
    @After
    public void closedown()
    {
        closeBrowser();
    }

    }
