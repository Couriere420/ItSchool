package com.itschool.session19.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        listDemo();
    }

    private static void listDemo() {
        // 1. Create an ArrayList and add some colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        System.out.println("1.Colors :" + colors);

        // 2. Iterate through all elements
        System.out.println("2.\nIterating through elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 3. Insert an element at first position
        colors.add(0, "Red");
        System.out.println("3.\nAfter inserting at first position: " + colors);


        // 4. Retrieve an element at a specified index
        //colors.get(2);
        System.out.println("4.\nElement at index 2: " + colors.get(2));

        // 5. Update specific array element
        colors.set(1, "Orange");
        System.out.println("5.\nAfter updating: " + colors);

        // 6. Remove the third element
        colors.remove(2);
        System.out.println("6.\nAfter removing third element: " + colors);

        // 7. Search an element
        String searchColor = "Blue";
        System.out.println("7.\nList contains '" + searchColor + "': " + colors.contains(searchColor));

        // 8. Sort the array list
        Collections.sort(colors);
        System.out.println("8.\nSorted list: " + colors);

        // 9. Copy one array list into another
        ArrayList<String> colorsCopy = new ArrayList<>(colors);
        System.out.println("9.\nCopied list: " + colorsCopy);

        // 10. Shuffle elements
        Collections.shuffle(colors);
        System.out.println("10.\nShuffled list: " + colors);

        // 11. Reverse elements
        Collections.reverse(colors);
        System.out.println("11.\nReversed list: " + colors);

        // 12. Extract a portion of the list
        List<String> subList = colors.subList(1, 3);
        System.out.println("12.\nExtracted portion: " + subList);

        // 13. Compare two lists
        System.out.println("13.\nAre colors and colorsCopy equal? " + colors.equals(colorsCopy));

        // 14. Swap two elements
        Collections.swap(colors, 0, 2);
        System.out.println("14.\nAfter swapping: " + colors);

        // 15. Join two lists
        ArrayList<String> moreColors = new ArrayList<>(Arrays.asList("Black", "White"));
        colors.addAll(moreColors);
        System.out.println("15.\nJoined list: " + colors);

        // 16. Clone an ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) colors.clone();
        System.out.println("16.\nCloned list: " + clonedList);

        // 17. Empty an ArrayList
        colors.clear();
        System.out.println("17.\nAfter clearing: " + colors);

        // 18. Test if an ArrayList is empty
        System.out.println("18.\nIs the list empty? " + true);

        // 19. Trim capacity
        colors.trimToSize();
        System.out.println("19.\nAfter trimming capacity: " + colors);

        // 20. Increase size of an ArrayList
        colors.ensureCapacity(10);
        System.out.println("20\nIncreased capacity.");
    }

}
