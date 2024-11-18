import Cheese.*;
import Clams.*;
import Dough.*;
import Pepperoni.*;
import Sauce.*;
import Veggies.*;

public interface PizzaIngredientFactory {

	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClam();

}
