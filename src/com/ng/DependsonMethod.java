package com.ng;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

 class Calculator {
	 
    public static int add(int a, int b){
        return a+b;
    }
 
    public static int divide(int a, int b){
        return a/b;
    }
 
}

 
 class DependsonMethod {
 
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod()");
    }
 
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod()\n");
    }
     
    @Test(invocationCount=2)
    public void testAdd() {
        System.out.println("testAdd()");
       Assert.assertEquals(Calculator.add(15, 2) , 17);
    }
 
    @Test
    public void testDivide() {
        System.out.println("testDivide()");
        Calculator calculator = new Calculator();
        Assert.assertEquals(Calculator.divide(16, 0), 16);
    }
     
    @Test(dependsOnMethods={"testAdd","testDivide"})
    public void testProcessRealNumbers() {
        System.out.println("testProcessRealNumbers()");
    }
 
    @Test(dependsOnMethods={"testAdd", "testDivide"}, alwaysRun=true)
    public void testProcessEvenNumbers() {
        System.out.println("testProcessEvenNumbers()");
    }
 
}


