package classess;

import interfaces.Order;
import order.CustomerOrderHW2;
import order.FirmOrderHW2;

public class OrderFactory {// Bu factory aldığı müşteri bireyine göre yeni sipariş oluşturacak.
	
	public Order createOrder(String client,Customer f,double orderPrice, String orderMonth) throws IllegalAccessException, InstantiationException {
		// Exception'lar obje type sorunlarını kurtarmak için atıldı.
		
		if(client.equalsIgnoreCase("Customer")) {
			return new CustomerOrderHW2((Customer) f,orderPrice,orderMonth);
			
		}
		else if(client.equalsIgnoreCase("Firm")) {
			return new FirmOrderHW2((Firm) f,orderPrice,orderMonth);
		}
		
		return null;
		
	}

}
