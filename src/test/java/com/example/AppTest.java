package com.example;
import org.junit.Test;
import org.junit.Assert;

public class AppTest 
{
    @Test
    public void testApp()
    {
	App app=new App();
	int result=app.add(2,3);
	System.out.println("the result of add of 2 and 3 ahould be : " + result);
        Assert.assertEquals(5,result);
    }
}
