package com.dhana.news;

import org.testng.annotations.Test;

public class TestNG_Priority_Annotations {

    @Test(priority=6)
    public void c_method(){
    System.out.println("I'm in method C");
    }
    @Test(priority=9)
    public void b_method(){
    System.out.println("I'm in method B");
    }
    @Test(priority=1)
    public void a_method(){
    System.out.println("I'm in method A");
    }
    @Test(priority=0)
    public void e_method(){
    System.out.println("I'm in method E");
    }
    @Test(priority=3)
    public void d_method(){
    System.out.println("I'm in method D");
    }
    @Test
    public void No_method(){
	    System.out.println("I'm in method No");
	    }

    
    public void No_Annotation(){
	    System.out.println("I'm in method No Annotation");
	    }
}