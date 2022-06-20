package order;

import classess.Customer;
import interfaces.CostDiscount;
import interfaces.Order;

public class CustomerOrderHW2 implements Order, CostDiscount {// Önceki sınıfla aynı olup factory işlemleri uygulanabilmesi için Order interface'i implement edilip fonksiyon yazıldı.
	
	private Customer c;
	private double orderPrice;
	private String orderMonth;

	public CustomerOrderHW2(Customer c, double price, String orderMonth) {// Constructor
		
		this.c=c;
		this.orderMonth=orderMonth;
		orderPrice=this.discountCost(price);
	}

	public double discountCost(double price) {// Interface'den alınan bu method, tekil müşteriler için yüzde 20 indirim yapıp fiyat değerini değiştirecek.
		
		return price*0.80;
	}
	
	
	// get-set metodları
	public Customer getC() {
		return c;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public String getOrderMonth() {
		return orderMonth;
	}

	@Override
	public void printOrderAndInformation() {
		System.out.println(c.toString()+", Order Month:"+orderMonth+", Price:"+orderPrice);

	}

}
