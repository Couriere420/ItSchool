package com.itschool.session20.homework.ex7;

public class MainForEntity {
    public static void main(String[] args) {
        Entity entity1 = new Entity("John",5,123456789L);
        Entity entity2 = new Entity("John",5,123786789L);
        Entity entity3 = new Entity("John",8,788126789L);

        System.out.println("entity1.equals(entity2): " + entity1.equals(entity2));
        System.out.println("entity1.hashCode() == entity2.hashCode(): "
                + (entity1.hashCode() == entity2.hashCode()));

        System.out.println("entity1.equals(entity3): " + entity1.equals(entity3));
        System.out.println("entity1.hashCode() == entity3.hashCode(): "
                + (entity1.hashCode() == entity3.hashCode()));
    }
}
