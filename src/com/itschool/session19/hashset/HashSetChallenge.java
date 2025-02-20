package com.itschool.session19.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetChallenge {
    // 1. Append an element to the end of a hash set
    public static void appendElement(HashSet<String> set, String element) {
        set.add(element);
        System.out.println("After adding element: " + set);
    }

    // 2. Iterate through all elements in a hash set
    public static void iterateElements(HashSet<String> set) {
        for (String element : set) {
            System.out.println(element);
        }
    }

    // 3. Get the number of elements in a hash set
    public static int getSize(HashSet<String> set) {
        return set.size();
    }

    // 4. Empty a hash set
    public static void emptySet(HashSet<String> set) {
        set.clear();
        System.out.println("Hash set emptied.");
    }

    // 5. Test if a hash set is empty or not
    public static boolean isEmpty(HashSet<String> set) {
        return set.isEmpty();
    }

    // 6. Clone a hash set to another hash set
    public static HashSet<String> cloneSet(HashSet<String> set) {
        return (HashSet<String>) set.clone();
    }

    // 7. Convert a hash set to an array
    public static String[] toArray(HashSet<String> set) {
        return set.toArray(new String[0]);
    }

    // 8. Convert a hash set to a tree set
    public static TreeSet<String> toTreeSet(HashSet<String> set) {
        return new TreeSet<>(set);
    }

    // 9. Convert a hash set to a List/ArrayList
    public static ArrayList<String> toArrayList(HashSet<String> set) {
        return new ArrayList<>(set);
    }

    // 10. Compare two hash sets
    public static boolean compareSets(HashSet<String> set1, HashSet<String> set2) {
        return set1.equals(set2);
    }

    // 11. Retain common elements in two sets
    public static HashSet<String> retainCommonElements(HashSet<String> set1, HashSet<String> set2) {
        set1.retainAll(set2);
        return set1;
    }

    // 12. Remove all elements from a hash set
    public static void removeAllElements(HashSet<String> set) {
        set.clear();
    }
}
