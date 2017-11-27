package kum.Mocito;

import static org.junit.Assert.assertEquals;

import java.util.regex.Matcher;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import kum.Mocito.OrderDao.OrderDao;
import kum.Mocito.Service.Order;
import kum.Mocito.Service.Service;
import kum.Mocito.ServiceImpl.ServiceImpl;

public class TeasServiceImpl {

	
	private Service serviceImpl;
	
	private OrderDao orderDao;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	@Before
	public void setUp(){
		orderDao = Mockito.mock(OrderDao.class);
		serviceImpl = new ServiceImpl(orderDao);
	}
		
	@Test
	public void testIsOrderExistWhanUserSucessfully(){
		Mockito.when(orderDao.isOrderExist(1)).thenReturn(new Order(1));
		
		Order result = serviceImpl.oreder(1);
		
		assertEquals(result, new Order(1));
	}
	
	@Test
	public void testIsOrderIsNotExist(){
		Mockito.when(orderDao.isOrderExist(1)).thenReturn(null);
		
		Order result = serviceImpl.oreder(1);
		
		assertEquals(result, null);
	}
	
	@Test
	public void testIsOrderIsEqualTwo(){
		thrown.expect(IllegalArgumentException.class);
		Mockito.when(orderDao.isOrderExist(2)).thenReturn(new Order(2));
		
		serviceImpl.oreder(2);
		
	}
	
}
