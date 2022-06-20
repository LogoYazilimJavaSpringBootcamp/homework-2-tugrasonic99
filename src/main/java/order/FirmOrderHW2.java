package order;

import classess.Firm;
import interfaces.CostDiscount;
import interfaces.Order;

public class FirmOrderHW2 implements CostDiscount, Order {// Önceki sınıfla aynı olup factory işlemleri uygulanabilmesi için Order interface'i implement edilip fonksiyon yazıldı.
	

	
	private Firm f;
	private double orderPrice;
	private String orderMonth;

	public FirmOrderHW2(Firm f,double price,String orderMonth) {// Constructor
		
		this.f=f;
		orderPrice=this.discountCost(price);
		this.orderMonth=orderMonth;
		
	}
	
	
    // get-set metodları
	public Firm getF() {
		return f;
	}
	
	



	public double getOrderPrice() {
		return orderPrice;
	}



	public String getOrderMonth() {
		return orderMonth;
	}



	public double discountCost(double price) {
		
		return price*0.75;
	}

	@Override
	public void printOrderAndInformation() {
		System.out.println(f.toString()+", Order Month:"+orderMonth+", Price:"+orderPrice);
		
	}

}
