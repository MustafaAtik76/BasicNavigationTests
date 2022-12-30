package com.cydeo.tests;

import org.openqa.selenium.WebDriver;
import com.cydeo.utilities.StringUtility;

import static com.cydeo.utilities.BrowserFactory.getDriver;

public class NavigationTests {

    public static void main(String[] args) {

       WebDriver driver = getDriver("Chrome");
        driver.manage().window().maximize();

        //1. Open	browser
        //2. Go	to	website	https://google.com
        driver.get("https://google.com");

        //3. Save the	title in	a	string	variable
        String actualTitle1 = driver.getTitle();

        //4. Go	to	https://etsy.com
        driver.get("https://etsy.com");

        //5. Save the	title	in	a	string	variable
        String actualTitle2 = driver.getTitle();

        //6. Navigate	back	to	previous page
        driver.navigate().back();

        //7. Verify that	title	is	same	is	in	step	3
        StringUtility.verifyEquals(driver.getTitle(), actualTitle1);

        // 8. Navigate	forward	to	previous	page
        driver.navigate().forward();

        //9. Verify	that	title	is	same	is	in	step	5
        StringUtility.verifyEquals(driver.getTitle(), actualTitle2);

        driver.close();


        WebDriver driver1 = getDriver("Edge");
        driver1.manage().window().maximize();
        //1. Open	browser
        //2. Go	to	website	https://google.com
        driver1.get("https://google.com");

        //3. Save the	title in	a	string	variable

        String actualTitle3 = driver1.getTitle();

        //4. Go	to	https://etsy.com
        driver1.get("https://etsy.com");

        //5. Save the	title	in	a	string	variable
        String actualTitle4 = driver1.getTitle();

        //6. Navigate	back	to	previous page
        driver1.navigate().back();

        //7. Verify that	title	is	same	is	in	step	3
        StringUtility.verifyEquals(driver1.getTitle(), actualTitle3);

        // 8. Navigate	forward	to	previous	page
        driver1.navigate().forward();

        //9. Verify	that	title	is	same	is	in	step	5
        StringUtility.verifyEquals(driver1.getTitle(), actualTitle4);

        driver1.close();

        WebDriver driver2 = getDriver("Firefox");
        driver2.manage().window().maximize();
        //1. Open	browser
        //2. Go	to	website	https://google.com
        driver2.get("https://google.com");

        //3. Save the	title in	a	string	variable
        String actualTitle5 = driver2.getTitle();

        //4. Go	to	https://etsy.com
        driver2.get("https://etsy.com");

        //5. Save the	title	in	a	string	variable
        String actualTitle6 = driver2.getTitle();

        //6. Navigate	back	to	previous page
        driver2.navigate().back();

        //7. Verify that	title	is	same	is	in	step	3
        StringUtility.verifyEquals(driver2.getTitle(), actualTitle5);

        // 8. Navigate	forward	to	previous	page
        driver2.navigate().forward();

        //9. Verify	that	title	is	same	is	in	step	5
        StringUtility.verifyEquals(driver2.getTitle(), actualTitle6);

        driver2.close();



    }
}
