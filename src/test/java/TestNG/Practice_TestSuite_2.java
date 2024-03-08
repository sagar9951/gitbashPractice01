package TestNG;

import org.testng.annotations.Test;

//import com.onlineBankingSystem.genericutils.BaseClass;

public class Practice_TestSuite_2 {
	@Test(groups="smokesuit")
	public void testscript_03() {
		System.out.println("--testscript_03--");
	}
	
	@Test(groups="regressionsuit")
	public void testscript_04() {
		System.out.println("--testscript_04--");
		System.out.println("--------------------------");
	}
}
