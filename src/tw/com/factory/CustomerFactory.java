package tw.com.factory;

import tw.com.dao.CustomerDao;
import tw.com.daoImpl.CustomerDaoImpl;

public class CustomerFactory {

	public static CustomerDao getCustomerDaoFactory() {

		return new CustomerDaoImpl();
	}
}
