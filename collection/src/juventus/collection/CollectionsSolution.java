package juventus.collection;

import juventus.object.Person;

import java.util.*;

public class CollectionsSolution {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
        loops();
    }

    static void arrayList() {
        List<String> animals = new ArrayList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Katze");
        animals.add("Maus");
        animals.add("Vogel");

        System.out.println(animals.size());

        animals.add(2, "Fisch");

        System.out.println(animals);

        System.out.println(animals.contains("Maus"));

        System.out.println(animals.get(0));

        animals.remove(3);
        animals.remove("Vogel");

        animals.clear();
    }

    static void linkedList() {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Katze");
    }