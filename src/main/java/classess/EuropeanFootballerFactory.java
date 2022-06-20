package classess;

import abstractclass.AbstractFactory;
import footballers.ItalianFootballer;
import footballers.SpanishFootballer;
import interfaces.Footballer;

public class EuropeanFootballerFactory extends AbstractFactory {// İspanyol ya da İtalyan futbolcu oluşturacak

	 
	public Footballer createFootballer(String nationality) {
		if(nationality.equalsIgnoreCase("Spanish")) {
			return new SpanishFootballer();
		}
		else if(nationality.equalsIgnoreCase("Italian")) {
			return new ItalianFootballer();
		}
		return null;
	}

}
