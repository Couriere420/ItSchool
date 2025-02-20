package com.itschool.session19.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import static com.itschool.session19.hashset.HashSetChallenge.*;

public class MainTest {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        HashSet<String> set2 = new HashSet<>(Arrays.asList("Banana", "Cherry", "Date"));

        appendElement(set1, "Orange");
        iterateElements(set1);
        System.out.println("Size of set: " + getSize(set1));
        emptySet(set1);
        System.out.println("Is empty: " + isEmpty(set1));

        set1.addAll(Arrays.asList("Apple", "Banana", "Cherry"));
        HashSet<String> clonedSet = cloneSet(set1);
        System.out.println("Cloned set: " + clonedSet);

        String[] array = toArray(set1);
        System.out.println("Array: " + Arrays.toString(array));

        TreeSet<String> treeSet = toTreeSet(set1);
        System.out.println("TreeSet: " + treeSet);

        ArrayList<String> arrayList = toArrayList(set1);
        System.out.println("ArrayList: " + arrayList);

        System.out.println("Are sets equal? " + compareSets(set1, set2));

        HashSet<String> commonElements = retainCommonElements(new HashSet<>(set1), set2);
        System.out.println("Common elements: " + commonElements);

        removeAllElements(set1);
        System.out.println("Set after removal: " + set1);
    }
}

