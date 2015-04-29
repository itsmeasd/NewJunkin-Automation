package com.amazon;

import baseApi.Base;
import homeFeatures.AmazonBase;
import org.testng.annotations.Test;
import utiliy.DataReader;

import java.io.IOException;

/**
 * Created by rrt on 4/12/2015.
 */
public class SignUp extends AmazonBase {
    public DataReader dr = new DataReader();
    String path = \\Amazon\\file1.xls;

    @Test
    public void signIn()throws IOException,InterruptedException{
        sleepFor(2);
        clickByCss("#nav-tools #nav-link-yourAccount .nav-line-1");
        clickByCss(".nav-action-inner");
        sleepFor(4);
        dr.fileReader(path);
        typeByCss("#ap_email", "abc123@gmail.com");
        typeByCss("#ap_password","abc123456");

        sleepFor(4);

    }
}
