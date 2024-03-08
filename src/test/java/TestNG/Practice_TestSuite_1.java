package TestNG;

import static org.testng.Assert.fail;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.*;

//import com.onlineBankingSystem.genericutils.BaseClass;

//@Listeners(com.onlineBankingSystem.genericutils.ListnerImplementationClass.class)
public class Practice_TestSuite_1 {

		@Test(groups="regressionsuit")
		public void testscript_01() {
			String s = "abcd";
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(s, "abcd", "message pass");
			
			sa.assertSame(s, "abcd");
//			fail();
			
			
			sa.assertAll();
			System.out.println("--testscript_01--");
		}
		
		@Test(groups="smokesuit")
		public void testscript_02() {
			System.out.println("--testscript_02--");
			System.out.println("--------------------------");
		}
	
}
