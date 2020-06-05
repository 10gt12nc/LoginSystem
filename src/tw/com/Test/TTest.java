package tw.com.Test;

import org.junit.jupiter.api.Test;

import tw.com.dao.CustomerDao;
import tw.com.factory.CustomerFactory;

public class TTest {
	
	@Test
	public void getTest() {
		
		String username = "Aa林";
		String password = "123";
		int i = 0; //0 = 無
		
//		String username = "哈哈";
//		String password = "523";
//		int i = 0; 
		
		CustomerDao dao = CustomerFactory.getCustomerDaoFactory();
		int login = dao.getLoginCheck(username, password, i);
		int logname = dao.getUserNameCheck(username, i);
		int logpass = dao.getUserPassCheck(password, i);
		
		System.out.println(login+":"+logname+":"+logpass);

	}

}
