package net.hliznutsa.hw12.phonebook;

public class Notation {
    private String name;


    private String phoneNumber;

    public Notation(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: \"" + this.name + "\". Phone: \"" + this.phoneNumber + "\"";
    }
}
