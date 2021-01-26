package com.epam.prejap.ess.helpers.empty_methods_maps_sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Class which check empty methods on collections for maps and sets
 */
public class HashSetOrHashMapIsEmptyCheck {

    /**
     * This method check if HashSet is empty
     */
    static void CheckIfSetIsEmpty() {
        System.out.println("*****IS EMPTY HASHSET*****");
        //Create HashSet and add elements
        HashSet<String> set = new HashSet<>(List.of("watermelon", "banana", "cherry", "strawberry"));
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
    }

    /**
     * This method check if HashMap is empty
     */
    static void CheckIfMapIsEmpty() {
        System.out.println("*****IS EMPTY HASHMAP*****");
        //Create HashSet
        HashMap<String, Integer> map = new HashMap<>();
        //Add fruits with amount
        map.put("watermelon", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("strawberry", 4);
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

    public static void main(String[] args) {
        CheckIfSetIsEmpty();
        System.out.println(" ");
        CheckIfMapIsEmpty();
    }
}
