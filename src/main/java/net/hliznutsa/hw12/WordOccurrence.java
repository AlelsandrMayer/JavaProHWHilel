package net.hliznutsa.hw12;

public class WordOccurrence {
    private String name;
    private int occurrence;


    public WordOccurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{name: \"" + this.name + "\", occurrence: " + occurrence + "}";
    }
}
