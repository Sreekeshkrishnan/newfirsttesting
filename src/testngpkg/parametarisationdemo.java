package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametarisationdemo {
 @Parameters("a")
 @Test
 public void test(String v)
 {
	 System.out.println(v);
 }
}
