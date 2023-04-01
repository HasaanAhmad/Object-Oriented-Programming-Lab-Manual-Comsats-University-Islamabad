package LAB5;

class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        double cost = 0.0;

        if (size.equalsIgnoreCase("small")) {
            cost = 10 + (2 * (cheeseToppings + pepperoniToppings + hamToppings));
        } else if (size.equalsIgnoreCase("medium")) {
            cost = 12 + (2 * (cheeseToppings + pepperoniToppings + hamToppings));
        } else if (size.equalsIgnoreCase("large")) {
            cost = 14 + (2 * (cheeseToppings + pepperoniToppings + hamToppings));
        }

        return cost;
    }

    public String getDescription() {
        return "Size: " + size + ", Cheese Toppings: " + cheeseToppings + ", Pepperoni Toppings: " + pepperoniToppings
                + ", Ham Toppings: " + hamToppings;
    }
}

class PizzaOrder {
    private Pizza[] pizzas;
    private int numPizzas;

    public PizzaOrder() {
        pizzas = new Pizza[3];
        numPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (numPizzas < 3) {
            pizzas[numPizzas] = pizza;
            numPizzas++;
        } else {
            System.out.println("Maximum pizzas per order is 3.");
        }
    }

    public double calcTotal() {
        double totalCost = 0.0;

        for (int i = 0; i < numPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }

        return totalCost;
    }
}

public class PizzaRunner {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("small", 1, 1, 1);
        Pizza pizza2 = new Pizza("medium", 2, 2, 2);
        Pizza pizza3 = new Pizza("large", 3, 3, 3);

        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        System.out.println(pizza1.getDescription());
        System.out.println("Cost: $" + pizza1.calcCost());
        System.out.println(pizza2.getDescription());
        System.out.println("Cost: $" + pizza2.calcCost());
        System.out.println(pizza3.getDescription());
        System.out.println("Cost: $" + pizza3.calcCost());

        System.out.println("Total cost: $" + order.calcTotal());

    }
}