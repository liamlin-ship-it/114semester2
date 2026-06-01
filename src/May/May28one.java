package May;

import java.util.ArrayList;

class Drink {
    private final String name;
    private final int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Drink: " + name + ", Price: " + price;
    }
}

class Cafe {
    private final ArrayList<Drink> menu;

    public Cafe() {
        menu = new ArrayList<>();
        addSomeDrinks();
    }

    public void addSomeDrinks() {
        Drink americano = new Drink("Americano", 60);
        Drink latte = new Drink("Latte", 80);
        Drink moche = new Drink("Mocha", 95);

        menu.add(americano);
        menu.add(latte);
        menu.add(moche);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Drink drink : menu) {
            result.append(drink).append("\n");
        }
        return result.toString();
    }
}

public class May28one {
    public static void main(String[] args) {
        Cafe myCafe = new Cafe();
        System.out.println("--- Welcome to Our Cafe ---");
        System.out.println("Our menu includes the following drinks:");
        System.out.print(myCafe);
    }
}
