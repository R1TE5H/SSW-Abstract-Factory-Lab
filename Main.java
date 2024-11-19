public class Main {
    public static void main(String[] args){
        // The driver for ordering a pizza from any franchise
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza pizza = nyPizzaStore.orderPizza("cheese");

    System.out.println(pizza);

    PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
    Pizza pizza1 = chicagoPizzaStore.orderPizza("cheese");
   
    System.out.println(pizza1); 

    }
}
