package testpkg;

import org.testng.annotations.Test;



import basepkg.baseclass;
import pagepkg.Checkout_page;
import pagepkg.login_page;
import pagepkg.product_page;


public class Checkout_test extends baseclass{
		@Test
	    public void verifyCheckoutProcess() throws InterruptedException {
	        login_page log = new login_page(driver);
	        product_page pdt = new product_page(driver);
	        Checkout_page ckout = new Checkout_page(driver);
	        
	        test = extent.createTest("Checkout Process Test");
	        
	       
	        log.setvalues("standard_user", "secret_sauce");
	        log.buttontext();
	        Thread.sleep(2000);
	        
	       
	        pdt.additems();
	        Thread.sleep(5000);
	        

	        ckout.clickCart();
	        Thread.sleep(3000);
	        
	       
	        ckout.clickcheckOut();
	        Thread.sleep(3000);
	        
	       
	        ckout.setDetails("muhsina", "biju", "688562");
	        Thread.sleep(3000);
	        
	       
	        ckout.clickFinish();
	        Thread.sleep(3000);
	   
	        ckout.clickHamburgerMenu();
	        Thread.sleep(3000);
	        
	       
	        ckout.clickLogout();
	        Thread.sleep(3000);
	        
	        test.pass("Checkout process completed successfully");
	    }
	
    
	
}