import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Arancia"));
        fruits.add(new Fruit("Banana"));

        System.out.println(fruits);

        fruits.addFirst(new Fruit("Susina"));
        fruits.addLast(new Fruit("Pera"));

        System.out.println("Aggiunto elementi");
        System.out.println(fruits);
    }
}