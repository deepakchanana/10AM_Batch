package pkg1;

import java.util.*;


public class Class1 
{
public static void main(String[] args) 
{
  HashMap<Integer, String> hm=new HashMap<Integer,String>();
  hm.put(2, "Deepak");
  hm.put(1,"Chanana");
  hm.put(12,"Automation");
  hm.put(67, "Selenium");
  hm.put(56,"QTP");
  hm.put(89,"API");
  hm.put(891,"API");
  
  Set<Integer> all=hm.keySet();  // it will give you all the keys
  
  for(Integer i:all) {
	  System.out.println("key is "+i);
	  System.out.println("value is "+hm.get(i));
  }
  
}	

}
