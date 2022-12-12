import org.testng.annotations.Test;

public class TC4_SecondTestNgClass {

    @Test
    public void openBrowser() {
        System.out.println(("Let's open the browser"));
    }
    @Test
    public void  signUp() {
        System.out.println(("Signing up"));
    }
    @Test
    public void login() {
        System.out.println(("Logging in"));
    }
    @Test
    public void addToCart() {
        System.out.println(("Add items to cart"));

    }
    @Test
    public void logOut() {
        System.out.println(("Logging out"));
    }
    @Test
    public void closeBrowser() {
        System.out.println(("Closing Browser"));
    }
}
  /*
  PS: The results get listed according to the alphabetic orders in Default Suite
  ****Default Suite consists of
            1. my_First_TestNG_test
            2.TC2_openBrowser
            3.addToCart
            4.closeBrowser
            5.logOut
            6.login
            7.openBrowser
            8.signUp
   */