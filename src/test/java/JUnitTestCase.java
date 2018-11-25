import java.sql.SQLException;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zycus.dao.interfaces.CarPartDao;
import com.zycus.entity.CarPart;

public class JUnitTestCase {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
		CarPartDao carPartDao = (CarPartDao)(applicationContext.getBean("carPartsDAO1"));
		CarPart carPart = new CarPart();
		carPart.setCarModel("Tera Nivasa");
		carPart.setPartName("Headlights");
		carPart.setPrice(50200);
		carPart.setQuantity(025);
		try {
			carPartDao.addNewPart(carPart);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void testcase2()
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-config.xml");
		CarPartDao carPartDao = (CarPartDao)(applicationContext.getBean("carPartsDAO1"));
		System.out.println(carPartDao.getCarParts());
	}
	@Test
	public void testJson()
	{
		CarPart carPart = new CarPart();
		carPart.setCarModel("Tina Subasa");
		carPart.setPartNo(230);
		CarPart carPart2 = carPart.getFromJson(carPart.toString());
		System.out.println(carPart2.getCarModel());
	}

}
