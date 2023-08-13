package com.driver;

public class Main {
     RWOnly obj= new RWOnly();
//      System.out.println(obj.name);   //name has private access in com.driver.RWOnly
      obj.setname("IFFCO");
      System.out.println(obj.getname());
}
