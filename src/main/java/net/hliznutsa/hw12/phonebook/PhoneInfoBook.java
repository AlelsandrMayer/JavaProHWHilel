package net.hliznutsa.hw12.phonebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhoneInfoBook {
    private List<Notation> notes;

    public PhoneInfoBook() {
        notes = new LinkedList<>();
    }

    public void add(Notation notation) {
        this.notes.add(notation);
    }

    public Notation find(String name) {
        for (Notation note : this.notes) {
            if (note.getName().equalsIgnoreCase(name)) {
                return note;
            }
        }
        return null;
    }

    public List<Notation> findAll(String name) {
        List<Notation> foundNotes = new ArrayList<>();
        for (Notation note : notes) {
            if (note.getName().equalsIgnoreCase(name)) {
                foundNotes.add(note);
            }
        }
        return foundNotes.isEmpty() ? null : foundNotes;
    }
}
