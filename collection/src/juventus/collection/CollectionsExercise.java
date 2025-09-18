package juventus.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsExercise {

    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
    }

    static void arrayList() {
        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
    	List<String> animals = new ArrayList<>();
    	animals.add("Fisch");
    	animals.add("Hund");
    	animals.add("Katze");
    	animals.add("Maus");
    	animals.add("Meerschweinchen");
    	animals.add("Vogel");
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
    	System.out.println(animals.size());
        // TODO: Füge ein weiteres Element mit Index 2 hinzu.
    	animals.add(2, "Kuh");
        // TODO: Gib die ganze Liste auf der Konsole aus.
    	System.out.println(animals);
    	System.out.println(animals.size());
        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
    	System.out.println(animals.contains("Kuh"));
        // TODO: Ein Element lesen via Index.
    	System.out.println(animals.get(0));
        // TODO: Ein Element löschen via Index
    	animals.remove(5);
    	animals.add(1,"TestOhneIndex");
    	System.out.println(animals);
        // TODO: Ein Element löschen via String
        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
        // TODO: Alle Elemente aus der Liste löschen
    }

    static void linkedList() {
    	System.out.println();
    	System.out.println("Exercise linkedList");
        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
    	LinkedList<String> tiere = new LinkedList<String>();
    	tiere.add("Hund");
    	tiere.add("Katze");
    	tiere.add("maus");
    	tiere.add("Leopard");
    	tiere.add("Huhn");
    	tiere.add("Esel");
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
    	System.out.println(tiere.size());
        // TODO: Den Index eines bestimmten Elements finden
    	System.out.println(tiere.get(5));
        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
    	//RESULT: Exception failure
    	
    	//System.out.println(tiere.get(6));
        // TODO: Ein Element via Index lesen
    	String element = tiere.get(2);
    	System.out.println(element);
        // TODO: Das erste und letzte Element der Liste ausgeben
    	System.out.println("Das ist das erste Tier in der linkedList: " + tiere.getFirst());
    	System.out.println("Das ist das letzte Tier in der linkedList: " + tiere.getLast());
        // TODO: Das erste und letzte Element der Liste löschen
    	System.out.println("Anzahl Eintraege vor dem remove: " + tiere.size());
    	tiere.removeFirst();
    	tiere.removeLast();
    	System.out.println("Anzahl Eintraege nach dem remove: " + tiere.size());
    }

    static void hashSet() {
    	System.out.println();
    	System.out.println("Exercise hashSet");
        // TODO: Erstelle ein HashSet von Personen (object package)
    	HashSet<String> autos = new HashSet<String>();
    	autos.add("Audi");
    	autos.add("FIAT");
    	autos.add("OPEL");
    	autos.add("Lancia");
    	autos.add("BMW");
    	System.out.println("Anzahl Elemente aus Hashset: " + autos.size());
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
    	autos.add("BMW");
    	autos.add("zastava");
    	
    	HashSet<String> kopie = new HashSet<>(autos); //Kopiere alle Werte im kopie
    	
        // TODO: Prüfe, ob das Set nicht leer ist
    	if (!autos.isEmpty()) {
    		System.out.println("Das Set-autos ist nicht leer.");
    	}
    	else {
    		System.out.println("Das Set-autos ist leer.");
    	}
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
    	System.out.println("Anzahl Elemente aus Hashset: " + autos.size());
    	autos.clear();
    	System.out.println("Anzahl Elemente aus Hashset nach autos.clear(): " + autos.size());
    	
    	// TODO: Prüfe, ob das Set nicht leer ist
    	if (!autos.isEmpty()) {
    		System.out.println("Das Set-autos ist nicht leer.");
    	}
    	else {
    		System.out.println("Das Set-autos ist leer.");
    	}
    	
    	autos.addAll(kopie);
    	System.out.println("Anzahl Elemente aus Hashset nach autos.addAll(): " + autos.size());
    	
        // TODO: Prüfe, ob ein gewisses Element im Set existiert
    	String gesucht = "fico";
    	if (autos.contains(gesucht)) {
    		System.out.println(gesucht + " ist vorhanden.");
    	}
    	else {
    		System.out.println(gesucht + " ist nicht vorhanden.");
    	}
        // TODO: Lösche ein bestimmtes Element aus dem Set
    	System.out.println(autos);
    	autos.remove("FIAT");
    	System.out.println(autos);
    	autos.add("FIAT");
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    	System.out.println(autos); //unsortiert
    	//alphabetisch soriert
    	TreeSet<String> alphabetisch = new TreeSet<>(autos);
    	System.out.println(alphabetisch);
    }

    static void linkedHashSet() {
        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Prüfe, ob das Set nicht leer ist
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void treeSet() {
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
    }

    static void hashMap() {
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        //  (Wieviele Einträge sind jetzt in der Map?)
        // TODO: Gib das entrySet auf der Konsole aus
        // TODO: Gib das keySet auf der Konsole aus
        // TODO: Gib die values auf der Konsole aus
    }

    static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Greife auf mehrere Elemente zu
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
    }

    static void treeMap() {
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
    }

}