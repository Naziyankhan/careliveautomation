package com.tests;

import utils.EmailHelper;

public class TestEmail {

    @org.testng.annotations.Test
    public void test1(){

        EmailHelper em = new EmailHelper();
         em.sendmail();
    }
}
