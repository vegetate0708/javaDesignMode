package Pattren1.FactoryPattern;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		name="NY Style Sauce and Cheese Pizza";
		dough="Thin Crust Dough";
		sauce="Marinara Sauce";
		toppings.add("Grate Regging Cheese");
	}
   @Override
   void cut() {
	   System.out.println("Cutting the pizza into square slices");
   }
}
