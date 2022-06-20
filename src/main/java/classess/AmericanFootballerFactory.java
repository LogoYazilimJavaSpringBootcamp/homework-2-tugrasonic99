package classess;

import abstractclass.AbstractFactory;
import footballers.ArgentinianFootballer;
import footballers.BrazillianFootballer;
import interfaces.Footballer;

public class AmericanFootballerFactory extends AbstractFactory {// Arjantin ve Brezilyalı futbolcu oluşturacak.

	@Override
	public Footballer createFootballer(String nationality) {
		if(nationality.equalsIgnoreCase("Argentinian")) {
			return new ArgentinianFootballer();
		}
		else if(nationality.equalsIgnoreCase("Brazillian")) {
			return new BrazillianFootballer();
		}
		
		return null;
	}

}
