package classess;

import abstractclass.AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory createFactory(String nation) {// Bulunan bölgeye göre factory oluşturulacak.
		if(nation.equalsIgnoreCase("American")) {
			return new AmericanFootballerFactory();
			
		}
		else if(nation.equalsIgnoreCase("European")) {
			return new EuropeanFootballerFactory();
			
		}
		return null;
		
	}

}
