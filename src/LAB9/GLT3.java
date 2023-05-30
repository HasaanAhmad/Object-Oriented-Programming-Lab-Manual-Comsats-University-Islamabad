package LAB9;

interface Compare {
    boolean compareObjects(Object o);
}

class Inventory implements Compare {
    private String name;
    private int quantity;
    private double price;

    public Inventory() {
        name = null;
        quantity = 0;
        price = 0;
    }

    public Inventory(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean compareObjects(Object o) {
        if (o instanceof Inventory) {
            Inventory i = (Inventory) o;
            if (name.equals(i.name) && quantity == i.quantity && price == i.price) {
                return true;
            }
        }
        return false;
    }
}

class GLT3 {
    public static void main(String[] args) {
        Inventory i1 = new Inventory("Apple", 10, 1.5);
        Inventory i2 = new Inventory("Apple", 10, 1.5);
        Inventory i3 = new Inventory("Orange", 10, 1.5);
        System.out.println(i1.compareObjects(i2));
        System.out.println(i1.compareObjects(i3));
    }
}
