package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void listDemo() {
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void queueDemo() {
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();
        System.out.println(fruit);
        System.out.println(fruit.peek());
    }

    public static void mapDemo() {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));

        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);
    }

    public void print(Collection<String> collection) {
        var i = collection.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        for(String item : collection) {
            System.out.println(item);
        }

        collection.forEach(System.out::println);
    }

    public void print(Map<String, Integer> map) {
        for(var entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        map.forEach(
                (k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
