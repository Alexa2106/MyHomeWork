package autoFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Paris {

	public static void main(String[] args) {
		
		String exePath = "C:\\Program Files\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		WebDriver driver = new ChromeDriver();

		driver.get("http://booking.com");

//	    WebElement city = driver.findElement(By.xpath(".//input[@type=\"search\"]"));
//	    city.sendKeys("Париж");
//		city.submit();
//
//		driver.navigate().to("https://www.booking.com/searchresults.ru.html?label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB&sid=e47f9df75ead260e1aacfbf6eeba13e4&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Fsearchresults.ru.html%3Flabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB%3Bsid%3De47f9df75ead260e1aacfbf6eeba13e4%3Btmpl%3Dsearchresults%3Bac_click_type%3Db%3Bac_position%3D0%3Bclass_interval%3D1%3Bdest_id%3D-1456928%3Bdest_type%3Dcity%3Bdtdisc%3D0%3Bfrom_sf%3D1%3Bgroup_adults%3D2%3Bgroup_children%3D0%3Biata%3DPAR%3Binac%3D0%3Bindex_postcard%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Bpostcard%3D0%3Braw_dest_type%3Dcity%3Broom1%3DA%252CA%3Bsb_price_type%3Dtotal%3Bsearch_selected%3D1%3Bshw_aparth%3D1%3Bslp_r_match%3D0%3Bsrc%3Dindex%3Bsrc_elem%3Dsb%3Bsrpvid%3Df71c8119c56d00d5%3Bss%3D%25D0%259F%25D0%25B0%25D1%2580%25D0%25B8%25D0%25B6%252C%2520%25D0%2598%25D0%25BB%25D1%258C-%25D0%25B4%25D0%25B5-%25D0%25A4%25D1%2580%25D0%25B0%25D0%25BD%25D1%2581%252C%2520%25D0%25A4%25D1%2580%25D0%25B0%25D0%25BD%25D1%2586%25D0%25B8%25D1%258F%3Bss_all%3D0%3Bss_raw%3D%25D0%25BF%25D0%25B0%25D1%2580%25D0%25B8%25D0%25B6%3Bssb%3Dempty%3Bsshis%3D0%26%3B&ss=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&ssne=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&ssne_untouched=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&city=-1456928&checkin_year=&checkin_month=&checkout_year=&checkout_month=&group_adults=2&group_children=0&no_rooms=1");
//		
//		WebElement element = driver.findElement(By.xpath("(.//div[@class=\"sb-date-field__display\"])[1]")); 
//		element.click();
//		
//		driver.navigate().to("https://www.booking.com/searchresults.ru.html?label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB&sid=e47f9df75ead260e1aacfbf6eeba13e4&sb=1&src=searchresults&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Fsearchresults.ru.html%3Flabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB%3Bsid%3De47f9df75ead260e1aacfbf6eeba13e4%3Btmpl%3Dsearchresults%3Bcity%3D-1456928%3Bclass_interval%3D1%3Bdest_id%3D-1456928%3Bdest_type%3Dcity%3Bdtdisc%3D0%3Bgroup_adults%3D2%3Bgroup_children%3D0%3Binac%3D0%3Bindex_postcard%3D0%3Blabel_click%3Dundef%3Bno_rooms%3D1%3Boffset%3D0%3Bpostcard%3D0%3Broom1%3DA%252CA%3Bsb_price_type%3Dtotal%3Bshw_aparth%3D1%3Bslp_r_match%3D0%3Bsrc%3Dsearchresults%3Bsrc_elem%3Dsb%3Bsrpvid%3De026811c6c320097%3Bss%3D%25D0%259F%25D0%25B0%25D1%2580%25D0%25B8%25D0%25B6%3Bss_all%3D0%3Bssb%3Dempty%3Bsshis%3D0%3Bssne%3D%25D0%259F%25D0%25B0%25D1%2580%25D0%25B8%25D0%25B6%3Bssne_untouched%3D%25D0%259F%25D0%25B0%25D1%2580%25D0%25B8%25D0%25B6%26%3B&ss=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6%2C+%D0%98%D0%BB%D1%8C-%D0%B4%D0%B5-%D0%A4%D1%80%D0%B0%D0%BD%D1%81%2C+%D0%A4%D1%80%D0%B0%D0%BD%D1%86%D0%B8%D1%8F&is_ski_area=0&ssne=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&ssne_untouched=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&city=-1456928&checkin_year=2019&checkin_month=3&checkin_monthday=27&checkout_year=2019&checkout_month=4&checkout_monthday=4&group_adults=2&group_children=0&no_rooms=1&from_sf=1&ss_raw=%D0%BF%D0%B0%D1%80%D0%B8%D0%B6&ac_position=0&ac_langcode=ru&ac_click_type=b&dest_id=-1456928&dest_type=city&iata=PAR&place_id_lat=48.856682&place_id_lon=2.351476&search_pageview_id=e026811c6c320097&search_selected=true");
//		
//        WebElement moreCheaper = driver.findElement(By.xpath("(.//a[@class=\"sort_option \"])[2]")); 
//        moreCheaper.click();
//		
//        
//        WebElement budget = driver.findElement(By.xpath("(.//div[@class=\"bui-checkbox__label filter_item css-checkbox\"])[1]")); 
//        budget.click();
//        
        driver.navigate().to("https://www.booking.com/searchresults.ru.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB&sid=5e713207f687693a431d54ea40b9f4ff&sb=1&src=index&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Findex.ru.html%3Faid%3D304142%3Blabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB%3Bsid%3D5e713207f687693a431d54ea40b9f4ff%3Bsb_price_type%3Dtotal%3Bsrpvid%3D2416820ef9a80050%26%3B&ss=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&is_ski_area=0&ssne=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&ssne_untouched=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6&dest_id=-1456928&dest_type=city&checkin_year=2019&checkin_month=3&checkin_monthday=27&checkout_year=2019&checkout_month=4&checkout_monthday=4&no_rooms=1&group_adults=2&group_children=0&b_h4u_keep_filters=&from_sf=1");
        
        WebElement adults = driver.findElement(By.xpath(".//select[@name=\"group_adults\"]")); 
        Select adults1 = new Select(adults);
        adults1.selectByVisibleText("4 взрослых");
        

        WebElement room = driver.findElement(By.xpath(".//select[@name=\"no_rooms\"]"));
        Select room1 = new Select(room);
        room1.selectByValue("2"); 
		
        WebElement find = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]")); 
        find.click();
		
        WebElement moreCheaper2 = driver.findElement(By.xpath("(.//a[@class=\"sort_option \"])[2]")); 
        moreCheaper2.click();
        
        
        driver.navigate().to("https://www.booking.com/hotel/fr/bastille-opera-paris.ru.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB&sid=182563cfc86d3c90fd492dd0a5fbe955&srpvid=f6968a63bb0b019c&ucfs=1&srpvid=f6968a63bb0b019c&srepoch=1553370055&group_adults=4&group_children=0&req_adults=4&req_children=0&room1=A,A&room2=A,A&hpos=9&hapos=9&checkin=2019-03-27&checkout=2019-04-04&dest_id=-1456928&dest_type=city&sr_order=price&all_sr_blocks=440756301_131812715_4_0_0&highlighted_blocks=440756301_131812715_4_0_0&from=searchresults;hptv=do");
        
        
		WebElement sss = driver.findElement(By.xpath("(.//span[@class=\"b-button__text\"])[3]")); 
		sss.click();
        
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		WebElement aa = driver.findElement(By.xpath("//*[@id=\"b_tt_holder_3\"]")); 
//		aa.click();
//        aa.submit();
        
        driver.navigate().to("https://secure.booking.com/book.html?hotel_id=4407563&aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB&sid=f17f4d33689be02b23d0fbe6ef69dfad&room1=A%2CA&room2=A%2CA&error_url=%2Fhotel%2Ffr%2Fbastille-opera-paris.ru.html%3Faid%3D304142%3Blabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYASG4ARfIAQzYAQHoAQH4AQuIAgGoAgO4Ar7x2eQFwAIB%3Bsid%3Df17f4d33689be02b23d0fbe6ef69dfad%3Bsrpvid%3Df6968a63bb0b019c%26%3B&hostname=www.booking.com&stage=1&checkin=2019-03-27&interval=8&children_extrabeds=&hp_visits_num=1&rt_pos_selected=1&rt_pos_selected_within_room=1&rt_num_blocks=4&rt_num_rooms=1&from_source=hotel&nr_rooms_440756301_131812715_4_0_0=1&is_group_recommendation=1");
        
        
        WebElement lName = driver.findElement(By.xpath(".//input[@id=\"lastname\"]")); 
        lName.sendKeys("Ryartseva");
       
        
        WebElement email = driver.findElement(By.xpath(".//input[@id=\"email\"]")); 
        email.sendKeys("alexandragorbacheva21062001@gmail.com");
       
        
        WebElement emailConfirm = driver.findElement(By.xpath(".//input[@id=\"email_confirm\"]")); 
        emailConfirm.sendKeys("alexandragorbacheva21062001@gmail.com");
        emailConfirm.submit();

        
        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"b_tt_holder_5\"]/button")); 
        confirm.click();
        
        WebElement adress = driver.findElement(By.xpath(".//input[@id=\"address1\"]")); 
        adress.sendKeys("Belarus");
        
        
        
        WebElement city = driver.findElement(By.xpath(".//input[@id=\"city\"]")); 
        city.sendKeys("Minsk");
        
        
        WebElement country = driver.findElement(By.xpath(".//select[@name=\"cc1\"]")); 
        Select con = new Select(country);
        con.selectByVisibleText("Беларусь");
        
        WebElement card = driver.findElement(By.xpath(".//select[@id=\"cc_type\"]")); 
        Select car = new Select(card);
        car.selectByVisibleText("Visa");
        
        WebElement number = driver.findElement(By.xpath(".//input[@id=\"cc_number\"]")); 
        number.sendKeys("4242 4242 4242 4242");
       
        
        
        WebElement cvs = driver.findElement(By.xpath(".//input[@name=\"cc_cvc\"]")); 
        cvs.sendKeys("021");
        cvs.submit();
        
        
        
        
        
        
        

	}

}
