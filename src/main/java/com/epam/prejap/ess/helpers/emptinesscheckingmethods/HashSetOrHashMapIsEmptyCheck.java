package com.epam.prejap.ess.helpers.emptinesscheckingmethods;

import java.util.*;

/**
 * Class which check empty methods on collections for maps and sets
 *
 * @author Norbert Borek
 * @since 0.4
 * @version 0.4
 */
 class HashSetOrHashMapIsEmptyCheck {

    /**
     * This method check if HashSet is empty
     */
    static boolean CheckIfSetIsEmpty() {
        System.out.println("*****IS EMPTY HASHSET*****");
        //Create HashSet and add elements
        HashSet<String> set = new HashSet<>(Set.of("watermelon", "banana", "cherry", "strawberry"));
        //Print the HashSet values
        System.out.println("HashSet of fruits: " + set);
        //Check for the empty set
        System.out.println("Is the set is empty: " + set.isEmpty());
        //Clearing the set and check for the empty set
        set.clear();
        System.out.println("After clearing the values from set:");
        System.out.println("Is the set is empty: " + set.isEmpty());
        //Additional check
        System.out.println("Is the set is empty through size method: " + (set.size() == 0));
        return true;
    }

    /**
     * This method create empty Set collections and throw exception when elements are added
     */
    static void CheckCollectionsEmptySetThroughAddingElements() {
        System.out.println("*****EMPTY SET*****");
        //Create an empty set
        Set<String> emptyset = Collections.emptySet();
        System.out.println("Created empty immutable set: " + emptyset);
        System.out.println("Set is empty, let's try to add some fruit");
        //try to add elements
        emptyset.add("watermelon");
    }

    /**
     * This method check if HashMap is empty
     */
    static void CheckIfMapIsEmpty() {
        System.out.println("*****IS EMPTY HASHMAP*****");
        //Create HashSet & add fruits with amount
        HashMap<String, Integer> map = new HashMap<>(Map.of("watermelon", 1,"banana", 2, "cherry", 3, "strawberry", 4));
        //Print the HashSet values
        System.out.println("HashMap of fruits: " + map);
        //Check for the empty set
        System.out.println("Is the map is empty: " + map.isEmpty());
        //Clearing the set and check for the empty set
        map.clear();
        System.out.println("After clearing the values from map:");
        System.out.println("Is the map is empty: " + map.isEmpty());
        //Additional check
        System.out.println("Is the map is empty through size method: " + (map.size() == 0));
    }

    /**
     * This method create empty Set collections and throw exception when elements are added
     */
    static void CheckCollectionsEmptyMapThroughAddingElements() {
        System.out.println("*****EMPTY MAP*****");
        //Create an empty map
        Map<String, Integer> emptymap = Collections.emptyMap();
        System.out.println("Created empty immutable map: " + emptymap);
        System.out.println("Map is empty, let's try to add some fruit");
        //try to add elements
        emptymap.put("watermelon", 1);
    }

    public static void main(String[] args) {
        CheckIfSetIsEmpty();
        System.out.println(" ");
        CheckIfMapIsEmpty();
        System.out.println("");
        System.out.println("This methods will throw an exception !\n" +
                "The emptySet() & emptyMap() methods are used to get the set/map which is immutable so adding elements will throw exception.");
        CheckCollectionsEmptySetThroughAddingElements();
        CheckCollectionsEmptyMapThroughAddingElements();
    }
}
