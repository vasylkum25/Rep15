package kum.Mocito.ServiceImpl;

import kum.Mocito.OrderDao.OrderDao;
import kum.Mocito.Service.Order;
import kum.Mocito.Service.Service;

public class ServiceImpl implements Service{

	private OrderDao orderDao;
	
	public ServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}



	public Order oreder(int id) {
		Order result = orderDao.isOrderExist(id);
	    if(result!=null && result.getId()==2){
	    	throw new IllegalArgumentException("Is Object Two");
	    }
		return result; 
	}

}
