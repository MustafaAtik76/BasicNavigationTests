package com.cydeo.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual){

        if (expected.equals(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL"+ "Expected: "+expected+ "Actual: "+actual);
        }
    }
}
