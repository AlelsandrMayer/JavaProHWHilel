package net.hliznutsa.hw12.phonebook;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneInfoBook phoneInfoBook = new PhoneInfoBook();
        phoneInfoBook.add(new Notation("Барак Обама", "1234567890"));
        phoneInfoBook.add(new Notation("Джо Байден", "9876543210"));
        phoneInfoBook.add(new Notation("Барак Обама", "5555555555"));


        Notation notation = phoneInfoBook.find("Барак Обама");
        if (notation != null) {
            System.out.println(notation);
        }

        List<Notation> notes = phoneInfoBook.findAll("Барак Обама");

        if (notes != null) {
            for (Notation note : notes) {
                System.out.println(note);
            }
        }
    }
}
