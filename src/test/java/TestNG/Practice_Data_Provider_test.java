package TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Practice_Data_Provider_test {

		@Test(dataProvider = "details",enabled = false)
		public void getData(String company, String location) {
			System.out.println("company is: "+company+", Location is : "+location);
		}
		
		// make enable as true to run below method
		@Test(dataProviderClass = Practice_Data_provider2_test.class,dataProvider = "excelData",enabled = false)
		public void getData2(String src, String dest, String price) {
			System.out.println("From "+src+", To : "+dest+"  Cost is : "+price);
		}
		
		@Test(dataProvider = "genericDP",enabled = false)
		public void getData3(String src, String dest, String price) {
			System.out.println("From "+src+", To : "+dest+"  Cost is : "+price);
		}
		
		@Test(dataProvider = "genericDP2")

		
		@DataProvider(name="details")
		public Object[][] storeData(){
			Object[][] obj = new Object[2][2];
			obj[0][0] = "TestYantra";
			obj[0][1] = "Bangalore";
			
			obj[1][0] = "Qspider";
			obj[1][1] = "BTM";
			return obj;
		}
		

		
//		@DataProvider
//		public Object[][] storeData2(){
//			Object[][] obj = new Object[2][2];
//			obj[0][0] = "Indigo";
//			obj[0][1] = "Bangalore";
//			
//			obj[1][0] = "Qspider";
//			obj[1][1] = "BTM";
//			return obj;
//		}
}

