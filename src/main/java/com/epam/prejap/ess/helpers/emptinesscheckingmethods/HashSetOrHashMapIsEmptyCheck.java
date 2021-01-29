package com.epam.prejap.ess.helpers.emptinesscheckingmethods;

import java.util.*;

/**
 * <p>Class which check empty methods on collections for maps and sets</p>
 *
 * @author Norbert Borek
 * @version 1.3
 * @since 1.3
 */
class HashSetOrHashMapIsEmptyCheck implements SetAndMap {

    /**
     * This method check if HashSet or HashMap is empty
     * Create HashSet or HashMap and add elements
     * Print the set/map values
     * Clearing the set/map and check for the empty set
     */
    @Override
    public boolean checkIfSetOrMapIsEmpty() {
        System.out.println("*****IS EMPTY HASHSET/HASHMAP*****");
        //Create HashSet and add elements
        HashSet<String> set = new HashSet<>(Set.of("watermelon", "banana", "cherry", "strawberry"));
        HashMap<String, Integer> map = new HashMap<>(Map.of("watermelon", 1, "banana", 2, "cherry", 3, "strawberry", 4));
        //Print the HashSet & HashMap values
        System.out.println("HashSet of fruits: " + set + "\nHashMap of fruits :" + map);
        //Check for the empty set
        System.out.println("Is the set is empty: " + set.isEmpty() + "\nIs the map is empty: " + map.isEmpty());
        //Clearing the set and check for the empty set
        set.clear();
        map.clear();
        System.out.println("After clearing the values from set/map:");
        System.out.println("Is the set is empty: " + set.isEmpty() + "\nIs the map is empty: " + map.isEmpty());
        //Additional check
        System.out.println("Is the set is empty through size method: " + (set.size() == 0));
        System.out.println("Is the map is empty through size method: " + (map.size() == 0));
        return false;
    }

    /**
     * This method create empty Set or empty Map collections and throw exception when elements are added
     */
    @Override
    public void CheckCollectionsEmptyMapOrEmptySetThroughAddingElements() {
        System.out.println("*****EMPTY MAP & EMPTY SET*****");
        //Create an empty map / set
        Map<String, Integer> emptymap = Collections.emptyMap();
        Set<String> emptyset = Collections.emptySet();
        System.out.println("Created empty immutable map: " + emptymap + "\nCreated empty immutable set: " + emptyset);
        System.out.println("Map/set is empty, let's try to add some fruit");
        System.out.println("This methods will throw an UnsuportedOperationException (Unchecked Exception) !\n" +
                "The emptySet() & emptyMap() methods are used to get the set/map which is immutable so adding elements will throw exception.");
        //try to add elements
        emptymap.put("watermelon", 1);
        emptyset.add("watermelon");
    }

    public static void main(String[] args) {
        //TEST
        SetAndMap setandmap = new HashSetOrHashMapIsEmptyCheck();
        //CheckIfSetOrMapIsEmpty();
        setandmap.checkIfSetOrMapIsEmpty();
        System.out.println("");
        setandmap.CheckCollectionsEmptyMapOrEmptySetThroughAddingElements();
    }
}
