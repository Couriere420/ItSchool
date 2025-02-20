package com.itschool.session19.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // 1. Append element to end of linked list
        System.out.println("1. Append element to end of linked list");
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        System.out.println("LinkedList" + list);

        // 2. Iterate through all elements

        System.out.println("2.Iterating through elements:");
        for (String lists : list) {
            System.out.println(lists);
        }
        // 3. Iterate from specified position
        System.out.println("3.Iterating from position 1:");
        Iterator<String> stringIterator = list.listIterator(1);
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());

        }
        // 4. Iterate in reverse order
        System.out.println("4.Iterate in reverse order");
        Iterator<String> reverseIterator = list.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
        // 5. Insert element at specified position
        System.out.println("5. Insert element at specified position");
        list.add(2, "Black");
        System.out.println("After inserting at position 2:" + list);

        // 6. Insert elements at first and last position
        System.out.println("6. Insert elements at first and last position");
        list.addFirst("Purple");
        list.addLast("Rose");
        System.out.println("After inserting first and last " + list);

        // 7. Insert at front
        System.out.println("7. Insert at front");
        list.offerFirst("Grey");
        System.out.println("After inserting at front" + list);

        //8. Insert at end
        System.out.println("8. Insert at end");
        list.offerLast("White");
        System.out.println("After inserting at end" + list);

        // 9. Insert multiple elements at a specified position
        System.out.println("9. Insert multiple elements at a specified position");
        list.addAll(3, Arrays.asList("Pink", "Gray"));
        System.out.println("\nAfter inserting multiple elements: " + list);

        // 10. Get first and last element
        System.out.println("10. Get first and last element");
        System.out.println("\nFirst element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 11. Display elements with positions
        System.out.println("11.Elements with positions:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }

        // 12. Remove specified element
        System.out.println("12. Remove specified element");
        list.remove("Gray");
        System.out.println("\nAfter removing 'Gray': " + list);

        // 13. Remove first and last element
        System.out.println("13. Remove first and last element");
        list.removeFirst();
        list.removeLast();
        System.out.println("\nAfter removing first and last: " + list);

        // 14. Remove all elements
        System.out.println("// 14. Remove all elements");
        list.clear();
        System.out.println("\nAfter clearing: " + list);

        // 15. Swap two elements
        System.out.println("// 15. Swap two elements");
        list.addAll(Arrays.asList("A", "B", "C", "D"));
        Collections.swap(list, 1, 3);
        System.out.println("\nAfter swapping B and D: " + list);

        // 16. Shuffle elements
        System.out.println("16. Shuffle elements");
        Collections.shuffle(list);
        System.out.println("\nAfter shuffling: " + list);

        // 17. Join two linked lists
        System.out.println("17. Join two linked lists");
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("E", "F"));
        list.addAll(list2);
        System.out.println("\nAfter joining lists: " + list);

        // 18. Clone linked list
        System.out.println("18. Clone linked list");
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("\nCloned list: " + clonedList);

        // 19. Remove and return first element
        System.out.println("19. Remove and return first element");
        System.out.println("\nRemoved first element: " + list.pollFirst());
        System.out.println("After removing first element: " + list);

        // 20. Retrieve but not remove first element
        System.out.println("20. Retrieve but not remove first element");
        System.out.println("\nFirst element (not removed): " + list.peekFirst());

    }
}
