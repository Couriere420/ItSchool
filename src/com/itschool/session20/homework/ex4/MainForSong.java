package com.itschool.session20.homework.ex4;

public class MainForSong {
    public static void main(String[] args) {
        Song song1 = new Song("Bora-Bora","Arash",15);
        Song song2 = new Song("Bora-Bora","Arash",15);
        Song song3 = new Song("Could you be Love","Bob-Marley",15);

        System.out.println("student1.equals(student2): " + song1.equals(song2));
        System.out.println("student1.hashCode() == student2.hashCode(): " +
                (song1.hashCode() == song2.hashCode()));

        System.out.println("student1.equals(student3): " + song1.equals(song3));
        System.out.println("student1.hashCode() == student3.hashCode(): " +
                (song1.hashCode() == song3.hashCode()));

    }
}
