package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main1(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.close();
    }

	public static void main(String[] args) {
		int a = 0;
		if(a>=0) {
		    if(a==0) {
		        System.out.println("1 ");
		    } else {
		        System.out.println("2 ");
		    }
		}
		System.out.println("3 ");
	}
}
