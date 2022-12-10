import org.testng.annotations.Test;

public class TC1_FirstTestNgClass {

    /*
    It is highly important that It is not used main method while we are creating TestNg Project.
    TestNG Project is always started with the annotation of @Test. after this annotation we can create
    our method
     */
   // public static void main(String[] args)
        @Test
        public  void firstTest () {
            System.out.println(("Hello Test")); // Hello Test
            /*
            ****Default Suite consists of
            1. my_First_TestNG_test
            2.TC1_FirstTestNgClass
            3.firstTest

            ******* Default Suite consists of
            Total tests run: 1, Passes:1, Failures :0 , Skips :0
             */


        }
}
