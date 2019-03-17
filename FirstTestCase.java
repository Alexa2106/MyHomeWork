package automationFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C:\\Program Files\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("http://booking.com");

		WebElement city = driver.findElement(By.xpath(".//input[@type=\"search\"]"));
		city.sendKeys("Москва Россия");
		city.submit();

		driver.navigate().to(
				"https://www.booking.com/searchresults.ru.html?label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4AtHkteQFwAIB&sid=007a0aee4464b1f754fe4e0b78e56d09&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Fsearchresults.ru.html%3Flabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4AtHkteQFwAIB%3Bsid%3D007a0aee4464b1f754fe4e0b78e56d09%3Btmpl%3Dsearchresults%3Bclass_interval%3D1%3Bdest_id%3D-2960561%3Bdest_type%3Dcity%3Bdtdisc%3D0%3Bfrom_sf%3D1%3Bgroup_adults%3D2%3Bgroup_children%3D0%3Binac%3D0%3Bindex_postcard%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Bpostcard%3D0%3Broom1%3DA%252CA%3Bsb_price_type%3Dtotal%3Bshw_aparth%3D1%3Bslp_r_match%3D0%3Bsrc%3Dindex%3Bsrc_elem%3Dsb%3Bsrpvid%3D5fcd9aeb4156004d%3Bss%3D%25D0%259C%25D0%25BE%25D1%2581%25D0%25BA%25D0%25B2%25D0%25B0%2520%25D0%25A0%25D0%25BE%25D1%2581%25D1%2581%25D0%25B8%25D1%258F%3Bss_all%3D0%3Bssb%3Dempty%3Bsshis%3D0%26%3B&ss=%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B0&is_ski_area=0&ssne=%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B0&ssne_untouched=%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B0&city=-2960561&checkin_year=2019&checkin_month=3&checkin_monthday=31&checkout_year=2019&checkout_month=4&checkout_monthday=20&group_adults=2&group_children=0&no_rooms=1&from_sf=1");

		WebElement highRate = driver.findElement(By.xpath("(.//a[@class=\"sort_option \"])[3]"));
		highRate.click();

		WebElement listOfHotel = driver.findElement(By.xpath("		.//div[@id=\"hotellist_inner\"]"));
		System.out.println(listOfHotel.getText());

		WebElement firstHighRateHotel = driver.findElement(By.xpath("(.//span[@class=\"b-button__text\"])[1]"));
		firstHighRateHotel.click();

		WebElement rateHotel = driver.findElement(By.xpath("(.//div[@class=\"bui-review-score__badge\"])[1]"));
		rateHotel.click();

		System.out.println("----------------------------------");

		int numberOfCounts = 9;

		String rateOfHotelStr = rateHotel.getText();
		int rateOfHotelInt = Integer.parseInt(rateOfHotelStr);

		if (rateOfHotelInt >= numberOfCounts) {
			System.out.println(rateOfHotelInt);
		}

	}

}
