package com.driver;

public class Main {
     RWOnly obj= new RWOnly();
//      obj.name="kunal";  //name has private access in com.driver.RWOnly
      obj.setName("kunal");
      obj.getName();
}
