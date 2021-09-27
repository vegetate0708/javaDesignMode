package Pattren1.FactoryPattern;

public class MainDemo {
public static void main(String[] args) {
	NYPizzaStore nyPizzaStore=new NYPizzaStore();
	Pizza pizza=nyPizzaStore.orderPizza("cheese");
	System.out.println("Order a "+pizza.getName());
}
}
