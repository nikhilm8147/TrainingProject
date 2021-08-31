package com.example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class NewTest {
	
	Calculator calc=new Calculator();
	
// 	@Test(dataProvider="abcd",priority=-1)
// 	  public void add(int exp,int a,int b) {
// 	    Assert.assertEquals(exp,calc.add(a, b) );
// 	  }
	
	
// 	 @DataProvider(name="abcd")
// 	  public Object[][] getData(){
// 		 Object[][] table_values=new Object[][] { {10,5,5},
// 			                                      {20,10,10},
// 			                                      {100,30,30},
// 			                                      {300,150,150}
// 			                                              };
			  
// 			  return table_values;
// 		  }
  
	@BeforeSuite
	public void before_suite1() {
		System.out.println("Before Suite file");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
//   @Test(dependsOnMethods = {"d"})
//   public void a() {
// 	  System.out.println("testa");
//   }
  
  @Test(priority=2)
  public void b() {
	  System.out.println("testb");
  }
  
  @Test(priority=1)
  public void c() {
	  System.out.println("testc");
  }
  
  @Test(groups= {"Functional test"})
  public void d() {
	  System.out.println("testd");
  }
  
  @Test(groups= {"Smoke test"})
  public void f() {
	  System.out.println("testf");
  }
  
  @Test(enabled=false)
  public void ab() {
	  System.out.println("testab");
  }
  
//   @Test(expectedExceptions=ArithmeticException.class)
//   public void bc() {
// 	  int i=10/0;
//   }
  
  @Test
  public void cd() {
	  Reporter.log("Test message",true);
  }
  
//   @Test(timeOut=5000)
// 	public void timout() throws InterruptedException {
// 		System.out.println("start");
// 		int i=1;
// 		while(i>0){
// 			i++;
// 			Thread.sleep(1000);
// 			System.out.println(i);	
// 		}
		
	}
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after");
  }
  
  @AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	
  @AfterSuite
	public void after_suite1() {
		System.out.println("After Suite file ");
	}

}
